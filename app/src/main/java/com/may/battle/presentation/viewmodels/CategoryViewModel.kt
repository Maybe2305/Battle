package com.may.battle.presentation.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.may.battle.domain.model.Category
import com.may.battle.domain.usecases.GetCategoriesUseCase

class CategoryViewModel(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    private val _categories = mutableStateOf<List<Category>>(emptyList())
    val categories: State<List<Category>> = _categories

    init {
        loadCategories()
    }

    private fun loadCategories() {
        _categories.value = getCategoriesUseCase()
    }

}