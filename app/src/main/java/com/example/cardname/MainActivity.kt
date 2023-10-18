package com.example.cardname

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardname.ui.theme.CardNameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardNameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardName()
                }
            }
        }
    }
}

@Composable
fun CardName() {
    Surface(color = Color.LightGray){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                val image = painterResource(id = R.drawable.android_logo)
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(top = 4.dp)
                )
                Text(
                    text = stringResource(R.string.FullName),
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontSize = 32.sp
                )
                Text(
                    text = stringResource(R.string.Title),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
            Column(
                modifier = Modifier
                    .padding(top =100.dp),
            ) {
                Row {
                    val PhoneIcons = painterResource(id = R.drawable.ic_phone)
                    Icon(
                        painter = PhoneIcons,
                        contentDescription = "Phone",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Telp),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val LinkIcons = painterResource(id = R.drawable.instagram)
                    Icon(
                        painter = LinkIcons,
                        contentDescription = "Social Media",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Link),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
                Row {
                    val EmailIcons = painterResource(id = R.drawable.email)
                    Icon(
                        painter = EmailIcons,
                        contentDescription = "Email",
                        modifier = Modifier,
                        tint = Color.DarkGray
                    )
                    Text(
                        text = stringResource(R.string.Email),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                        textAlign = TextAlign.Justify,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardNameTheme {
        CardName()
    }
}