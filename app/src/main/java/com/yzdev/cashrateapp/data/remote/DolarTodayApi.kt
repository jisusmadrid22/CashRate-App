package com.yzdev.cashrateapp.data.remote

import com.yzdev.cashrateapp.data.remote.dto.DolarTodayResponseDto
import retrofit2.http.GET

interface DolarTodayApi {

    /** Obteniendo lista de dolares desde DolarToday API*/
    @GET("/dolartoday/data.json")
    suspend fun getDolarFromDolarToday(): DolarTodayResponseDto
}