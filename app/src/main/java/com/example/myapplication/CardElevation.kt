package com.example.myapplication

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
@Composable
fun CardElevation(
    modifier: Modifier = Modifier,
    elevation: Dp = 1.dp,
    border: BorderStroke? = null,
    shape: Shape = MaterialTheme.shapes.medium) {

        Card(
            shape = shape,
            border = border,
            modifier = modifier
        ) {
            Column {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .height(72.dp)
                        .padding(start = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) { Box(
                        modifier = Modifier
                            .background(color = Color.LightGray, shape = CircleShape)
                            .size(40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.imagen1),
                            contentDescription = null
                        )
                    }

                    Spacer(modifier = Modifier.width(32.dp))

                    Column(Modifier.fillMaxWidth()) {
                        // Encabezado
                        Text(text = "Título")

                        // Subtítulo
                        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                            Text(text = "Texto secundario")
                        }
                    }
                }

                // Multimedia
                Image(
                    painterResource(id = R.drawable.imagen1),
                    contentDescription = "Multimedia de tarjeta",
                    Modifier
                        .background(color = Color.LightGray)
                        .fillMaxWidth()
                        .height(194.dp)
                )

                Row(Modifier.padding(start = 16.dp, end = 24.dp, top = 16.dp)) {

                    // Texto de ayuda
                    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                        Text(
                            text = LoremIpsum(50).values.take(10).joinToString(separator = " "),
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {

                    Box(
                        Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        // Botones
                        Row(modifier = Modifier.align(Alignment.CenterStart)) {

                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "ACCIÓN 1")
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "ACCIÓN 2")
                            }
                        }

                        // Iconos
                        Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Default.Favorite, contentDescription = null)
                            }

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Default.Share, contentDescription = null)
                            }
                        }
                    }
                }
            }
        }
    }


 */

