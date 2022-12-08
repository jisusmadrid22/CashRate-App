package com.yzdev.cashrateapp.common.composable.canvasUtil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LineCustom(
    sizeCustom: Dp = 1.dp,
    color: Color = MaterialTheme.colors.secondary,
    modifier: Modifier = Modifier.fillMaxWidth().height(sizeCustom).background(color),
) {
    Box(modifier = modifier)
}