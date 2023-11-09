package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun ReviewRating() {
    Row(modifier = Modifier
        .padding(start = 20.dp)){
        Text("4.9", fontWeight = FontWeight.ExtraBold, fontSize = 40.sp, color= Color.White)
        Column(modifier = Modifier
            .padding(start = 15.dp)
            .padding(top = 8.dp)) {
            Text("★ ★ ★ ★ ★", color = Color.Yellow)
            Text("70M Reviews", fontSize=12.sp,color= Color.Gray, modifier = Modifier.padding(top=4.dp))
        }
    }
}