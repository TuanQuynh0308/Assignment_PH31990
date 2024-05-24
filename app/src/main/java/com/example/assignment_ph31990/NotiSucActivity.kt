package com.example.assignment_ph31990

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment_ph31990.Screen.HomeScreen
import com.example.assignment_ph31990.ui.theme.Merriweather
import com.example.assignment_ph31990.ui.theme.NunitoSans

class NotiSucActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotiScreen()
        }
    }
}
@Preview
@Composable
fun NotiScreen(){
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "SUCCESS!",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontFamily = Merriweather
        )
        Image(
            painter = painterResource(id = R.drawable.img_suc),
            contentDescription = null,
            modifier = Modifier
                .size(450.dp)
                .clickable { },

            )
        Text(
            text = "Your order will be delivered soon.",
            fontSize = 18.sp,
            color = Color.Gray,
            fontFamily = NunitoSans
        )
        Text(
            text = "Thank you for choosing our app!",
            fontSize = 18.sp,
            color = Color.Gray,
            fontFamily = NunitoSans
        )
        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Track your orders",
                fontSize = 20.sp,
                lineHeight = 31.sp,
                fontFamily = NunitoSans
            )
        }
        Button(
            onClick = {
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .fillMaxWidth()
                .shadow(5.dp)
        ) {
            Text(
                text = "BACK TO HOME",
                fontSize = 20.sp,
                lineHeight = 31.sp,
                color = Color.Black,
                fontFamily = NunitoSans
            )
        }
    }
}