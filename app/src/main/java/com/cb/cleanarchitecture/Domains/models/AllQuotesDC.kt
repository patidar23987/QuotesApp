package com.cb.cleanarchitecture.Domains.models

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AllQuotesDC(
    @SerializedName("quote")
    val quotes: List<QuoteDC>? = null
) {


    @Keep
    data class QuoteDC(
        @SerializedName("auther")
        val author: String? = null,

        @SerializedName("id")
        val id: Int? = null,

        @SerializedName("quote")
        val quote: String? = null
    )
}