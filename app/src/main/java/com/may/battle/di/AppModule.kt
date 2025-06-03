package com.may.battle.di

import com.may.battle.data.FakeCategoryRepository
import com.may.battle.domain.repository.CategoryRepository
import com.may.battle.domain.usecases.GetCategoriesUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideCategoryRepository(): CategoryRepository = FakeCategoryRepository()

    @Provides
    fun provideGetCategoryUseCase(repo: CategoryRepository): GetCategoriesUseCase =
        GetCategoriesUseCase(repo)
}