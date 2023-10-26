package com.example.capstoneproject.core.utils

import com.example.capstoneproject.core.data.source.local.entity.TeamEntity
import com.example.capstoneproject.core.data.source.remote.response.TeamsItem
import com.example.capstoneproject.core.domain.model.Team

object DataMapper {
    fun mapResponsesToEntities(input: List<TeamsItem>): List<TeamEntity> {
        val teamList = ArrayList<TeamEntity>()
        input.map {
            val team = TeamEntity(
                id = it.idTeam,
                team = it.strTeam,
                league = it.strLeague,
                badge = it.strTeamBadge,
                stadium = it.strStadium,
                location = it.strStadiumLocation,
                desc = it.strDescriptionEN,
                isFavorite = false
            )
            teamList.add(team)
        }
        return teamList
    }

    fun mapEntitiesToDomain(input: List<TeamEntity>): List<Team> =
        input.map {
            Team(
                id = it.id,
                team = it.team,
                league = it.league,
                badge = it.badge,
                stadium = it.stadium,
                location = it.location,
                desc = it.desc,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Team) = TeamEntity(
        id = input.id,
        team = input.team,
        league = input.league,
        badge = input.badge,
        stadium = input.stadium,
        location = input.location,
        desc = input.desc,
        isFavorite = input.isFavorite
    )
}