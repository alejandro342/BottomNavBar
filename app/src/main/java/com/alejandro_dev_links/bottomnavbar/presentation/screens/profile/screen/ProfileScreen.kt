package com.alejandro_dev_links.bottomnavbar.presentation.screens.profile.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.alejandro_dev_links.bottomnavbar.presentation.screens.profile.components.ProfileContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold {
        ProfileContent(navController = navController)
    }
}