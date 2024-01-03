package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
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
    BottomAppBar(
        cutoutShape = CircleShape
    ) {

        val navBackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackEntry?.destination
        val bottomBarDestination = screens.any { it.route == currentDestination?.route }
        if (bottomBarDestination) {
            BottomNavigation(modifier = Modifier) {
                screens.forEach { screen ->
                    UserBottomBarItem(
                        screen = screen,
                        currentDestination = currentDestination,
                        navController = navController
                    )
                }
            }
        }
    }

}