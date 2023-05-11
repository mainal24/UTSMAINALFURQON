package com.mainal.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Superhero(
    var imgSuperhero: Int,
    var nameSuperhero: String,
    val descSuperhero: String
) : Parcelable {
    val itemId: Any
        get() {
            TODO()
        }
}

