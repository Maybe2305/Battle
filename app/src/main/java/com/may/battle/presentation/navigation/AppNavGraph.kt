package com.may.battle.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.may.battle.di.AppComponent
import com.may.battle.presentation.screens.CategoryScreen
import com.may.battle.presentation.screens.TournamentsListScreen
import com.may.battle.presentation.viewmodels.CategoryViewModel
import com.may.battle.presentation.viewmodels.TournamentListViewModel

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

        composable("tournaments/{categoryId}") { backStackEntry ->

            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
            val viewModel = remember {
                TournamentListViewModel(
                    getTournamentsUseCase = appComponent.getTournamentsByCategory(),
                    categoryId = categoryId
                )
            }

            TournamentsListScreen(
                viewModel = viewModel,
                onTournamentClick = { tournament ->
                    // TODO() Навигация к экрану турнира
                }
            )
        }
    }
}