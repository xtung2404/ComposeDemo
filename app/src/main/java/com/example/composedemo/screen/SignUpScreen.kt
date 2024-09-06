package com.example.composedemo.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.component.setSpace
import com.example.composedemo.ui.theme.GREY

@Composable
fun signUpScreen(onSignUpClick: () -> Unit, toSignIn: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GREY)
            .padding(8.dp, 0.dp),
        verticalArrangement = Arrangement.Center,

        ) {
        var username by remember {
            mutableStateOf("")
        }

        var email by remember {
            mutableStateOf("")
        }

        var phoneNumber by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }
        Text(
            text = "Sign up",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        setSpace(4)

        Text(
            text = "Enter your details below to create your account and get started",
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            color = Color.Gray)

        setSpace(size = 24)

        Text(
            text = stringResource(id = R.string.full_name),
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            color = Color.Gray)

        setSpace(size = 4)

        OutlinedTextField(
            value = username,
            onValueChange = {
                username = it
            },
            placeholder = {
                Text(text = "enter...")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Example Icon",
                    tint = Color.Gray
                )

            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
        )

        setSpace(size = 4)

        Text(
            text = stringResource(id = R.string.email),
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            color = Color.Gray)

        setSpace(size = 8)

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            placeholder = {
                Text(text = "email...")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Example Icon",
                    tint = Color.Gray // Optional: Change icon color
                )

            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
        )

        setSpace(size = 4)

        Text(
            text = stringResource(id = R.string.phone_number),
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            color = Color.Gray)

        setSpace(size = 4)

        OutlinedTextField(
            value = "",
            onValueChange = {
                phoneNumber = it
            },
            placeholder = {
                Text(text = "phone number...")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "Example Icon",
                    tint = Color.Gray
                )

            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
        )

        setSpace(size = 4)

        Text(
            text = stringResource(id = R.string.password),
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            color = Color.Gray)

        setSpace(size = 4)

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "Example Icon",
                    tint = Color.Gray
                )

            },
            placeholder = {
                Text(text = "Password")
            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)

        )

        setSpace(size = 16)

        Button(
            onClick = {
                      onSignUpClick.invoke()
            },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Blue
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        ) {
            Text(
                text = "Sign up",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Already have an account? ",
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
                color = Color.Gray)

            Text(
                text = "Sign in",
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
                color = Color.Blue,
                modifier = Modifier.clickable {
                    toSignIn.invoke()
                })
        }
    }
}