package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.screen.user.UserScreen
import com.alejandro_dev_links.bottomnavbar.ui.theme.PrimaryBlue
import com.alejandro_dev_links.bottomnavbar.ui.theme.Purple40

@Composable
fun RowScope.UserBottomBarItem(
    screen: UserScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
    val background = if (selected) PrimaryBlue.copy(alpha = 0.8f) else Color.Transparent
    val contentColor = if (selected) Color.White else Color.Black
    Box(modifier = Modifier
        .height(40.dp)
        .clip(CircleShape)
        .background(background)
        .clickable {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }) {
        Row(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(imageVector = screen.icon, contentDescription = null, tint = contentColor)
            AnimatedVisibility(visible = selected) {
                Text(text = screen.title, color = contentColor)
            }
        }
    }
}