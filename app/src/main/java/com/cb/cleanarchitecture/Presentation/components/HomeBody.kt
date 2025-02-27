package com.cb.cleanarchitecture.Presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeBody(
    onClick : () -> Unit
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    )
    {
   item {
        HeadingTitle(title = "Rondam Quote")
        RandomQuotePreview()
    }
        item { HeadingTitle(title = "Quotes")
        }
        items(10){
            QuoteItem(
                modifier = Modifier.clickable {
                    onClick()
                }
            )
        }
}
}
@Preview(showBackground = true)
@Composable
private fun HomeBodyPreview(){
    HomeBody{}
}