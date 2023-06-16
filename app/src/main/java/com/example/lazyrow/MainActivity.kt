package com.example.lazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazyrow.ui.theme.LazyRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        LazyRow(){
                            items(15){
                                BoxExample1()
                            }
                        }
                        LazyRow(){
                            items(15){
                                BoxExample2()
                            }
                        }
                        LazyRow(){
                            items(15){
                                BoxExample3()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BoxExample1(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(200.dp)
        .border(
            BorderStroke(1.dp, color = Color.Black)
        ).shadow(
            elevation = 1.dp,
            RoundedCornerShape(1.dp)
        )
        .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box1", fontSize = 26.sp,color= Color.Blue)
    }
    Spacer(modifier = Modifier.width(4.dp))
}
@Composable
fun BoxExample2(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(200.dp)
        .border(
            BorderStroke(1.dp, color = Color.Black)
        ).shadow(
            elevation = 1.dp,
            RoundedCornerShape(1.dp)
        )
        .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box2", fontSize = 26.sp,color= Color.Yellow)
    }
    Spacer(modifier = Modifier.width(4.dp))
}
@Composable
fun BoxExample3(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(200.dp)
        .border(
            BorderStroke(1.dp, color = Color.Black)
        ).shadow(
            elevation = 1.dp,
            RoundedCornerShape(1.dp)
        )
        .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box3", fontSize = 26.sp,color= Color.White)
    }
    Spacer(modifier = Modifier.width(4.dp))
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyRowTheme {
       BoxExample1()
    }
}