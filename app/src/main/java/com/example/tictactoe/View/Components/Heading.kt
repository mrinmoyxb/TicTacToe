package com.example.tictactoe.View.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ViewModel.GameViewModel
import com.example.tictactoe.ui.theme.inter

@Composable
fun Heading(text: String, fontWeight: FontWeight, size: Int){
    Text(text, fontSize = size.sp, fontWeight = fontWeight, fontFamily = inter, color = Color.White)
}




