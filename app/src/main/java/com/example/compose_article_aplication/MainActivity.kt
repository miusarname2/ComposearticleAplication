package com.example.compose_article_aplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article_aplication.ui.theme.ComposearticleAplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposearticleAplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //TextCreations(title = "Hello", contents = "Mundo")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposearticleAplicationTheme {
        TextCreations(title = "Jetpack Compose tutorial", contents = "Mundo", content = "Hermoso");
    }
}


@Composable
fun TextCreations(title: String, content: String,contents: String,modifier: Modifier = Modifier) {
    Column {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(
                16.dp,
                16.dp,
                16.dp,
                16.dp
            )
        );
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    16.dp,
                    0.dp,
                    16.dp
                )
        )
        Text(
            text = contents,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    16.dp,
                    0.dp,
                    16.dp
                )
        )
    }


}