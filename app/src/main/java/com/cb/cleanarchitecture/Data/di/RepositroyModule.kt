package com.cb.cleanarchitecture.Data.di

import com.cb.cleanarchitecture.Data.remote.Apiinterface
import com.cb.cleanarchitecture.Data.repositroyImpl.QuoteRepositroyImp
import com.cb.cleanarchitecture.Domains.repositroy.QuoteRepositroy
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositroyModule {

    @Singleton
    @Provides
    fun getQuotesRepositroy(
        apiinterface: Apiinterface):
            QuoteRepositroy=QuoteRepositroyImp(
        apiinterface = apiinterface)
}