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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment_ph31990.Screen.ItemRow
import com.example.assignment_ph31990.Screen.Product
import com.example.assignment_ph31990.ui.theme.Merriweather
import com.example.assignment_ph31990.ui.theme.NunitoSans

data class Product(val image: Int, val name: String, val price: String)

class CartActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CartScreen()
        }
    }
}

@Preview
@Composable
fun CartScreen(){
    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
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
                    text = "My cart",
                    fontSize = 16.sp,
                    fontFamily = Merriweather,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }



            val products = listOf(
                Product(R.drawable.product4, "Black Simple Lamp", "$12.00"),
                Product(R.drawable.product1, "Minimal Stand", "$25.00"),
                Product(R.drawable.product3, "Coffee Chair", "$20.00"),
                Product(R.drawable.product2, "Simple Desk", "$50.00"),
                Product(R.drawable.product1, "Simple Desk", "$30.00"),
                Product(R.drawable.product1, "Simple Desk", "$30.00"),
            )

            Spacer(modifier = Modifier.width(10.dp))

            LazyColumn(modifier = Modifier
                .fillMaxWidth()
                .height(580.dp)
                .padding(top = 20.dp)) {
                items(items = products) { item ->
                    ProductRow(item = item)
                }
            }
            Box(
                contentAlignment = Alignment.BottomCenter
            ) {
                Column(Modifier.fillMaxHeight()) {
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        OutlinedTextField(
//                            value = email,
//                            onValueChange = { email = it },
//                            label = { Text("Enter your promo code") },
//                            modifier = Modifier
//                                .padding(10.dp)
//                                .weight(1f),
//
//                            )
//                        Image(
//                            painter = painterResource(id = R.drawable.img_next),
//                            contentDescription = null,
//                            modifier = Modifier.size(44.dp)
//                        )
//
//                    }
                    PromoCodeInput()
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Total: ",
                            fontSize = 22.sp,
                            lineHeight = 31.sp,
                            color = Color.Gray,
                            fontFamily = NunitoSans
                        )
                        Text(
                            text = "$ 95.00",
                            fontSize = 22.sp,
                            lineHeight = 31.sp,
                            color = Color.Black,
                            fontFamily = NunitoSans
                        )

                    }
                    Button(
                        onClick = {
                            val intent = Intent(context, CheckOutActivity::class.java)
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
                            text = "Check out",
                            fontSize = 20.sp,
                            lineHeight = 31.sp,
                            fontFamily = NunitoSans
                        )
                    }
                }

            }
        }
    }

}

@Composable
fun ProductRow(item: Product) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)
        ) {
        Image(
            painter = painterResource(id = item.image), // Replace with your logo
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)

        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier
                .height(100.dp)
                .weight(1f),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = item.name,
                fontSize = 15.sp,
                color = Color.Gray,
                fontFamily = NunitoSans
            )
            Text(text = item.price,
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = NunitoSans)

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_plus), // Replace with your logo
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = "  01  ",
                    fontSize = 18.sp,
                    lineHeight = 31.sp,
                    fontFamily = NunitoSans
                )
                Image(
                    painter = painterResource(id = R.drawable.img_minus), // Replace with your logo
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.delete),
            contentDescription = null,
            modifier = Modifier.size(25.dp),

        )

    }
    HorizontalDivider()
}

@Composable
fun HorizontalDivider() {
    Divider(
        color = Color.Gray,
        thickness = 1.dp,
        modifier = Modifier
            .fillMaxWidth()
    )
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun PromoCodeInput() {
    val promoCode = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .padding(16.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(8.dp),
                clip = false
            )
            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
    ) {
        Row(
            modifier = Modifier
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextField(
                value = promoCode.value,
                onValueChange = { promoCode.value = it },
                placeholder = {
                    Text(
                        text = "Enter your promo code",
                        color = Color.Gray
                    )
                },
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(14.dp)),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                singleLine = true,
                textStyle = TextStyle(color = Color.Black)
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Black, shape = RoundedCornerShape(12.dp))
                    .clickable { /* Handle promo code submission */ },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_next),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}