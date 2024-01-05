package com.alejandro_dev_links.bottomnavbar.firma.component

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandro_dev_links.bottomnavbar.firma.util.Line
import com.alejandro_dev_links.bottomnavbar.ui.theme.BottomNavBarTheme

@SuppressLint("MutableCollectionMutableState")
@Composable
fun DrawingContent() {
    val lines = remember { mutableStateListOf<Line>() }
    var lineas by remember { mutableStateOf(mutableStateListOf<Line>()) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(horizontal = 10.dp),
            elevation = CardDefaults.cardElevation(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Firma", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(30.dp),
                    elevation = CardDefaults.cardElevation(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color.Black)
                ) {
                    Canvas(modifier = Modifier
                        .fillMaxSize()
                        .pointerInput(true) {
                            detectDragGestures { change, dragAmount ->
                                change.consume()
                                val line = Line(
                                    start = change.position - dragAmount,
                                    end = change.position
                                )
                                lines.add(line)
                            }
                        }) {
                        lines.forEach { line ->
                            drawLine(
                                color = line.color,
                                start = line.start,
                                end = line.end,
                                strokeWidth = line.strokeWidth.toPx(),
                                cap = StrokeCap.Round
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {
                        val saveFirma = lines.toList()
                        println("Número de líneas dibujadas: ${saveFirma}")
                    }) {
                        Text("Guardar Dibujo")
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Button(onClick = {
                        lineas = lines
                        lineas.clear()
                    }) {
                        Text("Limpiar Dibujo")
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun DrawingContentPre() {
    BottomNavBarTheme {
        DrawingContent()
    }
}