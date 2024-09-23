package com.example.carcrud.data

import android.content.Context
import androidx.room.Room

class AppContainer(context: Context) {
    private val database: CarDatabase by lazy {
        Room.databaseBuilder(context, CarDatabase::class.java, "bd_carros").build()
    }

    val carRepository: CarRepository by lazy {
        CarRepository(database.carDao())
    }
}