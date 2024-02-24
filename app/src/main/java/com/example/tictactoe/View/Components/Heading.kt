package com.example.tictactoe.View.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ui.theme.inter

@Composable
fun Heading(text: String){
    Text(text, fontSize = 50.sp, fontWeight = FontWeight.Bold, fontFamily = inter, color = Color.White)
}