package com.example.wishes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
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
fun ThemeActivity(){
    TopAppBar(
        modifier = Modifier.zIndex(2f),
        title = { Text(text = "Theme", fontWeight = FontWeight.SemiBold, color = Orange) },
        colors = TopAppBarDefaults.topAppBarColors(BackL),
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
    Column {

    }
}