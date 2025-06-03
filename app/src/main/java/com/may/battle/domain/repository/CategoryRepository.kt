package com.may.battle.domain.repository

import com.may.battle.domain.model.Category

interface CategoryRepository {
    fun getCategories(): List<Category>
}