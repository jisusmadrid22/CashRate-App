package com.yzdev.cashrateapp.presentation.screens.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yzdev.cashrateapp.common.getColorThemeText

@Composable
fun TopBarHome(
    date: String,
    clickMenu: ()-> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(end = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = {
                clickMenu()
            }
        ) {
            Icon(
                imageVector = Icons.Rounded.Menu,
                contentDescription = "Menu",
                tint = getColorThemeText()
            )
        }

        Text(
            text = date,
            style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
            color = getColorThemeText(),
            textAlign = TextAlign.End
        )
    }
}