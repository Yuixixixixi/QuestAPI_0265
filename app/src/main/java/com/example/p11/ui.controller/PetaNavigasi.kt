package com.example.p11.ui.controller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.p11.ui.controller.route.DestinasiEntry
import com.example.p11.ui.controller.route.DestinasiHome
import com.example.p11.view.EntrySiswaScreen
import com.example.p11.view.HomeScreen

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) { _ ->
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) }
            )
        }
        composable(DestinasiEntry.route) { _ ->
            EntrySiswaScreen(
                navigateBack = { navController.navigate(DestinasiHome.route) }
            )
        }
    }
}