package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun ReviewTitle() {
    Box(modifier = Modifier
        .padding(start = 20.dp)) {
        Text("Review & Ratings", fontSize = 20.sp, color = Color.White)
    }
}