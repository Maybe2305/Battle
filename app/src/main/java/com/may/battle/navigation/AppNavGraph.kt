package com.may.battle.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.may.battle.di.AppComponent
import com.may.battle.presentation.screens.CategoryScreen
import com.may.battle.presentation.viewmodels.CategoryViewModel

@Composable
fun AppNavGraph(
    appComponent: AppComponent
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Category.route
    ) {
        composable(Screen.Category.route) {
            val viewModel = remember {
                CategoryViewModel(appComponent.getCategoriesUseCase())
            }

            CategoryScreen(viewModel = viewModel) { selectedCategory ->
                navController.navigate("tournaments/${selectedCategory.id}")
            }
        }
    }
}