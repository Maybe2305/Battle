package com.may.battle.domain.usecases

import com.may.battle.domain.model.Category
import com.may.battle.domain.repository.CategoryRepository

class GetCategoriesUseCase(
    private val repository: CategoryRepository
) {

    operator fun invoke(): List<Category> {
        return repository.getCategories()
    }
}