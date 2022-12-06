package com.yzdev.cashrateapp.domain.repository

import com.yzdev.cashrateapp.data.remote.dto.DolarTodayResponseDto

interface DolarTodayRepository {
    //---------------------------------- API ----------------------------------------------
    /** Get player info from brawl stars api
     * @param playerTag is tag associated in profile
     * */
    suspend fun getDolarFromDolarToday(): DolarTodayResponseDto

    //-------------------------------------------------------------------------------------

    //------------------------------------- DATA BASE --------------------------------------

    //-------------------------------------------------------------------------------------
}