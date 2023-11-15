package com.example.burger_hub_fb.di

import com.example.burger_hub_fb.data.repository.BurgerRepository
import com.example.burger_hub_fb.data.repository.BurgerRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {
    @Binds
    abstract fun bindsBurgerRepositoryImpl(
        burgerRepositoryImpl: BurgerRepositoryImpl
    ): BurgerRepository
}