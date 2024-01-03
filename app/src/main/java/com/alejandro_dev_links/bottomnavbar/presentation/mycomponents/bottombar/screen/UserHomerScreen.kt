package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components.UserBottomBar
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.graph.user.UserNavGraph
import com.alejandro_dev_links.bottomnavbar.ui.theme.PrimaryBlue


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun UserHomerScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            UserBottomBar(navController = navController)
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier,
                contentColor = Color.White,
                backgroundColor = PrimaryBlue,
                elevation = FloatingActionButtonDefaults.elevation(2.dp, 3.dp),
                onClick = { }) {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center
    ) {
        UserNavGraph(navController = navController)
    }
}