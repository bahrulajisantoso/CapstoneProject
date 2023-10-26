package com.example.capstoneproject.core.domain.repository

import com.example.capstoneproject.core.data.Resource
import com.example.capstoneproject.core.domain.model.Team
import kotlinx.coroutines.flow.Flow

interface ITeamRepository {

    fun getAllTeam(): Flow<Resource<List<Team>>>

    fun getFavoriteTeam(): Flow<List<Team>>

    fun setFavoriteTeam(team: Team, state: Boolean)

}
