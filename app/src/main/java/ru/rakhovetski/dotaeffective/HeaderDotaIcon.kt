package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun HeaderDotaIcon() {
    val borderShape = RoundedCornerShape(20)
    Box(
    modifier = Modifier
    .padding(horizontal = 20.dp)
    ) {
        Row() {
            Box(
                modifier = Modifier
                    .border(
                        BorderStroke(1.dp, Color.Gray),
                        shape = borderShape
                    )
                    .background(
                        colorResource(R.color.black),
                        shape = borderShape
                    )

            )
            {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.dota_icon),
                    contentDescription = "Dota icon",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(13.dp)
                )

            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 25.dp)
                ) {
                    Text("DoTA 2", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
                }
                Row() {

                    Text("★ ★ ★ ★ ★", color = Color.Yellow)

                    Text(
                        "70M", fontSize = 12.sp, color = Color.White, modifier = Modifier
                            .padding(horizontal = 5.dp, vertical = 2.dp)
                    )
                }
            }
        }
    }
}