package com.yzdev.cashrateapp.presentation.screens.home

import com.yzdev.cashrateapp.domain.model.DolarTodayResponse

data class DolarTodayInfoState(
    val isLoading: Boolean = false,
    val info: DolarTodayResponse? = null,
    val error: String = ""
)