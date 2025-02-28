package com.cb.cleanarchitecture.Domains.repositroy

import com.cb.cleanarchitecture.Domains.models.AllQuotesDC
import retrofit2.Response

interface QuoteRepositroy {


    suspend fun getAllQuotes():Response<AllQuotesDC>



    suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC>
}