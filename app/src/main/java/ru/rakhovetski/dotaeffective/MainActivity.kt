package ru.rakhovetski.dotaeffective

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*

import androidx.compose.runtime.*
import androidx.core.view.WindowCompat
import ru.rakhovetski.dotaeffective.ui.theme.DotaEffectiveTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            DotaEffectiveTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}


@Preview
@Composable
fun DefaultPreview() {
    val myColor = Color(5, 11, 26, 255)
    LazyColumn(
        Modifier
            .background(myColor)
            .fillMaxSize()
    ) {
        item {
            Header()
        }

        item {
            HeaderDotaIcon()
        }

        item {
            HeaderTag()
        }

        item {
            DescriptionDota()
        }

        item {
            SliderDota()
        }

        item {
            ReviewTitle()
        }

        item {
            ReviewRating()
        }

        item {
            ShowComments()
        }

        item {
            InstallButton()
        }

    }
}



