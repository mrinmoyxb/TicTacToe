package com.example.tictactoe.ViewModel

import android.app.GameState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class GameState(
    var buttonValues: Array<String> = arrayOf("-","-","-","-","-","-","-","-","-"),
    var buttonWinners: Array<Boolean> = arrayOf(false,false,false,false,false,false,false,false,false),
    val isXTurn : Boolean = true,
    val victor : String? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as com.example.tictactoe.ViewModel.GameState

        if (!buttonValues.contentEquals(other.buttonValues)) return false
        if (!buttonWinners.contentEquals(other.buttonWinners)) return false
        if (isXTurn != other.isXTurn) return false
        return victor == other.victor
    }

    override fun hashCode(): Int {
        var result = buttonValues.contentHashCode()
        result = 31 * result + buttonWinners.contentHashCode()
        result = 31 * result + isXTurn.hashCode()
        result = 31 * result + (victor?.hashCode() ?: 0)
        return result
    }
}