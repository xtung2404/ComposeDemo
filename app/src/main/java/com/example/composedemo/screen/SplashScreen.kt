package com.example.composedemo.screen

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.component.setSpace
import com.example.composedemo.ui.theme.ComposeDemoTheme
import com.example.composedemo.ui.theme.DARK_BLUE
import com.example.composedemo.ui.theme.ORANGE
import java.util.Locale

@Composable
fun splashScreen(toSignIn: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = DARK_BLUE
            )
            .padding(20.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_dot_menu),
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            tint = Color.White
        )

        setSpace(size = 24)

        Text(
            text = stringResource(id = R.string.app_slogan),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 60.sp,
            lineHeight = 68.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {
                toSignIn.invoke()
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
                    text = stringResource(id = R.string.get_started),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.Center)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_forward),
                    contentDescription = "Icon",
                    modifier = Modifier
                        .size(24.dp)
                        .background(
                            color = Color.White,
                            shape = CircleShape
                        )
                        .align(Alignment.CenterEnd),
                    tint = ORANGE
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun splashPreview() {
    ComposeDemoTheme {
        splashScreen {

        }
    }
}
