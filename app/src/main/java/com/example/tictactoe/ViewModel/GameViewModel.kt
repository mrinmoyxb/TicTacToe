package com.example.tictactoe.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {

    // both _state and state should be of same datatype
    private val _state = mutableStateOf(GameState())
    val state: State<GameState> = _state

    // moving back to original state
    fun resetButton() {
        _state.value = GameState()
    }

    // setting "X" or "O" based on users action
    fun setTurn(id: Int) {
        if (_state.value.victory == null) {
            if (_state.value.buttonValues[id].equals("")) {
                val buttons = _state.value.buttonValues.copyOf()
                if (_state.value.isTurn) {
                    buttons[id] = "X"
                } else {
                    buttons[id] = "O"
                }
                _state.value = _state.value.copy(
                    buttonValues = buttons,
                    isTurn = !state.value.isTurn
                )
            }
        }
    }

//    private fun isGameOver(): Boolean{
//        return
//    }
}