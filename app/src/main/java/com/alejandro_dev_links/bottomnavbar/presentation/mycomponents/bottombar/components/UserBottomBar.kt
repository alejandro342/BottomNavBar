package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.screen.user.UserScreen

@Composable
fun UserBottomBar(navController: NavHostController) {
    val screens = listOf(
        UserScreen.Home,
        UserScreen.Favorites,
        UserScreen.Profile,
        UserScreen.Settings
    )

    val navBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackEntry?.destination
    Row(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp)
            .background(Color.White)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        screens.forEach { screen ->
            UserBottomBarItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}