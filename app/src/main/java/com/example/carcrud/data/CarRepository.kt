package com.example.carcrud.data

import kotlinx.coroutines.flow.Flow

open class CarRepository(private val carDao: CarDao) {
    fun getAllCarros(): Flow<List<Car>> = carDao.getAllCarros()

    fun getCarroById(id: Int): Flow<Car> = carDao.getCarroById(id)

    suspend fun insertCarro(car: Car) = carDao.insertCarro(car)

    suspend fun deleteCarro(car: Car) = carDao.deleteCarro(car)
}
