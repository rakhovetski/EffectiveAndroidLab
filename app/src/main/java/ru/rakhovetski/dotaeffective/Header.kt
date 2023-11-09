package ru.rakhovetski.dotaeffective

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Header() {
    Box() {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.dota_header),
            contentDescription = "Dota header",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1.06f)
        )
    }
}
