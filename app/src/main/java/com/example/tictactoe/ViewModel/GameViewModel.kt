package com.example.tictactoe.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.buffer

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
        buttonWinners.value = arrayOf(false, false, false, false, false, false, false, false, false)
        isXTurn.value = true
        victory.value = ""
    }

    fun setButtons(id: Int) {
        if(buttonValues.value[id]=="" && victory.value == ""){
            val newValues = buttonValues.value.toMutableList()
            newValues[id] = if(_isXTurn.value)"X" else "O"
            buttonValues.value = newValues.toTypedArray()
            isXTurn.value = !isXTurn.value
        }
        isGameOver()
    }

    private fun isGameOver(): Boolean{
        if(rowHasWinner(1) || rowHasWinner(2) || rowHasWinner(3)){
            return true
        }
        else if(columnHasWinner(1) || columnHasWinner(2) || columnHasWinner(3)){
            return true
        }
        else if(firstDiagonalHasWinner() || secondDiagonalHasWinner()){
            return true
        }
        return false
    }

    private fun rowHasWinner(rowId: Int): Boolean{
        val third = (rowId*3)-1
        val second = third-1
        val first = second-1
        return compareSpaces(first, second, third)
    }

    private fun columnHasWinner(columnId: Int): Boolean{
        val first = columnId-1
        val second = first+3
        val third = first+6
        return compareSpaces(first, second, third)
    }

    private fun firstDiagonalHasWinner(): Boolean{
        return compareSpaces(0, 4, 8)
    }

    private fun secondDiagonalHasWinner(): Boolean{
        return compareSpaces(2, 4, 6)
    }

    private fun compareSpaces(first: Int, second: Int, third: Int): Boolean {
        val firstTwoMatch: Boolean = buttonValues.value[first] == buttonValues.value[second]
        val secondTwoMatch: Boolean = buttonValues.value[second] == buttonValues.value[third]
        val allThreeMatch = firstTwoMatch && secondTwoMatch
        return if(buttonValues.value[first]==""){
            false
        }
        else if(allThreeMatch){
            val newValues = buttonWinners.value.toMutableList()
            newValues[first] = true
            newValues[second] = true
            newValues[third] = true
            buttonWinners.value = newValues.toTypedArray()
            true
        }
        else{
            false
        }
    }
}
