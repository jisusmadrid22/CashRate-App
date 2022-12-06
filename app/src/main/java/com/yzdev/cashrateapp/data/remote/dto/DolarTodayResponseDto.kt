package com.yzdev.cashrateapp.data.remote.dto

data class DolarTodayResponseDto(
    val BCV: BCVs,
    val COL: COLs,
    val EUR: EURs,
    val EURUSD: EURUSDs,
    val GOLD: GOLDs,
    val MISC: MISCs,
    val USD: USDs,
    val USDCOL: USDCOLs,
    val USDVEF: USDVEFs,
    val _antibloqueo: Antibloqueo,
    val _labels: Labels,
    val _timestamp: Timestamp
) {
    data class BCVs(
        val fecha: String,
        val fecha_nice: String,
        val liquidez: String,
        val reservas: String
    )

    data class COLs(
        val compra: Double,
        val efectivo: Double,
        val transfer: Double,
        val venta: Double
    )

    data class EURs(
        val cencoex: Double,
        val dolartoday: Double,
        val efectivo: Double,
        val efectivo_cucuta: Double,
        val efectivo_real: Double,
        val promedio: Double,
        val promedio_real: Double,
        val sicad1: Double,
        val sicad2: Double,
        val transfer_cucuta: Double,
        val transferencia: Double
    )

    data class EURUSDs(
        val rate: Double
    )

    data class GOLDs(
        val rate: Int
    )

    data class MISCs(
        val petroleo: String,
        val reservas: String
    )

    data class USDs(
        val bitcoin_ref: Double,
        val cencoex: Double,
        val dolartoday: Double,
        val efectivo: Double,
        val efectivo_cucuta: Double,
        val efectivo_real: Double,
        val localbitcoin_ref: Double,
        val promedio: Double,
        val promedio_real: Double,
        val sicad1: Double,
        val sicad2: Double,
        val transfer_cucuta: Double,
        val transferencia: Double
    )

    data class USDCOLs(
        val rate: Double,
        val ratecash: Double,
        val ratetrm: Double,
        val setfxbuy: Double,
        val setfxsell: Double,
        val trmfactor: Double,
        val trmfactorcash: Double
    )

    data class USDVEFs(
        val rate: Int
    )

    data class Antibloqueo(
        val alternativo: String,
        val alternativo2: String,
        val corto_alternativo: String,
        val enable_admobbanners: String,
        val enable_admobinterstitials: String,
        val enable_iads: String,
        val mobile: String,
        val notifications: String,
        val resource_id: String,
        val video: String
    )

    data class Labels(
        val a: String,
        val a1: String,
        val b: String,
        val c: String,
        val d: String,
        val e: String
    )

    data class Timestamp(
        val dia: String,
        val dia_corta: String,
        val epoch: String,
        val fecha: String,
        val fecha_corta: String,
        val fecha_corta2: String,
        val fecha_nice: String
    )
}