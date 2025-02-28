package com.cb.cleanarchitecture.Domains.useCases

import com.cb.cleanarchitecture.Domains.models.AllQuotesDC
import com.cb.cleanarchitecture.Domains.repositroy.QuoteRepositroy
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AllQuotesUseCase @Inject constructor(
    private val quotesRepositroy: QuoteRepositroy
)
{

     suspend operator fun invoke() = flow{
       quotesRepositroy.getAllQuotes().let {
    if (it.isSuccessful){
        emit(
            it.body()?.quotes)
    }
}

}

}