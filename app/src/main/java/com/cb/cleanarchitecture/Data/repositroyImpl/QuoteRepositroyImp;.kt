package com.cb.cleanarchitecture.Data.repositroyImpl

import com.cb.cleanarchitecture.Data.remote.Apiinterface
import com.cb.cleanarchitecture.Domains.models.AllQuotesDC
import com.cb.cleanarchitecture.Domains.repositroy.QuoteRepositroy
import retrofit2.Response
import javax.inject.Inject

 class QuoteRepositroyImp @Inject constructor(
     private val apiinterface: Apiinterface
 ):QuoteRepositroy
{
    override suspend fun getAllQuotes(): Response<AllQuotesDC> {
        return apiinterface.getAllQuotes()
    }

    override suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC> {
       return  apiinterface.getRandomQuotes()
    }
}