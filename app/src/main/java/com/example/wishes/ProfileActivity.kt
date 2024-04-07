package com.example.wishes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.wishes.ui.theme.BackL
import com.example.wishes.ui.theme.Blue
import com.example.wishes.ui.theme.Orange

@Composable
fun ProfileScreen(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .zIndex(2f)
            .verticalScroll(state = ScrollState(0)),
        horizontalAlignment = Alignment.Start
    ) {
        Button(
            modifier = Modifier
                .padding(16.dp)
                .size(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = BackL),
            contentPadding = PaddingValues(0.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp
            ),
            onClick = { /*TODO*/ }
        ) {
            Icon(modifier = Modifier.size(32.dp), imageVector = Icons.Filled.ArrowBack, tint = Orange, contentDescription = null)
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .zIndex(2f)
            .verticalScroll(state = ScrollState(0)),
        horizontalAlignment = Alignment.End
    ) {
        Button(
            modifier = Modifier
                .padding(16.dp)
                .size(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = BackL),
            contentPadding = PaddingValues(0.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp
            ),
            onClick = { /*TODO*/ }
        ) {
            Icon(imageVector = Icons.Filled.Settings, tint = Orange, contentDescription = null)
        }
    }
    Box(modifier = Modifier
        .zIndex(1f)
        .verticalScroll(state = ScrollState(0)),){
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.LightGray),
        )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            Spacer(modifier = Modifier.size(92.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.size(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Nick", fontSize = 20.sp, fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.size(8.dp))
                Icon(imageVector = Icons.Filled.Check, tint = Color.Cyan, contentDescription = null)
            }
            Spacer(modifier = Modifier.size(24.dp))
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "My wishes", fontWeight = FontWeight.SemiBold, fontSize = 24.sp, color = Orange)
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                for(i in 1..5) {
                    Spacer(modifier = Modifier.size(16.dp))
                    Button(
                        modifier = Modifier
                            .height(130.dp)
                            .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        shape = RoundedCornerShape(20.dp),
                        contentPadding = PaddingValues(16.dp),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        border = BorderStroke(3.dp, brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFFF631A),
                                Color(0xFFF708FF),
                            )
                        )),
                        onClick = { /*TODO*/ }
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.Start
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_launcher_background),
                                    contentScale = ContentScale.Crop,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .clip(CircleShape)
                                        .border(2.dp, Orange, CircleShape),
                                )
                                Spacer(modifier = Modifier.size(12.dp))
                                Text(text = "Nick", fontSize = 18.sp, color = Color.Black)
                            }
                            Spacer(modifier = Modifier.size(8.dp))
                            Text(text = "New title of wish", fontSize = 18.sp, fontWeight = FontWeight.Medium, color = Color.Black)
                        }
                    }
                }
                Spacer(modifier = Modifier.size(16.dp))
            }
        }
    }
}