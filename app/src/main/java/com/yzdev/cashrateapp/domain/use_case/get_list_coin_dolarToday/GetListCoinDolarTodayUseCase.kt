package com.yzdev.cashrateapp.domain.use_case.get_list_coin_dolarToday

import com.yzdev.cashrateapp.common.Resource
import com.yzdev.cashrateapp.domain.model.DolarTodayResponse
import com.yzdev.cashrateapp.domain.model.toDolarToday
import com.yzdev.cashrateapp.domain.repository.DolarTodayRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetListCoinDolarTodayUseCase @Inject constructor(
    private val repo: DolarTodayRepository
) {
    operator fun invoke(): Flow<Resource<DolarTodayResponse>> = flow {
        try {
            emit(Resource.Loading())
            val dollarTodayResponse = repo.getDolarFromDolarToday()
            emit(Resource.Success(dollarTodayResponse.toDolarToday()))

        } catch (e: HttpException){
            emit(Resource.Error(message = e.localizedMessage ?: "An unexpected error occurred"))

        } catch (e: IOException){
            emit(Resource.Error(message = "Couldn't reach server. Check your internet connection"))
        }
    }
}