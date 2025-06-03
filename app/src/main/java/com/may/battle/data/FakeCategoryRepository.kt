package com.may.battle.data

import com.may.battle.domain.model.Category
import com.may.battle.domain.repository.CategoryRepository

class FakeCategoryRepository : CategoryRepository {
    override fun getCategories(): List<Category> {
        return listOf(
            Category("cinema", "Кино"),
            Category("sport", "Спорт"),
            Category("music", "Музыка"),
            Category("games", "Игры")
        )
    }
}