package com.cb.cleanarchitecture.Presentation.screen.DetailScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cb.cleanarchitecture.Presentation.components.ToolBarComponents
import com.cb.cleanarchitecture.Presentation.screen.DetailScreen.Components.DetailQuotes


@Composable
fun DetailScreen(
    onBackPress :() -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ToolBarComponents(

                ShowBackButton = true,
                title = "Detail",
                onBackPress ={
                    onBackPress()
                }
            )
        }

    ) {
        PaddingValues->

        Box(modifier = Modifier.fillMaxSize()
            .padding(PaddingValues)
            .background(Color.LightGray),
            contentAlignment = Alignment.Center
        )
        {
          DetailQuotes()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DetailScreenPreview(){
    DetailScreen{}

}