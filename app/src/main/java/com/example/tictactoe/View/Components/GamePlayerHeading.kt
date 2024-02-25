package com.example.tictactoe.View.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ViewModel.GameViewModel
import com.example.tictactoe.ui.theme.inter

@Composable
fun PlayerTurn(viewModel: GameViewModel){

    val player by viewModel.isXTurn.collectAsState()
    val winner by viewModel._victory.collectAsState()

    Text(if(player && winner =="") "Player 1's turn" else if(!player && winner=="") "Player 2's turn"
     else if(winner == "X") "Player 1 won " else if(winner=="O") "Player 2 won" else "", fontSize = 30.sp,
        fontWeight = FontWeight.SemiBold, fontFamily = inter, color = Color.White)
}