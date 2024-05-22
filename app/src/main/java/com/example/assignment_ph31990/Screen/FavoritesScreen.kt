package com.example.assignment_ph31990.Screen

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
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
import com.example.assignment_ph31990.CheckOutActivity
import com.example.assignment_ph31990.R

data class Cart(val image: Int, val name: String, val price: String)
@Preview
@Composable
fun FavoritesScreen(){
    val context = LocalContext.current
    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .background(color = Color.White)
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 44.dp)
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_search), // Replace with your logo
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )

                    Text(
                        text = "Favorites",
                        fontSize = 20.sp,

                    )



                Image(
                    painter = painterResource(id = R.drawable.bi_cart2),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
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
                .height(630.dp)
                .padding(top = 20.dp)) {
                items(items = products) { item ->
                    CartRow(item = item)
                }
            }
            Button(
                onClick = {
//                    val intent = Intent(context, CheckOutActivity::class.java)
//                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(10.dp)
                    .height(60.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Add all to my cart",
                    fontSize = 20.sp,
                    lineHeight = 31.sp,
                )
            }
        }
    }
}

@Composable
fun CartRow(item: Product) {
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
                color = Color.Gray

            )
            Text(text = item.price,
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.weight(1f))


        }

        Column(
            modifier = Modifier.height(100.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.delete),
                contentDescription = null,
                modifier = Modifier.size(25.dp),

                )
            Image(
                painter = painterResource(id = R.drawable.ic_shopping_bag),
                contentDescription = null,
                modifier = Modifier.size(25.dp),

                )
        }


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
