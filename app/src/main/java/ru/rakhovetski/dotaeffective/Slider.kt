package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt


@Preview
@Composable
fun SliderDota() {
    Box() {
        ImageSlider(
            imageList = listOf(
                R.drawable.gameplay,
                R.drawable.gameplay,
                R.drawable.gameplay
            ),
            slideWidth = 200.dp,
            slideHeight = 150.dp
        )
    }
}

@Composable
fun ImageSlider(
    imageList: List<Int>,
    slideWidth: Dp,
    slideHeight: Dp
) {
    var offsetX by remember { mutableStateOf(0f) }
    val listState = rememberLazyListState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectHorizontalDragGestures { change, _ ->
                    change.consumeAllChanges()
                    offsetX += change.positionChange().x
                }
            }
    ) {
        LazyRow(state = listState) {
            items(imageList.size) { index ->
                val painter: Painter = painterResource(imageList[index])
                Image(
                    painter = painter,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .width(slideWidth)
                        .height(slideHeight)
                        .offset { IntOffset(offsetX.roundToInt(), 0) }
                )
            }
        }
    }
}