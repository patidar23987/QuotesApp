package com.cb.cleanarchitecture.Presentation.screen.DetailScreen.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailQuotes(){
    Card( modifier =  Modifier
        .fillMaxWidth()
        .height(250.dp)
        .padding(15.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {

            Text(text = "total data of qoutes",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color.Black,
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.padding(5.dp))

            Text(text = " date of qoutes",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                fontSize = 12.sp,
                textAlign = TextAlign.End,
                fontWeight = FontWeight.W300
            )

    }
}






}
@Composable
@Preview
fun DetailQuotesPreview(){
    DetailQuotes()
}