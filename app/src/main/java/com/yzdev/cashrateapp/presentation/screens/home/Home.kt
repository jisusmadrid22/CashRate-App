package com.yzdev.cashrateapp.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    navHostController: NavHostController
) {
    HomeLayout(viewModel = viewModel, navHostController = navHostController)
}

@Composable
private fun HomeLayout(
    viewModel: HomeViewModel,
    navHostController: NavHostController
) {
    val infoDolarToday = viewModel.stateInfoDolarToday.value

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "USD: ${infoDolarToday.info?.USD?.dolartoday} Bs")
    }
}