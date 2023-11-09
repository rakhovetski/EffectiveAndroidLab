package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun HeaderTag() {
    Box(
        modifier = Modifier
            .padding(top = 20.dp)
    ) {
        Row(
            modifier = Modifier
        ) {
            displayTag(tagName = "MOBA")
            displayTag(tagName = "MULTIPLAYER")
            displayTag(tagName = "STRATEGY")
        }
    }
}


@Composable
fun displayTag(tagName: String) {
    val backTagColor = Color(15, 68, 107, 255)
    val textTagColor = Color(68, 169, 244, 255)
    Box(modifier = Modifier
        .padding(start = 20.dp)
        .border(
            BorderStroke(1.dp, backTagColor),
            shape = RoundedCornerShape(50)
        )
        .background(backTagColor, shape = RoundedCornerShape(50))
    ) {
        Text(text = tagName, color = textTagColor, fontSize = 9.sp
            , modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 2.dp))
    }
}