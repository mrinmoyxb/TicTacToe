package com.example.tictactoe.View.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.tictactoe.View.Components.CustomButton
import com.example.tictactoe.View.Components.Heading
import com.example.tictactoe.ViewModel.GameViewModel

@Preview(showBackground = true)
@Composable
fun GameScreen() {
    val viewModel: GameViewModel = GameViewModel()
   Column(
       modifier = Modifier.fillMaxHeight().fillMaxWidth().background(Color.Black),
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Spacer(modifier = Modifier.height(50.dp))
       Heading("Tic Tac Toe")
       Spacer(modifier = Modifier.height(110.dp))
       Column(
           //modifier = Modifier.fillMaxSize(),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center
       ){
           CustomButton(viewModel = viewModel)
       }
   }
}

