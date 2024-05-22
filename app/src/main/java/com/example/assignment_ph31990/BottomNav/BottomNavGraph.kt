package com.example.assignment_ph31990.BottomNav

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assignment_ph31990.BottomNav.BottomBar
import com.example.assignment_ph31990.Screen.FavoritesScreen
import com.example.assignment_ph31990.Screen.HomeScreen
import com.example.assignment_ph31990.Screen.NotificationScreen
import com.example.assignment_ph31990.Screen.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController,innerPadding: PaddingValues = PaddingValues()){
    NavHost(navController = navController, startDestination = BottomBar.Home.route) {
        composable(route = BottomBar.Home.route){
            HomeScreen()
        }
        composable(route = BottomBar.Favorites.route){
            FavoritesScreen()
        }
        composable(route = BottomBar.Notification.route){
            NotificationScreen()
        }
        composable(route = BottomBar.Profile.route){
            ProfileScreen()
        }
    }
}