package com.example.tictactoe.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel: ViewModel() {
    private val _buttonValues = MutableStateFlow(arrayOf("", "", "", "", "", "", "", "", ""))
    val buttonValues = _buttonValues.asStateFlow()

    private val _buttonWinners = MutableStateFlow<Array<Boolean>>(arrayOf(false, false, false, false, false, false, false, false, false))
    val buttonWinners = _buttonWinners.asStateFlow()

    private val _victory = MutableStateFlow<String?>(null)
    val victory = _victory.asStateFlow()

    private val _playerTurn = MutableStateFlow<Boolean>(true) // True: X, False: O
    val playerTurn = _playerTurn.asStateFlow()

    fun ButtonClick(id: Int){
        if(buttonValues.value[id].isEmpty() && victory.value == null) {
            val updatedValues = buttonValues.value.toMutableList()
            val currentPlayer = if (playerTurn.value) "X" else "O"
            updatedValues[id] = currentPlayer
            _buttonValues.value = updatedValues.toTypedArray()
        }
    }
}