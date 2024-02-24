package com.example.tictactoe.View.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tictactoe.ViewModel.GameViewModel

@Preview(showBackground = true)
@Composable
fun GameScreen(){
    val viewModel: GameViewModel = GameViewModel()
    val button by viewModel.buttonValues.collectAsState()

//    val turn = if(state.isXTurn) "X's Turn" else "O's Turn"
//    val turnMessage = "Tic Tac Toe\nIt is $turn"
//    val winner = state.victor
//    val winnerMessage = "Tic Tac Toe\n$winner Wins"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        //Text(text = if(winner!=null) winnerMessage else turnMessage, fontSize = 32.sp, color = Color.White)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
//            CustomButton(button[0]) { viewModel.ButtonClick(0) }
//            CustomButton(button[1]) { viewModel.ButtonClick(1) }
//            CustomButton(button[2]) { viewModel.ButtonClick(2) }
        }
        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
//            CustomButton(button[3]) { viewModel.ButtonClick(3) }
//            CustomButton(button[4]) { viewModel.ButtonClick(4) }
//            CustomButton(button[5]) { viewModel.ButtonClick(5) }
        }
        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
//            CustomButton(button[6]) { viewModel.ButtonClick(6) }
//            CustomButton(button[7]) { viewModel.ButtonClick(7) }
//            CustomButton(button[8]) { viewModel.ButtonClick(8) }

        }

//        Spacer(modifier = Modifier.height(50.dp))
//        ResetButton { viewModel.resetButton() }
    }
}

