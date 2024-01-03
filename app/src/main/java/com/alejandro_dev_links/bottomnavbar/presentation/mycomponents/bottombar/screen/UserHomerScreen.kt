package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components.UserBottomBar
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.graph.user.UserNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserHomerScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            UserBottomBar(navController = navController)
        }) {
        UserNavGraph(navController = navController)
    }
}