package com.yzdev.cashrateapp.presentation.screens.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yzdev.cashrateapp.common.Resource
import com.yzdev.cashrateapp.domain.use_case.get_list_coin_dolarToday.GetListCoinDolarTodayUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getLisCoinDolarTodayUseCase: GetListCoinDolarTodayUseCase
): ViewModel() {

    private val _stateInfoDolarToday = mutableStateOf(DolarTodayInfoState())
    val stateInfoDolarToday: State<DolarTodayInfoState> = _stateInfoDolarToday

    init {
        viewModelScope.launch {
            getInfoDolarToday()
        }
    }

    private suspend fun getInfoDolarToday(){
        getLisCoinDolarTodayUseCase().onEach { result->
            when(result){
                is Resource.Error -> {
                    _stateInfoDolarToday.value = DolarTodayInfoState(error = result.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _stateInfoDolarToday.value = DolarTodayInfoState(isLoading = true)
                }
                is Resource.Success -> {
                    _stateInfoDolarToday.value = DolarTodayInfoState(info = result.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}