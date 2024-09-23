package com.example.carcrud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.carcrud.data.AppContainer
import com.example.carcrud.ui.navigation.CarNavGraph
import com.example.carcrud.ui.theme.CarCrudTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarCrudTheme{
                val appContainer = AppContainer(applicationContext)
                val pessoaRepository = appContainer.carRepository
                val navController = rememberNavController()
                CarNavGraph(navController = navController, carRepository = pessoaRepository)
            }
        }
    }
}
