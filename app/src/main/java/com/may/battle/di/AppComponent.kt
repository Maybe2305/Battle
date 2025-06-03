package com.may.battle.di

import com.may.battle.domain.usecases.GetCategoriesUseCase
import com.may.battle.domain.usecases.GetTournamentByCategoryUseCase
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getCategoriesUseCase(): GetCategoriesUseCase
    fun getTournamentsByCategory(): GetTournamentByCategoryUseCase
}