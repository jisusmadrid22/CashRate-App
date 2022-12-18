package com.yzdev.cashrateapp.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.yzdev.cashrateapp.presentation.ui.theme.BlackMain
import com.yzdev.cashrateapp.presentation.ui.theme.WhiteMain

/** Funcion para colocar el color a los textos que estan dentro de un contenedor con background primario de acuerdo al modo del telefono*/
@Composable
fun getColorThemeText(): Color{
    return if (isSystemInDarkTheme()){
        BlackMain
    }else{
        WhiteMain
    }
}

/** Funcion para colocar el color a los textos que estan directos al background de acuerdo al modo del telefono*/
@Composable
fun setColorTextByTheme(): Color{
    return if (!isSystemInDarkTheme()){
        BlackMain
    }else{
        WhiteMain
    }
}

/** Funcion para colocar el color background a los contenedores dependiendo del tema del telefono*/
@Composable
fun setColorBackgroundByTheme(

): Color {
    return if(isSystemInDarkTheme()){
        Color.Black
    }else{
        Color.White
    }
}