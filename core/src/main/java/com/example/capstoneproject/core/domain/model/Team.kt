package com.example.capstoneproject.core.domain.model

import android.os.Parcelable

@kotlinx.parcelize.Parcelize
data class Team(
    val id: String,
    val team: String,
    val league: String,
    val badge: String,
    val stadium: String,
    val location: String,
    val desc: String,
    val isFavorite: Boolean
) : Parcelable
