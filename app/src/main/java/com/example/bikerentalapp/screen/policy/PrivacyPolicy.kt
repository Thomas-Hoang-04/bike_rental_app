package com.example.bikerentalapp.screen.policy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bikerentalapp.ui.theme.TextColor

@Composable
fun PrivacyPolicy(
    onBackClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 36.dp)
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onBackClick,
                        modifier = Modifier.size(24.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "QUY ĐỊNH VÀ CHÍNH SÁCH",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )

                    // Empty spacer to center the title
                    Spacer(modifier = Modifier.size(24.dp))
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text(
                    text = "QUY ĐỊNH VÀ CHÍNH SÁCH",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    ),
                    color = TextColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.padding(4.dp))

                Text(
                    text = "ỨNG DỤNG THƯƠNG MẠI ĐIỆN TỬ",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    ),
                    color = TextColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Preview
@Composable
fun PrivacyPreview() {
    PrivacyPolicy(onBackClick = {})
}