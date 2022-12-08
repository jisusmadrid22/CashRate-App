package com.yzdev.cashrateapp.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.yzdev.cashrateapp.presentation.screens.home.composable.HeaderHome

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

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn {
            item {
                HeaderHome()
            }
        }
    }
}