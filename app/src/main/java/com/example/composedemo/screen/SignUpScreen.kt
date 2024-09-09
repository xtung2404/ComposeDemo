package com.example.composedemo.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.component.setSpace
import com.example.composedemo.ui.theme.ComposeDemoTheme
import com.example.composedemo.ui.theme.DARK_BLUE
import com.example.composedemo.ui.theme.GREY
import com.example.composedemo.ui.theme.ORANGE

@Composable
fun signUpScreen(onSignUpClick: () -> Unit, toSignIn: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DARK_BLUE)
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
            text = stringResource(id = R.string.sign_up),
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        setSpace(4)

        Text(
            text = "Enter your details below to create your account and get started",
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            color = Color.Gray)

        setSpace(size = 24)

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
            colors = TextFieldDefaults.colors(
                contentColorFor(backgroundColor = Color.White)
            ),
            modifier = Modifier
                .fillMaxWidth()

        )

        setSpace(size = 8)

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            placeholder = {
                Text(text = stringResource(id = R.string.email))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Example Icon",
                    tint = Color.Gray
                )

            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            colors = TextFieldDefaults.colors(
                contentColorFor(backgroundColor = Color.White)
            ),
            modifier = Modifier
                .fillMaxWidth()

        )

        setSpace(size = 8)

        OutlinedTextField(
            value = "",
            onValueChange = {
                phoneNumber = it
            },
            placeholder = {
                Text(text = stringResource(id = R.string.phone_number))
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
            colors = TextFieldDefaults.colors(
                contentColorFor(backgroundColor = Color.White)
            ),
            modifier = Modifier
                .fillMaxWidth()

        )

        setSpace(size = 8)

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
                Text(text = stringResource(id = R.string.password))
            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            colors = TextFieldDefaults.colors(
                contentColorFor(backgroundColor = Color.White)
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()


        )

        setSpace(size = 16)

        Button(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(
                containerColor = ORANGE
            )
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.sign_up),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        setSpace(size = 8)

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.already_have_account),
                fontSize = 16.sp,
                color = Color.Gray
            )

            Text(
                text = stringResource(id = R.string.sign_in),
                fontSize = 16.sp,
                color = ORANGE,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    toSignIn.invoke()
                })
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun signUpPreview() {
    ComposeDemoTheme {
        signUpScreen(onSignUpClick = {  }) {
            
        }
    }
}