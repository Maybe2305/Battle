package com.may.battle.presentation.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.may.battle.domain.model.Tournament
import com.may.battle.domain.usecases.GetTournamentByCategoryUseCase

class TournamentListViewModel(
    private val getTournamentsUseCase: GetTournamentByCategoryUseCase,
    private val categoryId: String
) : ViewModel() {

    private val _tournaments = mutableStateOf<List<Tournament>>(emptyList())
    val tournaments: State<List<Tournament>> = _tournaments

    init {
        loadTournaments()
    }

    private fun loadTournaments() {
        _tournaments.value = getTournamentsUseCase.invoke(categoryId)
    }

}