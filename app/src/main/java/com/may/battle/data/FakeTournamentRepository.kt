package com.may.battle.data

import com.may.battle.domain.model.Tournament
import com.may.battle.domain.repository.TournamentRepository

class FakeTournamentRepository : TournamentRepository {

    private val tournaments = listOf(
        Tournament("1", "sport", "Лучший футболист"),
        Tournament("2", "sport", "Самая красивая жена футболиста"),
        Tournament("3", "sport", "Лучшая футбольная команда"),
        Tournament("4", "cinema", "Лучший фильм"),
        Tournament("5", "cinema", "Лучший сериал"),
        Tournament("6", "cinema", "Самая красивая актриса"),
        Tournament("7", "music", "Лучший исполнитель"),
        Tournament("8", "music", "Лучший Hip-Hop исполнитель"),
        Tournament("9", "music", "Лучший композитор"),
        Tournament("10", "games", "Лучшая игра"),
        Tournament("11", "games", "Лучший сюжет игры"),
        Tournament("12", "games", "Лучший персонаж в игре"),
    )

    override fun getTournamentByCategory(categoryId: String): List<Tournament> {
        return tournaments.filter { it.categoryId == categoryId }
    }

}