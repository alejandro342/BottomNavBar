package com.alejandro_dev_links.bottomnavbar.presentation.navigationdrawer.components

import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState
) {

        TopAppBar(title = { Text(text = "Menu", color = Color.White) },
            navigationIcon = {
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Menu, contentDescription = null,
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO: Display SnapBar*/ }, modifier = Modifier) {
                    Icon(
                        imageVector = Icons.Outlined.Search, contentDescription = null,
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO: Display Settings*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Settings, contentDescription = null,
                        tint = Color.White
                    )
                }
            })

}