package com.example.wishes

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.wishes.ui.theme.BackL
import com.example.wishes.ui.theme.Blue
import com.example.wishes.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CollectionScreen(){
    TopAppBar(
        modifier = Modifier.zIndex(2f),
        title = { Text(text = "My collections", fontWeight = FontWeight.SemiBold, color = Orange) },
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
            .padding(16.dp)
            .fillMaxSize()
            .verticalScroll(state = ScrollState(0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(modifier = Modifier.size(60.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.valentine_collect),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(110.dp)
                    .clip(RoundedCornerShape(20.dp)),
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(text = "Valentine day wishlist", fontWeight = FontWeight.SemiBold, fontSize = 20.sp, color = Orange)
                Spacer(modifier = Modifier.size(6.dp))
                Text(text = "20 items", fontSize = 14.sp, color = Orange)
            }
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.default_collect),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(110.dp)
                    .clip(RoundedCornerShape(20.dp)),
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(text = "Birthday wishlist", fontWeight = FontWeight.SemiBold, fontSize = 20.sp, color = Orange)
                Spacer(modifier = Modifier.size(6.dp))
                Text(text = "8 items", fontSize = 14.sp, color = Orange)
            }
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.christmas_collect),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(110.dp)
                    .clip(RoundedCornerShape(20.dp)),
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(text = "Christmas wishlist", fontWeight = FontWeight.SemiBold, fontSize = 20.sp, color = Orange)
                Spacer(modifier = Modifier.size(6.dp))
                Text(text = "15 items", fontSize = 14.sp, color = Orange)
            }
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .size(110.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Orange),
                onClick = { /*TODO*/ }
            ) {
                Icon(modifier = Modifier
                    .size(56.dp),
                    imageVector = Icons.Filled.Add, tint = Blue, contentDescription = null)
            }
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(text = "Create new wishlist", fontWeight = FontWeight.SemiBold, fontSize = 20.sp, color = Orange)
            }
        }
    }
}