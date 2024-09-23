package com.example.carcrud.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface CarDao {
    @Query("SELECT * FROM cars")
    fun getAllCarros(): Flow<List<Car>>

    @Query("SELECT * FROM cars WHERE id = :id")
    fun getCarroById(id: Int): Flow<Car>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCarro(car: Car)

    @Delete
    suspend fun deleteCarro(car: Car)
}
