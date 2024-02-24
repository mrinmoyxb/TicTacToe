package com.example.tictactoe.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel: ViewModel() {
    val buttonValues = MutableStateFlow<Array<String>>(arrayOf("", "", "", "", "", "", "", "", ""))
    val _buttomValues: StateFlow<Array<String>> = buttonValues

    val buttonWinners = MutableStateFlow<Array<Boolean>>(arrayOf(false, false, false, false, false, false, false, false, false))
    val _buttonWinners: StateFlow<Array<Boolean>> = buttonWinners

    fun setButtons(id: Int) {
        if(buttonValues.value[id]==""){
            val newValues = buttonValues.value.toMutableList()
            newValues[id] = "X"
            buttonValues.value = newValues.toTypedArray()
        }
    }
}
