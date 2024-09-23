package com.example.carcrud.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cars")
data class Car(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val modelo: String,
    val ano: Int,
    val cor: String,
    val marca: String,
    val placa: String
)
