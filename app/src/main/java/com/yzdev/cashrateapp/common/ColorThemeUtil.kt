package com.yzdev.cashrateapp.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.yzdev.cashrateapp.presentation.ui.theme.BlackMain
import com.yzdev.cashrateapp.presentation.ui.theme.WhiteMain

@Composable
fun getColorThemeText(): Color{
    return if (isSystemInDarkTheme()){
        BlackMain
    }else{
        WhiteMain
    }
}

@Composable
fun getColorThemeTextBackground(): Color{
    return if (!isSystemInDarkTheme()){
        BlackMain
    }else{
        WhiteMain
    }
}