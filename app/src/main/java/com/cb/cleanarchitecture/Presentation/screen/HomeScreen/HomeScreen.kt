package com.cb.cleanarchitecture.Presentation.screen.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cb.cleanarchitecture.Presentation.components.HomeBody
import com.cb.cleanarchitecture.Presentation.components.ToolBarComponents

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreen(
    onClick : () ->  Unit

){
    Scaffold (modifier = Modifier
        .fillMaxSize(),
        topBar = {
    ToolBarComponents (title ="Home"){
    }
    }

    ){
        paddingValues->
        Box(
            modifier = Modifier
                .fillMaxSize()
            .padding(paddingValues)
                .background(Color.White),
            contentAlignment = Alignment.Center)
        {
             HomeBody(onClick = onClick)
  }

    }
}
@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen{}
}