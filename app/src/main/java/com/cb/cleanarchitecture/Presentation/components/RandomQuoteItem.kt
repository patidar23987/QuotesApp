package com.cb.cleanarchitecture.Presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.random.Random

@Composable
fun RandomQuote(){

    QuoteItem(
        color = Color.Blue,
        textColor = Color.White
    )
}
@Preview
@Composable
fun RandomQuotePreview(){
    RandomQuote()
}