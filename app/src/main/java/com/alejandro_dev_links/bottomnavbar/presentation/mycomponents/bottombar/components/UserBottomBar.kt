package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.screen.user.UserScreen
import com.alejandro_dev_links.bottomnavbar.ui.theme.PrimaryBlue

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
    val bottomBarDestination = screens.any { it.route == currentDestination?.route }
    if (bottomBarDestination) {
        NavigationBar(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                .height(60.dp),
            containerColor = PrimaryBlue
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
}