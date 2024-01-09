package com.alejandro_dev_links.bottomnavbar.presentation.navigationdrawer.components

import android.annotation.SuppressLint
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun NavigationDrawerContent() {
    val scaffoldState = rememberScaffoldState(
        drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    )
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            MyTopBar(scope = scope, scaffoldState = scaffoldState)
        },
        drawerContent = {
            MyDrawer(scope = scope, scaffoldState = scaffoldState)
        },
        drawerElevation = 20.dp,
        drawerGesturesEnabled = true
    ) {
    }
}