package com.alejandro_dev_links.bottomnavbar.presentation.navigationdrawer.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material.icons.outlined.CleanHands
import androidx.compose.material.icons.outlined.Discount
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.outlined.SmartDisplay
import androidx.compose.material.icons.outlined.Subscriptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandro_dev_links.bottomnavbar.R
import com.alejandro_dev_links.bottomnavbar.ui.theme.MyColorPurple
import com.alejandro_dev_links.bottomnavbar.ui.theme.MyColorYellow
import kotlinx.coroutines.CoroutineScope

@Composable
fun MyDrawer(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState
) {

    Column(modifier = Modifier.fillMaxHeight()) {
        Column(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(15.dp))
                Image(
                    painterResource(
                        id = R.drawable.profile
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                50
                            )
                        ),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.CenterStart
                )
                Spacer(modifier = Modifier.width(15.dp))
                Column {
                    Text(
                        text = "Alejandro A",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(text = "Mi perfil >", color = Color.Black)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyColorPurple,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 30.dp,
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                )

            ) {
                Row(
                    modifier = Modifier.padding(
                        start = 10.dp,
                        top = 5.dp,
                        bottom = 5.dp,
                        end = 20.dp
                    )
                ) {
                    Text(
                        text = "Envíos gratis desde $ 149 con",
                        fontSize = 12.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Card(
                        modifier = Modifier,
                        shape = RoundedCornerShape(
                            topStart = 10.dp,
                            topEnd = 10.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 10.dp
                        ),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(1.dp, Color.White)
                    ) {
                        Text(
                            text = "meli +",
                            fontSize = 15.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 5.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
                shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                    bottomStart = 20.dp,
                    bottomEnd = 20.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .background(MyColorYellow)
                        .padding(horizontal = 10.dp)
                        .height(40.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Image(imageVector = Icons.Default.Storefront, contentDescription = "")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Mercado Pago", color = Color.Black)
                    Spacer(modifier = Modifier.fillMaxWidth(0.8f))
                    Text(text = ">", color = Color.Black)
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
        }
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(start = 15.dp)
                .fillMaxHeight()
                .fillMaxWidth(0.9f)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.Home, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Inicio", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.Search, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Buscar", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.Notifications, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Notificaciones", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.ShoppingBag, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Mys compras", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Favoritos", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.Discount, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Ofertas", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.CleanHands, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Créditos", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.Subscriptions, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Suscripciones", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(imageVector = Icons.Outlined.SmartDisplay, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Mercado Play", color = Color.Black)
            }
        }
    }
}