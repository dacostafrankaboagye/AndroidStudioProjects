package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
//                    AppImage()
                    MyMainApp(
                        theHeading = stringResource(id = R.string.theHeadingText),
                        para1 = stringResource(id = R.string.paragraph1),
                        para2 = stringResource(id = R.string.paragraph2)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun AppText(modifier: Modifier = Modifier, theHeading:String, para1: String, para2: String) {

    Column(modifier = modifier) {
        Text(
            text = theHeading,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                bottom = 16.dp,
                end = 16.dp
            )
        )
        Text(
            text = para1,
            fontSize = 17.sp,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = para2,
            fontSize = 17.sp,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 30.dp,
                top = 16.dp
            ),
            textAlign = TextAlign.Justify
        )

    }

}

@Composable
fun AppImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale =  ContentScale.FillWidth
        )
    }

}

@Composable
fun MyMainApp(modifier: Modifier = Modifier, theHeading:String, para1: String, para2: String) {
    Column {
        AppImage()
        AppText(theHeading = theHeading, para1 = para1, para2 = para2)
    }
}

@Preview(
    showBackground = true,
    name = "LearnTogether",
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
//        Greeting("Android")
//        AppImage()
//        AppText(
//            theHeading = stringResource(id = R.string.theHeadingText),
//            para1 = stringResource(id = R.string.paragraph1),
//            para2 = stringResource(id = R.string.paragraph2)
//        )
        MyMainApp(
            theHeading = stringResource(id = R.string.theHeadingText),
            para1 = stringResource(id = R.string.paragraph1),
            para2 = stringResource(id = R.string.paragraph2)
        )
    }
}