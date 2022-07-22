package com.wilson2403.borutoapp.navigation

sealed class Screen(val route: String){
    object Splash: Screen("splash_scree")
    object Welcome: Screen("welcome_scree")
    object Home: Screen("home_screen")
    object Details: Screen("details_screen/{heroId}"){
        fun passHeroId(heroId: Int): String{
            return "details_screen/$heroId"
        }
    }
    object Search: Screen("search_screen")
}
