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
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment_ph31990.ui.theme.Merriweather
import com.example.assignment_ph31990.ui.theme.NunitoSans

class CheckOutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CheckOut()
        }
    }
}

@Preview
@Composable
fun CheckOut(){
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
            ,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "Check out",
                    fontSize = 18.sp,
                    fontFamily = Merriweather,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }

            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Shipping Address",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    modifier = Modifier,
                    fontFamily = NunitoSans
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_pen),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(4.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                ) {
                    Text(
                        text = "Luu Tuan Quynh ",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = NunitoSans,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                    )
                    Divider1()
                    Text(
                        text = "25 rue Robert Latouche, Nice, 06200, Côte D’azur, France",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        color = Color.Gray,
                        fontFamily = NunitoSans
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Payment",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    modifier = Modifier,
                    fontFamily = NunitoSans
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_pen),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(4.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                        .height(70.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mastercard),
                        contentDescription = null,
                        modifier = Modifier
                            .width(54.dp)
                            .height(33.dp)
                    )
                    Text(
                        text = "    **** **** **** 3947",
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier,
                        fontFamily = NunitoSans
                    )

                }
            }

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Delivery method",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    modifier = Modifier,
                    fontFamily = NunitoSans
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_pen),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(4.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .height(70.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.imgco),
                        contentDescription = null,
                        modifier = Modifier
                            .width(100.dp)
                            .height(50.dp)
                    )
                    Text(
                        text = "    Fast (2-3days)",
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier,
                        fontFamily = NunitoSans
                    )

                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(4.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Order: ",
                            fontSize = 18.sp,
                            lineHeight = 31.sp,
                            color = Color.Gray,
                            fontFamily = NunitoSans
                        )
                        Text(
                            text = "$ 95.00",
                            fontSize = 18.sp,
                            lineHeight = 31.sp,
                            color = Color.Black,
                            fontFamily = NunitoSans
                        )

                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Delivery: ",
                            fontSize = 18.sp,
                            lineHeight = 31.sp,
                            color = Color.Gray,
                            fontFamily = NunitoSans
                        )
                        Text(
                            text = "$ 5.00",
                            fontSize = 18.sp,
                            lineHeight = 31.sp,
                            color = Color.Black,
                            fontFamily = NunitoSans
                        )

                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(bottom = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Total: ",
                            fontSize = 18.sp,
                            lineHeight = 31.sp,
                            color = Color.Gray,
                            fontFamily = NunitoSans
                        )
                        Text(
                            text = "$ 100.00",
                            fontSize = 17.sp,
                            lineHeight = 31.sp,
                            color = Color.Black,
                            fontFamily = NunitoSans
                        )

                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    val intent = Intent(context, NotiSucActivity::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(10.dp)
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "SUBMIT ORDER",
                    fontSize = 20.sp,
                    lineHeight = 31.sp,
                    fontFamily = NunitoSans
                )
            }

        }
    }
}



@Composable
fun Divider1() {
    Divider(
        color = Color.Gray,
        thickness = 1.dp,
        modifier = Modifier
            .fillMaxWidth()
    )
}