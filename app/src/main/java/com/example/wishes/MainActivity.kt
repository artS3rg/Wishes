package com.example.wishes

import com.example.wishes.ui.theme.Orange
import com.example.wishes.ui.theme.Blue
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.wishes.ui.theme.BackL
import com.example.wishes.ui.theme.BackD
import com.example.wishes.ui.theme.WishesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WishesTheme {
//                LoginScreen()
//                RegScreen()
                HomeScreen()
//                ProfileScreen()
//                CollectionScreen()
//                WishScreen()
//                SettingsScreen()
//                LanguageActivity()
            }
        }
    }
}

@Composable
fun LoginScreen(){
    val context = LocalContext.current
    val login = remember { mutableStateOf(TextFieldValue()) }
    val loginErrorState = remember { mutableStateOf(false) }
    val passwordErrorState = remember { mutableStateOf(false) }
    val password = remember { mutableStateOf(TextFieldValue()) }
    val passwordVisibility = remember { mutableStateOf(true) }
    Column (
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Welcome!", color = Orange, fontSize = 42.sp)
        Spacer(modifier = Modifier.size(128.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Orange,
            ),
            value = login.value,
            onValueChange = {
                if (loginErrorState.value) {
                    loginErrorState.value = false
                }
                login.value = it
            },
            isError = loginErrorState.value,
            singleLine = true,
            leadingIcon = { Icon(Icons.Filled.Person, contentDescription = null) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            shape = MaterialTheme.shapes.extraLarge.copy(),
            placeholder = {
                Text(text = "Login")
            },
            label = {
                Text(text = "Enter login")
            }
        )
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Orange,
            ),
            value = password.value,
            onValueChange = {
                if (passwordErrorState.value) {
                    passwordErrorState.value = false
                }
                password.value = it
            },
            isError = passwordErrorState.value,
            singleLine = true,
            leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = null) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = MaterialTheme.shapes.extraLarge.copy(),
            placeholder = {
                Text(text = "Password")
            },
            label = {
                Text(text = "Enter Password*")
            },
        )
        Spacer(modifier = Modifier.size(8.dp))
        TextButton(
            modifier = Modifier.align(Alignment.End),
            contentPadding = PaddingValues(0.dp),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Forgot Password?", fontSize = 16.sp, color = Orange)
        }
        Spacer(modifier = Modifier.size(64.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Orange),
            modifier = Modifier
                .width(90.dp)
                .height(42.dp),
        ) {
            Text(text = "OK", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(text = "Not a member?", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Orange)
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Register now", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Blue)
            }
        }
    }
}

@Composable
fun RegScreen(){
    val context = LocalContext.current
    val login = remember { mutableStateOf(TextFieldValue()) }
    val loginErrorState = remember { mutableStateOf(false) }
    val passwordErrorState = remember { mutableStateOf(false) }
    val password = remember { mutableStateOf(TextFieldValue()) }
    val passwordVisibility = remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Wishes", color = Orange, fontSize = 60.sp)
        Spacer(modifier = Modifier.size(128.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Orange,
            ),
            value = login.value,
            onValueChange = {
                if (loginErrorState.value) {
                    loginErrorState.value = false
                }
                login.value = it
            },
            isError = loginErrorState.value,
            singleLine = true,
            leadingIcon = { Icon(Icons.Filled.Person, contentDescription = null) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            shape = MaterialTheme.shapes.extraLarge.copy(),
            placeholder = {
                Text(text = "Login")
            },
            label = {
                Text(text = "Enter login")
            }
        )
        Spacer(modifier = Modifier.size(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Orange,
            ),
            value = password.value,
            onValueChange = {
                if (passwordErrorState.value) {
                    passwordErrorState.value = false
                }
                password.value = it
            },
            isError = passwordErrorState.value,
            singleLine = true,
            leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = null) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = MaterialTheme.shapes.extraLarge.copy(),
            placeholder = {
                Text(text = "Password")
            },
            label = {
                Text(text = "Enter Password*")
            },
        )
        Spacer(modifier = Modifier.size(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Orange,
            ),
            value = password.value,
            onValueChange = {
                if (passwordErrorState.value) {
                    passwordErrorState.value = false
                }
                password.value = it
            },
            isError = passwordErrorState.value,
            singleLine = true,
            leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = null) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = MaterialTheme.shapes.extraLarge.copy(),
            placeholder = {
                Text(text = "Password")
            },
            label = {
                Text(text = "Confirm Password*")
            },
        )
        Spacer(modifier = Modifier.size(64.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Orange),
            modifier = Modifier
                .width(90.dp)
                .height(42.dp),
        ) {
            Text(text = "OK", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(text = "Have account?", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Orange)
            TextButton(onClick = {

            }) {
                Text(text = "Sign in", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Blue)
            }
        }
    }
}