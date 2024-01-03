package com.alejandro_dev_links.bottomnavbar.presentation.screens.home.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.alejandro_dev_links.bottomnavbar.presentation.screens.home.components.UserHomeContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserHomeScreen(navController: NavHostController) {
    Scaffold {
        UserHomeContent(navController = navController)
    }
}