package com.example.tictactoe.ViewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class GameState(
    val buttonValues: Array<String> = arrayOf("", "", "", "", "", "", "", "", ""),
    val buttonWinners: Array<Boolean> = arrayOf(false, false, false, false, false, false, false, false, false),
    val isTurn: Boolean = true,
    val victory: String? = null,
)
