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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yzdev.cashrateapp.common.setColorBackgroundByTheme
import com.yzdev.cashrateapp.common.setColorTextByTheme
import com.yzdev.cashrateapp.domain.model.DolarTodayResponse
import com.yzdev.cashrateapp.presentation.ui.theme.GreenSuccess
import com.yzdev.cashrateapp.presentation.ui.theme.Inter

@Composable
fun ListItemCashRateHome(
    item: DolarTodayResponse,
    onClickItem: (DolarTodayResponse)-> Unit
) {
    ListItemCashRateLayout(
        item = item,
        onClickItem = {
            onClickItem(it)
        }
    )
}

@Composable
private fun ListItemCashRateLayout(
    item: DolarTodayResponse,
    onClickItem: (DolarTodayResponse)-> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        backgroundColor = setColorBackgroundByTheme(),
        elevation = 0.dp,
        shape = RoundedCornerShape(12.dp),
        onClick = {
            onClickItem(item)
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .padding(horizontal = 4.dp)
            ) {
                Text(
                    text = item._labels.a,
                    style = TextStyle(
                        color = setColorTextByTheme(),
                        fontWeight = FontWeight.Bold,
                        fontFamily = Inter,
                        fontSize = MaterialTheme.typography.body1.fontSize
                    ),
                    textAlign = TextAlign.Center
                    //style = MaterialTheme.typography.body1.copy(color = setColorTextByTheme(), fontWeight = FontWeight.Bold)
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.3f)
                    .padding(horizontal = 4.dp)
            ) {
                Text(
                    text = "${item.USD.dolartoday} Bs",
                    style = TextStyle(
                        color = setColorTextByTheme(),
                        fontWeight = FontWeight.Bold,
                        fontFamily = Inter,
                        fontSize = MaterialTheme.typography.caption.fontSize
                    ),
                    textAlign = TextAlign.Center
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(horizontal = 4.dp)
            ) {
                Text(
                    text = "+5.65 %",
                    style = TextStyle(
                        color = GreenSuccess,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Inter,
                        fontSize = MaterialTheme.typography.caption.fontSize
                    ),
                    textAlign = TextAlign.Center
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp)
            ) {
                Text(text = "")
            }
        }
    }
}

/*
@Preview(showSystemUi = true)
@Composable
fun PreviewList(

) {
    Box(modifier = Modifier.fillMaxSize()) {
        ListItemCashRateLayout()
    }
}*/
