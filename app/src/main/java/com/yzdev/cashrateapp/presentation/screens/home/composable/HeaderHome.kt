@file:OptIn(ExperimentalMaterialApi::class)

package com.yzdev.cashrateapp.presentation.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yzdev.cashrateapp.common.getColorThemeText

@Composable
fun HeaderHome(
    title: String = "Title Main",
    subtitle: String = "Subtitle for more information",
    date: String = "07/12/2022 10:00 AM",
    coinTitle: String = "$",
    onClickMenu: ()-> Unit = {},
    onClickCoin: ()-> Unit = {}
) {

    val height = LocalConfiguration.current.screenHeightDp.dp

    Box {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(height * 0.3f)
                .padding(8.dp),
            backgroundColor = MaterialTheme.colors.primary,
            elevation = 0.dp,
            shape = RoundedCornerShape(24.dp)
        ) {
            HeaderContent(
                title = title,
                subtitle = subtitle,
                date = date,
                onClickMenu = {
                    onClickMenu()
                }
            )
        }

        CoinButton(
            coinTitle = coinTitle,
            onClickCoin = {
                onClickCoin()
            }
        )
    }
}

@Composable
private fun HeaderContent(
    title: String,
    subtitle: String,
    date: String,
    onClickMenu: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBarHome(
            date = date,
            clickMenu = {
                onClickMenu()
            }
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold),
                color = getColorThemeText(),
                textAlign = TextAlign.Center
            )

            Text(
                text = subtitle,
                style = MaterialTheme.typography.subtitle2,
                color = getColorThemeText(),
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.padding(24.dp))
    }
}

@Composable
private fun CoinButton(
    coinTitle: String,
    onClickCoin: () -> Unit
) {

    val height = LocalConfiguration.current.screenHeightDp.dp

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height((height * 0.3f) + (height * 0.075f))
            .padding(8.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(
            modifier = Modifier
                .width((height * 0.075f) * 2)
                .height((height * 0.075f) * 2)
                .clip(RoundedCornerShape(256.dp))
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                elevation = 2.dp,
                shape = RoundedCornerShape(256.dp),
                backgroundColor = MaterialTheme.colors.primary,
                onClick = {
                    onClickCoin()
                }
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(
                        text = coinTitle,
                        style = MaterialTheme.typography.h2.copy(fontWeight = FontWeight.Bold, color = MaterialTheme.colors.secondary),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

/*
@Preview(showSystemUi = true)
@Composable
fun PreviewHeader() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        HeaderHome()
    }
}*/
