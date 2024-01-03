package com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.screen

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alejandro_dev_links.bottomnavbar.presentation.mycomponents.bottombar.components.UserBottomBar
import com.alejandro_dev_links.bottomnavbar.presentation.navigation.graph.user.UserNavGraph


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun UserHomerScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            UserBottomBar(navController = navController)
        }
    ) {
        UserNavGraph(navController = navController)
    }
}