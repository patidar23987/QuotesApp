package com.cb.cleanarchitecture.Data.remote

import com.cb.cleanarchitecture.Domains.models.AllQuotesDC
import com.cb.cleanarchitecture.Domains.models.QuoteDC
import com.cb.cleanarchitecture.Network.ALL_QUOTES
import com.cb.cleanarchitecture.Network.RANDOM_QUOTE
import retrofit2.Response
import retrofit2.http.GET

interface Apiinterface {


    @GET(ALL_QUOTES)
    suspend fun getAllQuotes(): Response<AllQuotesDC>

    @GET(RANDOM_QUOTE)
    suspend fun getRandomQuotes():Response<AllQuotesDC.QuoteDC>










}