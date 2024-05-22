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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ProductDetailScreen()
        }
    }
}

@Preview
@Composable
fun ProductDetailScreen(){
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.probig),
                contentDescription = null,
                modifier = Modifier.size(450.dp),
                alignment = Alignment.TopEnd
            )
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = null,
                modifier = Modifier
                    .size(140.dp)
                    .padding(start = 20.dp),
                alignment = Alignment.TopStart
            )
            Image(
                painter = painterResource(id = R.drawable.color),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp)
                    .padding(top = 150.dp)
                    .padding(start = 25.dp),
                alignment = Alignment.TopStart
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Box {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(18.dp)
                    .background(Color.White),
            ) {
                Text(
                    text = "Minimal Stand",
                    fontSize = 30.sp,
                    lineHeight = 31.sp,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "$ 50",
                        fontSize = 35.sp,
                        lineHeight = 31.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_plus), // Replace with your logo
                            contentDescription = null,
                            modifier = Modifier
                                .size(35.dp)
                        )
                        Text(
                            text = "  01  ",
                            fontSize = 27.sp,
                            lineHeight = 31.sp,
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_minus), // Replace with your logo
                            contentDescription = null,
                            modifier = Modifier
                                .size(35.dp)
                        )
                    }

                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = " 4.5    ",
                        fontSize = 20.sp,
                        lineHeight = 31.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "  (50 reviews)",
                        fontSize = 15.sp,
                        lineHeight = 31.sp,
                        color = Color.Gray
                    )

                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Minimal Stand is made of by natural wood. The design that is very simple and minimal. This is truly one of the best furnitures in any family for now. With 3 different colors, you can easily select the best match for your home. ",
                    fontSize = 15.sp,
                    color = Color.Gray,
                    lineHeight = 20.sp,

                    )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.frame),
                        contentDescription = null,
                        modifier = Modifier
                            .size(60.dp)
                    )
                    Button(
                        onClick = {
                            val intent = Intent(context, CartActivity::class.java)
                            context.startActivity(intent)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .padding(10.dp)
                            .height(60.dp)
                            .width(250.dp)
                    ) {
                        Text(
                            text = "Add to cart",
                            fontSize = 20.sp,
                            lineHeight = 31.sp,
                        )
                    }
                }

            }
        }
    }
}