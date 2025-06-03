package com.may.battle.di

import com.may.battle.domain.usecases.GetCategoriesUseCase
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getCategoriesUseCase(): GetCategoriesUseCase
}