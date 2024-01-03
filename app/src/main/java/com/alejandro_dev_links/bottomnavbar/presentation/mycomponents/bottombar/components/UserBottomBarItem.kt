package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.screen.user.UserScreen

@Composable
fun RowScope.UserBottomBarItem(
    screen: UserScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(label = { Text(text = screen.title) },
        icon = { Icon(imageVector = screen.icon, contentDescription = "icono") },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(route = screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}