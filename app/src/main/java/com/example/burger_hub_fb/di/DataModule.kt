package com.example.burger_hub_fb.di

import com.example.burger_hub_fb.data.api.ServiceAPI
import com.example.burger_hub_fb.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

    @Provides
    @Singleton
    fun providesServiceAPI(
        serviceProvider: ServiceProvider
    ): ServiceAPI {
        return serviceProvider.createService(ServiceAPI::class.java)
    }
}