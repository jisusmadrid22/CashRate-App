package com.yzdev.cashrateapp.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yzdev.cashrateapp.presentation.screens.home.HomeScreen
import com.yzdev.cashrateapp.presentation.screens.home.HomeViewModel
import com.yzdev.cashrateapp.presentation.ui.Destination

@Composable
fun Navigation() {
    val navigation = rememberNavController()

    NavHost(
        navController = navigation,
        startDestination = Destination.HOME.screenRoute
    ){
        composable(
            route = Destination.HOME.screenRoute
        ){
            val viewmodel = hiltViewModel<HomeViewModel>()

            Box(modifier = Modifier.fillMaxSize()){
                HomeScreen(viewModel = viewmodel, navHostController = navigation)
            }
        }
    }
}