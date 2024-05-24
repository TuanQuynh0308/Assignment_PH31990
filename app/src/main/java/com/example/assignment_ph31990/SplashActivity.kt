package com.example.assignment_ph31990

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment_ph31990.ui.theme.Gelasio
import com.example.assignment_ph31990.ui.theme.Gelasio_Family
import com.example.assignment_ph31990.ui.theme.Merriweather
import com.example.assignment_ph31990.ui.theme.NunitoSans
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen()
        }
    }
}

@Preview
@Composable
fun SplashScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "MAKE YOUR",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Left,
                    fontFamily = Merriweather,
                    color = Color.Gray
                )
                Text(
                    text = "HOME BEAUTIFUL",
                    fontSize = 30.sp,
                    fontFamily = Merriweather,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
                fontSize = 18.sp,
                color = Color.Gray,
                lineHeight = 40.sp,
                fontFamily = NunitoSans,
                modifier = Modifier.padding(horizontal = 32.dp),

            )
            Spacer(modifier = Modifier.height(150.dp))
            val context = LocalContext.current
            Button(
                onClick = {
                    val intent = Intent(context, LoginActivity::class.java)
                    context.startActivity(intent)
                          },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .height(48.dp)
            ) {
                Text(
                    text = "Get Started",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
}