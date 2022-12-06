package com.yzdev.cashrateapp.data.repository

import com.yzdev.cashrateapp.data.remote.DolarTodayApi
import com.yzdev.cashrateapp.data.remote.dto.DolarTodayResponseDto
import com.yzdev.cashrateapp.domain.repository.DolarTodayRepository
import javax.inject.Inject

class DolarTodayRepositoryImp @Inject constructor(
    private val api: DolarTodayApi
): DolarTodayRepository {

    override suspend fun getDolarFromDolarToday(): DolarTodayResponseDto {
        return api.getDolarFromDolarToday()
    }
}