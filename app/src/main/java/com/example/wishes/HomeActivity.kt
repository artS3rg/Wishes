package com.example.wishes

import android.widget.ImageButton
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.wishes.ui.theme.BackL
import com.example.wishes.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    TopAppBar(
        modifier = Modifier
            .zIndex(2f),
        title = { Text(text = "Home", fontWeight = FontWeight.Bold, fontSize = 26.sp, color = Orange) },
        colors = TopAppBarDefaults.topAppBarColors(BackL),
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(modifier = Modifier.size(32.dp), imageVector = Icons.Filled.Search, tint = Orange, contentDescription = null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(modifier = Modifier.size(32.dp), imageVector = Icons.Filled.Person, tint = Orange, contentDescription = null)
            }
        }
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = ScrollState(0)),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Spacer(modifier = Modifier.size(76.dp))
            Button(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFAA5FFF)),
                shape = RoundedCornerShape(20.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                contentPadding = PaddingValues(0.dp),
                onClick = { /*TODO*/ }
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.wishes_plus),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.size(24.dp))
            Text(text = "My collections", fontWeight = FontWeight.SemiBold, fontSize = 24.sp, color = Orange)
            Spacer(modifier = Modifier.size(16.dp))
        }
        Row(
            modifier = Modifier
                .horizontalScroll(state = ScrollState(0)),
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(modifier = Modifier.size(16.dp))
            Button(
                modifier = Modifier.size(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                shape = RoundedCornerShape(20.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                contentPadding = PaddingValues(0.dp),
                onClick = { /*TODO*/ }
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.valentine_collect),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Button(
                modifier = Modifier.size(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                shape = RoundedCornerShape(20.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                contentPadding = PaddingValues(0.dp),
                onClick = { /*TODO*/ }
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.christmas_collect),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Button(
                modifier = Modifier.size(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                shape = RoundedCornerShape(20.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                contentPadding = PaddingValues(0.dp),
                onClick = { /*TODO*/ }
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.default_collect),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Spacer(modifier = Modifier.size(15.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(modifier = Modifier.size(38.dp), imageVector = Icons.Filled.ArrowForward, tint = Orange, contentDescription = null)
            }
            Spacer(modifier = Modifier.size(40.dp))
        }
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Spacer(modifier = Modifier.size(24.dp))
            Text(text = "Last wishes", fontWeight = FontWeight.SemiBold, fontSize = 24.sp, color = Orange)
            for(i in 1..5) {
                Spacer(modifier = Modifier.size(16.dp))
                Button(
                    modifier = Modifier
                        .height(460.dp)
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
                        Spacer(modifier = Modifier.size(12.dp))
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentScale = ContentScale.Crop,
                            contentDescription = null,
                            modifier = Modifier
                                .size(300.dp)
                                .clip(RoundedCornerShape(20.dp))
                                .align(Alignment.CenterHorizontally),
                        )
                        Spacer(modifier = Modifier.size(12.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(modifier = Modifier.size(20.dp), tint = Color.LightGray, imageVector = Icons.Filled.Face, contentDescription = null)
                            Spacer(modifier = Modifier.size(8.dp))
                            Text(text = "123", color = Color.LightGray)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
        }
    }
}

@Composable
fun ScrollToTopButton(onClick: () -> Unit) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp), Alignment.BottomCenter
    ) {
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .shadow(10.dp, shape = CircleShape)
                .clip(shape = CircleShape)
                .size(65.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Orange
            )
        ) {
            Icon(Icons.Filled.KeyboardArrowUp, "arrow up")
        }
    }
}