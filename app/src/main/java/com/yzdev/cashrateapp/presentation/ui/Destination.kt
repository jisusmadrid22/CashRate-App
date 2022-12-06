package com.yzdev.cashrateapp.presentation.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.ui.graphics.vector.ImageVector

enum class Destination(val screenRoute: String, val title: String, val icon: ImageVector){
    HOME(
        screenRoute = "CSR_SCREEN:HOME",
        title = "Home",
        icon = Icons.Rounded.Home
    )
}