package com.may.battle.domain.repository

import com.may.battle.domain.model.Tournament

interface TournamentRepository {

    fun getTournamentByCategory(categoryId: String): List<Tournament>
}