package com.yzdev.cashrateapp.presentation.screens.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yzdev.cashrateapp.presentation.screens.menu.composable.HeaderMenu

@Composable
fun MenuScreen(
    date: String = "07/12/2022 10:00 AM",
    onClickChangeTheme: ()-> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        HeaderMenu(
            date = date,
            onClickChangeTheme = {
                onClickChangeTheme()
            }
        )
    }
}