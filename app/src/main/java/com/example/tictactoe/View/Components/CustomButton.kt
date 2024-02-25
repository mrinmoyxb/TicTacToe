package com.example.tictactoe.View.Components

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ViewModel.GameViewModel
import com.example.tictactoe.ui.theme.inter


@SuppressLint("SuspiciousIndentation")
@Composable
fun CustomButton(viewModel: GameViewModel){
    val button by viewModel._buttomValues.collectAsState()
    val winners by viewModel._buttonWinners.collectAsState()
    //val color1: Color = Color(0xFFa594f9)
    val color1: Color = Color(0xFF7752FE)
    val color2: Color = Color(0xFFFFFFFF)
    val color3: Color = Color(0xFF000000)
    // Row 1:
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // 0
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(0) },
            colors = CardDefaults.cardColors(if(winners[0]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[0], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[0]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
        // 1
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(1) },
            colors = CardDefaults.cardColors(if(winners[1]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[1], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[1]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
        // 2
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(2) },
            colors = CardDefaults.cardColors(if(winners[2]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[2], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[2]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }

    }

    // Row 2:
    Spacer(modifier = Modifier.height(12.dp))
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // 3
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(3) },
            colors = CardDefaults.cardColors(if(winners[3]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[3], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[3]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
        // 4
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(4) },
            colors = CardDefaults.cardColors(if(winners[4]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[4], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[4]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
        // 5
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(5) },
            colors = CardDefaults.cardColors(if(winners[5]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[5], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[5]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
    }

    // Row 3:
    Spacer(modifier = Modifier.height(12.dp))
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // 6
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(6) },
            colors = CardDefaults.cardColors(if(winners[6]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[6], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[6]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
        // 7
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(7) },
            colors = CardDefaults.cardColors(if(winners[7]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[7], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[7]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }
        // 8
        Card(
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .clickable { viewModel.setButtons(8) },
            colors = CardDefaults.cardColors(if(winners[8]) color1 else color2),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    button[8], fontSize = 48.sp, fontFamily = inter, fontWeight = FontWeight.Bold,
                    color = if(winners[8]) color2 else color3, textAlign = TextAlign.Center
                )
            }
        }

    }
}
