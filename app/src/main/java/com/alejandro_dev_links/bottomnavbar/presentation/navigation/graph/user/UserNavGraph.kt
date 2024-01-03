package com.alejandro_dev_links.bottomnavbar.presentation.navigation.graph.user

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.Graph
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.screen.user.UserScreen
import com.alejandro_dev_links.bottomnavbar.presentation.screens.favorites.screen.FavoritesScreen
import com.alejandro_dev_links.bottomnavbar.presentation.screens.home.screen.UserHomeScreen
import com.alejandro_dev_links.bottomnavbar.presentation.screens.profile.screen.ProfileScreen
import com.alejandro_dev_links.bottomnavbar.presentation.screens.settings.screen.SettingsScreen

@Composable
fun UserNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.USER,
        startDestination = UserScreen.Home.route
    ) {
        composable(route = UserScreen.Home.route) {
            UserHomeScreen(navController = navController)
        }

        composable(route = UserScreen.Favorites.route) {
            FavoritesScreen(navController = navController)
        }
        composable(route = UserScreen.Profile.route) {
            ProfileScreen(navController = navController)
        }
        composable(route = UserScreen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }
}