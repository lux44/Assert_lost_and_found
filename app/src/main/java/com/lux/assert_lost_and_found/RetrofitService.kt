package com.lux.assert_lost_and_found

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {
    @GET("4c42546d79766f6c37396a497a5173/json/lostArticleInfo/{start}/{end}/")
    fun getJson(@Path("start")  startIndex:String, @Path("end") endIndex:String) : Call<TaxiResponse>

}