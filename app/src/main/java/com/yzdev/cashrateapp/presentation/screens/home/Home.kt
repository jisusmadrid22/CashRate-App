package com.yzdev.cashrateapp.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.yzdev.cashrateapp.presentation.screens.home.composable.HeaderHome
import com.yzdev.cashrateapp.presentation.screens.home.composable.SelectorList
import com.yzdev.cashrateapp.presentation.screens.menu.MenuScreen
import kotlinx.coroutines.launch

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
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val infoDolarToday = viewModel.stateInfoDolarToday.value

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        drawerContent = {
            MenuScreen(
                onClickChangeTheme = {

                }
            )
        },
        drawerShape = RoundedCornerShape(topEnd = 48.dp, bottomStart = 0.dp, topStart = 0.dp, bottomEnd = 0.dp),
        scaffoldState = scaffoldState
    ) {
        LazyColumn {
            item {
                HeaderHome(
                    onClickCoin = {

                    },
                    onClickMenu = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }
                )
            }

            item {
                SelectorList()
            }
        }
    }
}