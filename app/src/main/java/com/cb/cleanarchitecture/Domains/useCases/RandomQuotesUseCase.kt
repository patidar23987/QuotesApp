package com.cb.cleanarchitecture.Domains.useCases

import com.cb.cleanarchitecture.Domains.repositroy.QuoteRepositroy
import java.time.temporal.IsoFields
import javax.inject.Inject
import kotlinx.coroutines.flow.flow as flow

class RandomQuotesUseCase @Inject constructor(
    private val quoteRepository:QuoteRepositroy) {


    suspend operator fun invoke() = flow{
        quoteRepository.getRandomQuote()?.let{
            if (it.isSuccessful){
                emit(it.body())
            }
        }
    }


}