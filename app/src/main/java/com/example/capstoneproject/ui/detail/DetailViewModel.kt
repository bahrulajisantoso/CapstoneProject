package com.example.capstoneproject.ui.detail

import androidx.lifecycle.ViewModel
import com.example.capstoneproject.core.domain.model.Team
import com.example.capstoneproject.core.domain.usecase.TeamUseCase

class DetailViewModel(private val teamUseCase: TeamUseCase) : ViewModel() {
    fun setFavoriteTeam(team: Team, newStatus: Boolean) =
        teamUseCase.setFavoriteTeam(team, newStatus)
}

