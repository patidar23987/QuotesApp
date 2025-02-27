package com.cb.cleanarchitecture.Presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeadingTitle(
    title : String
)
{
Text(
    text = title,
    color = Color.Black,
    fontStyle = FontStyle.Italic,
    fontWeight = FontWeight.W400,
    fontSize = 16.sp,
    modifier = Modifier.fillMaxWidth()
        .padding(vertical = 12.dp),
)
}
@Preview(showBackground = true)
@Composable
fun HeadingTitlePreview(){
    HeadingTitle("Rendom Quote")
}