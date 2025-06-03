package com.may.battle.di

import com.may.battle.data.FakeCategoryRepository
import com.may.battle.data.FakeTournamentRepository
import com.may.battle.domain.repository.CategoryRepository
import com.may.battle.domain.repository.TournamentRepository
import com.may.battle.domain.usecases.GetCategoriesUseCase
import com.may.battle.domain.usecases.GetTournamentByCategoryUseCase
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

    @Provides
    @Singleton
    fun provideTournamentRepository(): TournamentRepository = FakeTournamentRepository()

    @Provides
    fun provideGetTournamentByCategoryUseCase(
        repo: TournamentRepository
    ): GetTournamentByCategoryUseCase = GetTournamentByCategoryUseCase(repo)
}