package com.example.composedemo.screen

import android.text.style.AlignmentSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.component.setSpace
import com.example.composedemo.ui.theme.ComposeDemoTheme
import com.example.composedemo.ui.theme.DARK_BLUE
import com.example.composedemo.ui.theme.ORANGE

@Composable
fun dashboardScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(ORANGE)
            .padding(20.dp, 20.dp, 20.dp, 0.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_dot_menu),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.CenterStart),
                tint = Color.White,
            )

            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Icon",
                modifier = Modifier
                    .size(30.dp)
                    .background(
                        color = Color.White,
                        shape = CircleShape
                    )
                    .align(Alignment.CenterEnd),
                tint = ORANGE
            )
        }

        setSpace(size = 30)

        Text(
            text = stringResource(id = R.string.my_notes),
            color = DARK_BLUE,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
        )

        setSpace(size = 24)

        OutlinedTextField(
            value = "",
            onValueChange = {

            },
            placeholder = {
                Text(text = stringResource(id = R.string.search))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Example Icon",
                    tint = Color.Black
                )

            },
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            colors = TextFieldDefaults.colors(
                contentColorFor(backgroundColor = Color.White),

            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun dashboardPreview() {
    ComposeDemoTheme {
        dashboardScreen()
    }
}