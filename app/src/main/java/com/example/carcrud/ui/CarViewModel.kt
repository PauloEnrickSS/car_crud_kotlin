package com.example.carcrud.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carcrud.data.CarRepository
import com.example.carcrud.data.Car
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class CarViewModel(private val repository: CarRepository) : ViewModel() {

    val carList: Flow<List<Car>> = repository.getAllCarros()

    fun getCarById(id: Int): Flow<Car> = repository.getCarroById(id)

    fun addOrUpdateCarro(id: Int? = null, nome: String, idade: Int, genero: String, profissao: String, nacionalidade: String) {
        val car = Car(id = id ?: 0, modelo = nome,  ano = idade, cor = genero, marca = profissao, placa = nacionalidade)
        viewModelScope.launch {
            repository.insertCarro(car)
        }
    }

    fun deleteCarro(car: Car) {
        viewModelScope.launch {
            repository.deleteCarro(car)
        }
    }
}
