package com.yzdev.cashrateapp.presentation.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.yzdev.cashrateapp.R
import com.yzdev.cashrateapp.common.AppResources
import com.yzdev.cashrateapp.common.composable.canvasUtil.LineCustom
import com.yzdev.cashrateapp.common.setColorTextByTheme

@Composable
fun SelectorList(

) {

    var heightLayout by remember {
        mutableStateOf(IntSize.Zero)
    }

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
        .onSizeChanged {
            heightLayout = it
        },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LabelSelector(label = AppResources.getString(R.string.favoritesTitle), isSelect = true)

        LineCustom(
            modifier = Modifier
                .height(heightLayout.height.dp * 0.5f)
                .width(1.dp)
                .background(MaterialTheme.colors.secondary)
        )

        LabelSelector(label = AppResources.getString(R.string.allTitle), isSelect = false)
    }
}

@Composable
private fun LabelSelector(
    label: String,
    isSelect: Boolean
) {
    Column(
        modifier = Modifier.width(LocalConfiguration.current.screenWidthDp.dp * 0.4f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold, color = setColorTextByTheme().copy(alpha = if(!isSelect){0.5f}else{1f})),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.padding(2.dp))

        if(isSelect){
            LineCustom(
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .height(1.dp)
                    .background(MaterialTheme.colors.secondary)
            )
        }
    }
}

/*
@Preview(showSystemUi = true)
@Composable
fun PreviewSelector(

) {
    Box(modifier = Modifier.fillMaxWidth()){
        SelectorList()
    }
}*/
