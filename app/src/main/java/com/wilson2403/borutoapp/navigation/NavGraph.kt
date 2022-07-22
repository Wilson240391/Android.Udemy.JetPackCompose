package com.wilson2403.borutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.google.accompanist.pager.ExperimentalPagerApi
import com.wilson2403.borutoapp.presentation.screens.home.HomeScreen
import com.wilson2403.borutoapp.presentation.screens.splash.SplashScreen
import com.wilson2403.borutoapp.presentation.screens.welcome.WelcomeScreen
import com.wilson2403.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun setupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
                type = NavType.IntType
            })
        ){

        }
        composable(route = Screen.Search.route){
        }
    }
}