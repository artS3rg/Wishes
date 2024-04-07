package com.example.wishes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.wishes.ui.theme.BackL
import com.example.wishes.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageActivity(){
    TopAppBar(
        title = { Text(text = "Language", color = Orange) },
        colors = TopAppBarDefaults.topAppBarColors(BackL),
        modifier = Modifier.zIndex(2f),
        actions = {
            IconButton(
                modifier = Modifier
                    .size(48.dp)
                    .padding(end = 8.dp),
                onClick = { },
            ) {
                Icon(modifier = Modifier
                    .size(32.dp), imageVector = Icons.Filled.ArrowBack, tint = Orange, contentDescription = null)
            }
        }
    )
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .verticalScroll(state = ScrollState(0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(modifier = Modifier.size(58.dp))
        OutlinedButton(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.White),
            border = BorderStroke(2.dp, Orange),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 5.dp
            ),
            onClick = { /*TODO*/ }
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ){
                Row {
                    Icon(imageVector = Icons.Filled.CheckCircle, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Русский",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(4.dp))
        for (i in 1..10){
            Spacer(modifier = Modifier.size(4.dp))
            OutlinedButton(
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.White),
                border = BorderStroke(2.dp, Orange),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 5.dp
                ),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ){
                    Row {
                        Icon(imageVector = Icons.Filled.CheckCircle, tint = Color.LightGray, contentDescription = null)
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(
                            text = "English",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = Orange
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.size(4.dp))
        }
        Spacer(modifier = Modifier.size(4.dp))
    }
}