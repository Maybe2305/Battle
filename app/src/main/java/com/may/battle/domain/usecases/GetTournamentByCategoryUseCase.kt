package com.may.battle.domain.usecases

import com.may.battle.domain.model.Tournament
import com.may.battle.domain.repository.TournamentRepository

class GetTournamentByCategoryUseCase(
    private val repository: TournamentRepository
) {
    operator fun invoke(categoryId: String): List<Tournament> {
        return repository.getTournamentByCategory(categoryId)
    }
}