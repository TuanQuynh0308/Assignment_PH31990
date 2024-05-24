package com.example.assignment_ph31990.Screen

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
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
import androidx.core.graphics.toColorInt
import com.example.assignment_ph31990.ProductDetailActivity
import com.example.assignment_ph31990.R
import com.example.assignment_ph31990.ui.theme.Merriweather
import com.example.assignment_ph31990.ui.theme.NunitoSans
import org.w3c.dom.Text

data class Item(val image: Int, val text: String)
data class Product(val image: Int, val name: String, val price: String)


@Preview
@Composable
fun HomeScreen(){
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
                Column(
                    modifier = Modifier
                        .padding(5.dp),
                        verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Make home",
                        fontSize = 20.sp,
                        fontFamily = Merriweather,
                        color = Color.Gray
                    )

                    Text(
                        text = "BEAUTIFUL",
                        fontSize = 22.sp,
                        fontFamily = Merriweather
                    )

                }

                Image(
                    painter = painterResource(id = R.drawable.bi_cart2),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            }

            val items = listOf(
                Item(R.drawable.bed, "Popular"),
                Item(R.drawable.chair, "Chair"),
                Item(R.drawable.table, "Table"),
                Item(R.drawable.sofa, "Armchair"),
                Item(R.drawable.bed, "Bed"),
                Item(R.drawable.chair, "Lamp")
            )

            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(items = items) { item ->
                    ItemRow(item = item)
                }
            }

            val products = listOf(
                Product(R.drawable.product4, "Black Simple Lamp", "$12.00"),
                Product(R.drawable.product1, "Minimal Stand", "$25.00"),
                Product(R.drawable.product3, "Coffee Chair", "$20.00"),
                Product(R.drawable.product2, "Simple Desk", "$50.00"),
                Product(R.drawable.product1, "Simple Desk", "$30.00"),
                Product(R.drawable.product1, "Simple Desk", "$30.00"),
                Product(R.drawable.product3, "Coffee Chair", "$20.00"),
                Product(R.drawable.product3, "Coffee Chair", "$20.00"),
            )

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                items(items = products) { product ->
                    ProductRow(item = product) {
                        val intent = Intent(context, ProductDetailActivity::class.java)
                        intent.putExtra("productId", product.image)
                        context.startActivity(intent)
                    }
                }
            }

        }
    }
}

@Composable
fun ItemRow(item: Item) {
    Box(
        modifier = Modifier.width(80.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .width(44.dp)
                    .height(44.dp)
                    .background(color = Color(0xFFf5f5f5), shape = RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = item.image), // Replace with your logo
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))
            Text(text = item.text,
                fontSize = 14.sp,
                color = Color.Gray,
                fontFamily = NunitoSans
            )
        }
    }

}

@Composable
fun ProductRow(item: Product, onItemClick: () -> Unit) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp)
        .padding(start = 7.dp)
        .clickable(onClick = onItemClick)) {
        Image(
            painter = painterResource(id = item.image), // Replace with your logo
            contentDescription = null,
            modifier = Modifier.width(177.dp).height(220.dp)

        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = item.name,
                    fontSize = 15.sp,
                color = Color.Gray,
                fontFamily = NunitoSans

            )
            Text(text = item.price,
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = NunitoSans)
        }
    }
}