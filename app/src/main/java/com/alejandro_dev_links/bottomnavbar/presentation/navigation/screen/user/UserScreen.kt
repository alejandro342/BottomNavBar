package com.alejandro_dev_links.bottomnavbar.presentation.navigation.screen.user

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.ui.graphics.vector.ImageVector

sealed class UserScreen(val route: String, val title: String, val icon: ImageVector) {


    object Home : UserScreen(
        route = "user/home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Favorites : UserScreen(
        route = "user/favorites",
        title = "Favorito",
        icon = Icons.Default.Favorite
    )

    object Profile : UserScreen(
        route = "user/profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Settings : UserScreen(
        route = "user/settings",
        title = "Ajustes",
        icon = Icons.Default.Settings
    )
}