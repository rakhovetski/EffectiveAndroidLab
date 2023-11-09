package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun ShowComments() {
    Column(modifier = Modifier
        .padding(start = 20.dp)
        .padding(top = 10.dp)) {
        displayComment(imageId = R.drawable.funny_avatar, name = "Igor",
            date = "February 14, 2019",
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”")
        Divider(color = Color.LightGray, thickness = 1.dp)
        displayComment(imageId = R.drawable.funny_cat, name = "Monster Killer",
            date = "February 14, 2019",
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”")
    }
}

@Composable
fun displayComment(imageId: Int, name: String, date: String, text: String) {
    val imageBitMap = ImageBitmap.imageResource(imageId);
    Column(modifier = Modifier
        .padding(vertical = 20.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                bitmap = imageBitMap,
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = date,
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }
        }
        Text(
            text = text,
            color= Color.Gray,
            fontSize = 13.sp,
        )
    }
}