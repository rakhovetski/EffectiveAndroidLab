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
fun DescriptionDota(){
    Box(
    modifier = Modifier
    .padding(start = 20.dp)
    .padding(top = 20.dp)

    ) {
        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game" +
                    " which has two teams of five players compete to collectively " +
                    "destroy a large structure defended by the opposing team" +
                    " known as the \"Ancient\", whilst defending their own.",
            color = Color.Gray,
            fontSize = 13.sp,
            modifier = Modifier

        )
    }
}