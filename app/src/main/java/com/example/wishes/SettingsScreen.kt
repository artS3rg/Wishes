package com.example.wishes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.wishes.ui.theme.BackL
import com.example.wishes.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(){
    TopAppBar(
        modifier = Modifier.zIndex(2f),
        title = { Text(text = "Settings", fontWeight = FontWeight.SemiBold, color = Orange) },
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
    Column(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .verticalScroll(state = ScrollState(0)),
    ) {
        Spacer(modifier = Modifier.size(76.dp))
        Text(text = "Profile", fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.Black)
        Spacer(modifier = Modifier.size(8.dp))
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
            ) {
                Row {
                    Icon(imageVector = Icons.Filled.AccountBox, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Update banner",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
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
                    Icon(imageVector = Icons.Filled.AccountCircle, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Update photo",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
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
                    Icon(imageVector = Icons.Filled.Lock, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Change password",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(24.dp))
        Text(text = "Application", fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.Black)
        Spacer(modifier = Modifier.size(12.dp))
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
                    Icon(imageVector = Icons.Filled.LocationOn, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Language",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
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
                    Icon(imageVector = Icons.Filled.Edit, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Change theme",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(24.dp))
        Text(text = "Help", fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.Black)
        Spacer(modifier = Modifier.size(12.dp))
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
                    Icon(imageVector = Icons.Filled.Person, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Support",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
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
                    Icon(imageVector = Icons.Filled.Info, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "FAQ",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
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
                    Icon(imageVector = Icons.Filled.Lock, tint = Orange, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        text = "Privacy policy",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Orange
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(120.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Wishes for Android v0.0.1", fontSize = 13.sp)
        }
        Spacer(modifier = Modifier.size(12.dp))
    }
}