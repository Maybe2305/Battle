package com.may.battle.navigation

sealed class Screen(val route: String) {

    object Category : Screen("category")

    object TournamentList : Screen("tournaments/{categoryId}") {
        fun createRoute(categoryId: String) = "tournaments/$categoryId"
    }
}