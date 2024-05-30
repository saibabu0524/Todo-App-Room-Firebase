package com.saibabui.todo_app_room_firebase.auth.login.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saibabui.todo_app_room_firebase.R
import com.saibabui.todo_app_room_firebase.auth.singup.presentation.CustomInputComponent
import com.saibabui.todo_app_room_firebase.ui.theme.TodoAppRoomFirebaseTheme
import com.saibabui.todo_app_room_firebase.ui.theme.bodyFontFamily
import com.saibabui.todo_app_room_firebase.ui.theme.boldTitle

@Composable
fun LoginScreen() {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = R.drawable.two_circle_shape),
                contentDescription = "custom shape",
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
                    .offset((-96).dp, (-94).dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 50.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(32.dp)
                ) {
                    Text(
                        text = "Welcome Back!",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontFamily = boldTitle,
                        color = MaterialTheme.colorScheme.onSurface,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 20.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.access_account_login_image),
                        contentDescription = "Dashboard User Image",
                        modifier = Modifier
                            .width(250.dp)
                            .height(250.dp)
                            .alpha(0.8f)
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(32.dp)
                ) {
                    CustomInputComponent()
                    CustomInputComponent()
                    Text(
                        text = "Forgot Password?",
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .padding(top = 8.dp, end = 26.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.End
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(top = 24.dp)
                            .fillMaxWidth()
                            .height(50.dp)
                            .alpha(0.8f)
                    ) {
                        Text(
                            text = "Login",
                            fontSize = 20.sp,
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontFamily = boldTitle,
                            textAlign = TextAlign.Center,
                            fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                            lineHeight = 20.sp,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Text(
                        text = "Don’t have an account ? Sign Up",
                        fontSize = 16.sp,
                        fontFamily = bodyFontFamily,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(top = 8.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun LoginScreenPreview() {
    TodoAppRoomFirebaseTheme {
        LoginScreen()
    }
}
