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


@Composable
fun PlayerTurn(viewModel: GameViewModel){

    val player by viewModel.isXTurn.collectAsState()
    val winner by viewModel._victory.collectAsState()

    Text(if(player) "Player1's turn" else "Payer2's turn", fontSize = 25.sp,
        fontWeight = FontWeight.Medium, fontFamily = inter, color = Color.White)
}

@Composable
fun GameWinner(viewModel: GameViewModel){

    val winner by viewModel._victory.collectAsState()

    Text(if(winner == "X") "Player1 won " else if(winner=="O") "Payer2 won" else "" , fontSize = 28.sp,
        fontWeight = FontWeight.SemiBold, fontFamily = inter, color = Color(0xFF80ffdb))
}