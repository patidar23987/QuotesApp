package com.cb.cleanarchitecture.Presentation.components

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBarComponents(
    ShowBackButton : Boolean = false,
    title :String = "",
    onBackPress : () -> Unit ={}

) {
TopAppBar(
    title = {
        Text(
            text = title,
            modifier = Modifier
            .fillMaxWidth(),
            fontSize = 18.sp,
            fontWeight = FontWeight.W800,
            textAlign = TextAlign.Center
        )
    },
    navigationIcon = {
        if (ShowBackButton) {
            IconButton(onClick = onBackPress) {
                Icon(
                    Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(30.dp)
                        .padding(8.dp))
            }
        }
    },
    actions = {
        if (ShowBackButton){
            Spacer(modifier = Modifier.size(30.dp))
        }
    }
  )
}
@Preview
@Composable
fun ToolBarComponentsPreview(){
    ToolBarComponents(
        ShowBackButton = true,
        title = "Home"
    )
}