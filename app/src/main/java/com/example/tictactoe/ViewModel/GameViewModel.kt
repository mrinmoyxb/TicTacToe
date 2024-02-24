package com.example.tictactoe.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel: ViewModel() {
    private val buttonValues = MutableStateFlow<Array<String>>(arrayOf("", "", "", "", "", "", "", "", ""))
    var _buttomValues: StateFlow<Array<String>> = buttonValues

    private val buttonWinners = MutableStateFlow<Array<Boolean>>(arrayOf(false, false, false, false, false, false, false, false, false))
    var _buttonWinners: StateFlow<Array<Boolean>> = buttonWinners

    private val isXTurn = MutableStateFlow<Boolean>(true)
    var _isXTurn: StateFlow<Boolean> = isXTurn

    private val victory = MutableStateFlow<String>("")
    var _victory: StateFlow<String> = victory

    fun resetButton(){
        buttonValues.value = arrayOf("", "", "", "", "", "", "", "", "")
        isXTurn.value = true
    }
    fun setButtons(id: Int) {
        if(buttonValues.value[id]==""){
            val newValues = buttonValues.value.toMutableList()
            newValues[id] = if(_isXTurn.value)"X" else "O"
            buttonValues.value = newValues.toTypedArray()
            isXTurn.value = !isXTurn.value
        }
    }
}
