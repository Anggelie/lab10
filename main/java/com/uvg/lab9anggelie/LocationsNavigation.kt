package com.uvg.lab9anggelie

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun LocationsNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "locations_list"
    ) {
        composable("locations_list") {
            LocationListScreen(navController)
        }
        composable(
            route = "location_details/{locationId}",
            arguments = listOf(navArgument("locationId") { type = NavType.StringType })
        ) { backStackEntry ->
            val locationId = backStackEntry.arguments?.getString("locationId")
            locationId?.let {
                LocationDetailsScreen(locationId = it, navController = navController)
            }
        }
    }
}