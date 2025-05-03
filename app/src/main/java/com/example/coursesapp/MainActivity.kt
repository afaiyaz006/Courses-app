package com.example.coursesapp

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) {
//
//
//
//                }
            }
        }
    }
}
//    @Composable
//    fun Greeting(name: String, modifier: Modifier = Modifier) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )
//    }
@Composable
fun CourseCard(){
           Card() {
               Row(modifier = Modifier) {
                   ImageViewer(modifier = Modifier.height(68.dp).width(68.dp))
                   Column(
                       modifier = Modifier.padding(start=16.dp,end=16.dp,top=16.dp),
                       horizontalAlignment = Alignment.CenterHorizontally
                   ) {
                       Text(
                           modifier=Modifier.padding(bottom=8.dp),
                           text = "Photography",
                           fontSize = 16.sp
                       )
                       Row(modifier=Modifier.padding(top=8.dp).align(AbsoluteAlignment.Left)) {
                           Text(
                               text = "Icon",
                               fontSize=10.sp,
                           )
                           Spacer(modifier = Modifier.size(8.dp))
                           Text(
                               text = "384",
                               fontSize=10.sp,
                           )
                       }

                   }

               }
           }

}
@Composable
fun ImageViewer(modifier: Modifier){
    val imageResource=painterResource(R.drawable.architecture)
    Image(
        modifier=modifier,
        painter = imageResource,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//        Greeting("Android")
        CourseCard()
}

