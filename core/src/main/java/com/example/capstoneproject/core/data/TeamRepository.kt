package com.example.capstoneproject.core.data

import com.example.capstoneproject.core.data.source.local.LocalDataSource
import com.example.capstoneproject.core.data.source.remote.RemoteDataSource
import com.example.capstoneproject.core.data.source.remote.network.ApiResponse
import com.example.capstoneproject.core.data.source.remote.response.TeamsItem
import com.example.capstoneproject.core.domain.model.Team
import com.example.capstoneproject.core.domain.repository.ITeamRepository
import com.example.capstoneproject.core.utils.AppExecutors
import com.example.capstoneproject.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TeamRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors,
) : ITeamRepository {

    override fun getAllTeam(): Flow<Resource<List<Team>>> =
        object : NetworkBoundResource<List<Team>, List<TeamsItem>>(appExecutors) {
            override fun loadFromDB(): Flow<List<Team>> {
                return localDataSource.getAllTeam().map { DataMapper.mapEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<Team>?): Boolean = data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<TeamsItem>>> =
                remoteDataSource.getAllTeam()

            override suspend fun saveCallResult(data: List<TeamsItem>) {
                val teamList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertTeam(teamList)
            }
        }.asFlow()

    override fun getFavoriteTeam(): Flow<List<Team>> {
        return localDataSource.getFavoriteTeam().map { DataMapper.mapEntitiesToDomain(it) }
    }

    override fun setFavoriteTeam(team: Team, state: Boolean) {
        val teamEntity = DataMapper.mapDomainToEntity(team)
        appExecutors.diskIO().execute { localDataSource.setFavoriteTeam(teamEntity, state) }
    }
}

