package com.alejandro_dev_links.bottomnavbar.creditcard.component

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandro_dev_links.bottomnavbar.R
import com.alejandro_dev_links.bottomnavbar.ui.theme.BottomNavBarTheme
import com.alejandro_dev_links.bottomnavbar.ui.theme.MetalBrush

@Composable
fun CreditCardContent() {

    val cardColors = CardDefaults.cardColors(
        containerColor = MetalBrush,
        contentColor = Color.White
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.elevatedCardElevation(20.dp),
            colors = CardDefaults.cardColors(
                contentColor = Color.White
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painterResource(id = R.drawable.black),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(), contentScale = ContentScale.Crop
                )
                Image(
                    painterResource(id = R.drawable.word),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(), contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Credit Card", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painterResource(id = R.drawable.visa),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                    }

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "1234 5678 9012 3452",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "0123")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        Column {
                            Text(text = "VALID", fontSize = 10.sp)
                            Text(text = "THRU", fontSize = 10.sp)
                        }
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null
                        )
                        Text(
                            text = "05/24",
                            fontSize = 20.sp
                        )
                    }
                    Text(
                        text = "Name Surname",
                        fontSize = 25.sp
                    )
                }
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.elevatedCardElevation(20.dp),
            colors = CardDefaults.cardColors(
                contentColor = Color.White
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painterResource(id = R.drawable.blue),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(), contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Credit Card", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painterResource(id = R.drawable.visa),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                    }

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "5621 5724 4867 0345",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(text = "0596")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        Column {
                            Text(text = "VALID", fontSize = 10.sp)
                            Text(text = "THRU", fontSize = 10.sp)
                        }
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null
                        )
                        Text(
                            text = "09/29",
                            fontSize = 20.sp
                        )
                    }
                    Text(
                        text = "Name Surname",
                        fontSize = 25.sp
                    )
                }
            }
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 10.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.elevatedCardElevation(20.dp),
            colors = cardColors
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "Credit Card", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        painterResource(id = R.drawable.mastercard),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                }

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "2351 5278 9012 3452",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
                Text(text = "0362")
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Column {
                        Text(text = "VALID", fontSize = 10.sp)
                        Text(text = "THRU", fontSize = 10.sp)
                    }
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
                    Text(
                        text = "02/28",
                        fontSize = 20.sp
                    )
                }
                Text(
                    text = "Name Surname",
                    fontSize = 25.sp
                )
            }
        }
    }
}

@Composable
@Preview
fun CreditCardContentPreview() {
    BottomNavBarTheme {
        CreditCardContent()
    }
}