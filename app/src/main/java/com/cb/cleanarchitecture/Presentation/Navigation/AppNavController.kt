package com.cb.cleanarchitecture.Presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.cb.cleanarchitecture.Presentation.screen.DetailScreen.DetailScreen
import com.cb.cleanarchitecture.Presentation.screen.HomeScreen.HomeScreen

@Composable
fun  AppNavController() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination =ScreenName.Home_Screen){
    composable(route  = ScreenName.Home_Screen){
    HomeScreen{
        navController.navigate(ScreenName.Detail_Screen)
    }
}
        composable(route  = ScreenName.Detail_Screen){
            DetailScreen{
                navController.popBackStack()
            }
        }
    }


}