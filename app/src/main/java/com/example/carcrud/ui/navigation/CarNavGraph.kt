package com.example.carcrud.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carcrud.data.CarRepository
import com.example.carcrud.ui.CarScreen
import com.example.carcrud.ui.CarViewModel
import com.example.carcrud.ui.CarViewModelFactory

@Composable
fun CarNavGraph(navController: NavHostController, carRepository: CarRepository) {
    val viewModel: CarViewModel = viewModel(factory = CarViewModelFactory(carRepository))

    NavHost(navController, startDestination = "carScreen") {
        composable("carScreen") { CarScreen(viewModel) }
    }
}
