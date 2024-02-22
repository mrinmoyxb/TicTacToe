package com.example.tictactoe.View.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Heading(turn: String){
    if(turn=="X"){
        Text("Player1 turn", fontSize = 32.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
    else{
        Text("Player2 turn", fontSize = 32.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}