package com.yzdev.cashrateapp.presentation.screens.menu.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.yzdev.cashrateapp.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yzdev.cashrateapp.common.AppResources
import com.yzdev.cashrateapp.common.getColorThemeText

@Composable
fun HeaderMenu(
    date: String,
    onClickChangeTheme: ()-> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = LocalConfiguration.current.screenHeightDp.dp * 0.2f)
            .padding(8.dp),
        backgroundColor = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(topEnd = 48.dp, topStart = 4.dp, bottomEnd = 4.dp, bottomStart = 4.dp),
        elevation = 0.dp
    ) {
        HeaderContent(
            date = date,
            onClickChangeTheme = {
                onClickChangeTheme()
            }
        )
    }
}

@Composable
private fun HeaderContent(
    date: String,
    onClickChangeTheme: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = LocalConfiguration.current.screenHeightDp.dp * 0.2f)
            .padding(top = 4.dp, end = 12.dp, start = 12.dp, bottom = 4.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = AppResources.getString(R.string.app_name),
                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold),
                color = getColorThemeText(),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.padding(1.dp))

            Text(
                text = date,
                style = MaterialTheme.typography.caption,
                color = getColorThemeText(),
                textAlign = TextAlign.Center
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { onClickChangeTheme() }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_sun),
                    contentDescription = "Change theme color",
                    tint = MaterialTheme.colors.primary
                )
            }

            Text(
                text = "VE",
                style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold),
                color = getColorThemeText(),
                textAlign = TextAlign.Center
            )
        }
    }
}