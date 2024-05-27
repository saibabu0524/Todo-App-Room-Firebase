package com.saibabui.todo_app_room_firebase.auth.singup.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saibabui.todo_app_room_firebase.R
import com.saibabui.todo_app_room_firebase.ui.theme.TodoAppRoomFirebaseTheme
import com.saibabui.todo_app_room_firebase.ui.theme.bodyFontFamily
import com.saibabui.todo_app_room_firebase.ui.theme.boldTitle

@Composable
fun SignUpScreen() {
    Scaffold { innerPadding ->
        val modifier = Modifier
            .fillMaxHeight()
            .padding(innerPadding)
        Box(modifier.verticalScroll(rememberScrollState()).padding(top = 50.dp)) {
            Image(
                painter = painterResource(id = R.drawable.two_circle_shape),
                contentDescription = "custom shape",
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
                    .offset((-96).dp, (-94).dp)

            )
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxHeight().padding(vertical = 50.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(bottom = 16.dp)) {
                        Text(
                            text = "Welcome Onboard!",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize,
                            fontFamily = boldTitle,
                            color = MaterialTheme.colorScheme.onSurface,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "Lets help you in completing your tasks",
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            fontFamily = bodyFontFamily,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(horizontal = 20.dp),
                            textAlign = TextAlign.Center,
                            lineHeight = 20.sp,
                        )
                    }
                    CustomInputComponent()
                    CustomInputComponent()
                    CustomInputComponent()
                    CustomInputComponent()
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .padding(horizontal = 20.dp).
                                    padding(top = 24.dp)
                                .fillMaxWidth()
                                .height(50.dp)
                                .alpha(0.8f)
                        ) {
                            Text(
                                text = "Register",
                                fontSize = 20.sp,
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontFamily = boldTitle,
                                textAlign = TextAlign.Center,
                                fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                                lineHeight = 20.sp,
                                style = MaterialTheme.typography.bodyLarge,
                            )
                        }
                        Text(text = "Already have an account ?",
                            fontSize = 16.sp,
                            fontFamily = bodyFontFamily,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(horizontal = 20.dp).padding(top=8.dp),)
                    }
                }
            }
        }
    }
}


@Composable
fun CustomInputComponent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        var state by remember { mutableStateOf("") }
        Text(
            text = "Full Name",
            style = MaterialTheme.typography.titleMedium,
            fontFamily = bodyFontFamily,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 30.dp),
            textAlign = TextAlign.Start,
            lineHeight = 20.sp,
        )
        TextField(
            value = state, onValueChange = {
                state = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp).padding(bottom = 8.dp),
            shape = RoundedCornerShape(50.dp),
            placeholder = {
                Text(
                    text = "Mary Elliot",
                    style = MaterialTheme.typography.bodyLarge,
                    fontFamily = bodyFontFamily,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Start,
                    lineHeight = 20.sp,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    modifier = Modifier.alpha(0.5f)
                )
            },
            colors = TextFieldDefaults.colors(
                disabledTextColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}


@Preview
@Composable
private fun SignUpScreenPreview() {
    TodoAppRoomFirebaseTheme {
        SignUpScreen()
    }
}

@Preview
@Composable
private fun CustomInputComponentPreview() {
    TodoAppRoomFirebaseTheme {
        CustomInputComponent()
    }
}

