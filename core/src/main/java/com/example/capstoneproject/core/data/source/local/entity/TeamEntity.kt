package com.example.capstoneproject.core.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "teams")
data class TeamEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "team")
    var team: String,

    @ColumnInfo(name = "league")
    var league: String,

    @ColumnInfo(name = "badge")
    var badge: String,

    @ColumnInfo(name = "stadium")
    var stadium: String,

    @ColumnInfo(name = "isFavorite")
    var isFavorite: Boolean = false,

    @ColumnInfo(name = "location")
    var location: String,

    @ColumnInfo(name = "desc")
    var desc: String,
)
