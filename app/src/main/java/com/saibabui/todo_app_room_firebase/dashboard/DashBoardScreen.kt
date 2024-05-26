package com.saibabui.todo_app_room_firebase.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import com.saibabui.todo_app_room_firebase.ui.theme.TodoAppRoomFirebaseTheme
import com.saibabui.todo_app_room_firebase.ui.theme.bodyFontFamily
import com.saibabui.todo_app_room_firebase.ui.theme.boldTitle

@Composable
fun DashBoardScreen(modifier: Modifier = Modifier) {
    Box(modifier) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.two_circle_shape),
                contentDescription = "custom shape",
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .offset((-66).dp, (-94).dp)

            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize().offset(y = (-40).dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dashboard_user_with_mobile_icon),
                    contentDescription = "Dashboard User Image",
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp).alpha(0.8f)
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Get things done with TODO",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontFamily = boldTitle,
                        color = MaterialTheme.colorScheme.onSurface,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed posuere gravida purus id eu condimentum est diam quam. Condimentum blandit diam.",
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontFamily = bodyFontFamily,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(horizontal = 20.dp, ),
                        textAlign = TextAlign.Center,
                        lineHeight = 20.sp,
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth()
                        .height(60.dp)
                        .alpha(0.8f)
                ) {
                    Text(
                        text = "Get Started",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontFamily = boldTitle
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun DashBoardPreview() {
    val modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
        .padding(16.dp)
    TodoAppRoomFirebaseTheme() {
        DashBoardScreen(modifier)
    }
}