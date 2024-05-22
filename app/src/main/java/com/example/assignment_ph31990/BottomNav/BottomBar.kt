package com.example.assignment_ph31990.BottomNav

import com.example.assignment_ph31990.R

sealed class BottomBar(
    val route: String,
    val title: String,
    val icon: Int
){
    object Home: BottomBar(
        route = "home",
        title = "",
        icon = R.drawable.ic_home
    )
    object Favorites: BottomBar(
        route = "favorites",
        title = "",
        icon = R.drawable.ic_bookmark
    )
    object Notification: BottomBar(
        route = "notification",
        title = "",
        icon = R.drawable.ic_notification
    )
    object Profile: BottomBar(
        route = "profile",
        title = "",
        icon = R.drawable.ic_person
    )
}