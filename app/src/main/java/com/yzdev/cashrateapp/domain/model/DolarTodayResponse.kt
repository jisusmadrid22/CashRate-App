package com.yzdev.cashrateapp.domain.model

import com.yzdev.cashrateapp.data.remote.dto.DolarTodayResponseDto

data class DolarTodayResponse(
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

fun DolarTodayResponseDto.toDolarToday(): DolarTodayResponse{
    return DolarTodayResponse(
        BCV = BCV.toDolarBCV(),
        COL = COL.toDolarCOL(),
        EUR = EUR.toDolarEUR(),
        EURUSD = EURUSD.toDolarEURUSD(),
        GOLD = GOLD.toDolarGOLD(),
        MISC = MISC.toDolarMISC(),
        USD = USD.toDolarUSD(),
        USDCOL = USDCOL.toDolarUSDCOL(),
        USDVEF = USDVEF.toDollarUSDVEF(),
        _antibloqueo = _antibloqueo.toDolarAntibloqueo(),
        _labels = _labels.toDolarLabels(),
        _timestamp = _timestamp.toDolarTimestamp()
    )
}

/** Dolar BCV dto to dolar BCV*/
private fun DolarTodayResponseDto.BCVs.toDolarBCV(): DolarTodayResponse.BCVs{
    return DolarTodayResponse.BCVs(
        fecha = fecha,
        fecha_nice = fecha_nice,
        liquidez = liquidez,
        reservas = reservas
    )
}

/** Dolar COL dto to dolar COL*/
private fun DolarTodayResponseDto.COLs.toDolarCOL(): DolarTodayResponse.COLs{
    return DolarTodayResponse.COLs(
        compra = compra,
        efectivo = efectivo,
        transfer = transfer,
        venta = venta
    )
}

/** Dolar EUR dto to dolar EUR*/
private fun DolarTodayResponseDto.EURs.toDolarEUR(): DolarTodayResponse.EURs{
    return DolarTodayResponse.EURs(
        cencoex, dolartoday, efectivo, efectivo_cucuta, efectivo_real, promedio, promedio_real, sicad1, sicad2, transfer_cucuta, transferencia
    )
}

/** Dolar EURUSD dto to dolar EURUSD*/
private fun DolarTodayResponseDto.EURUSDs.toDolarEURUSD(): DolarTodayResponse.EURUSDs{
    return DolarTodayResponse.EURUSDs(
        rate = rate
    )
}

/** Dolar gold dto to dolar gold*/
private fun DolarTodayResponseDto.GOLDs.toDolarGOLD(): DolarTodayResponse.GOLDs{
    return DolarTodayResponse.GOLDs(
        rate = rate
    )
}

/** Dolar MISC dto to dolar MISC*/
private fun DolarTodayResponseDto.MISCs.toDolarMISC(): DolarTodayResponse.MISCs{
    return DolarTodayResponse.MISCs(
        petroleo, reservas
    )
}

/** Dolar usd dto to dolar usd*/
private fun DolarTodayResponseDto.USDs.toDolarUSD(): DolarTodayResponse.USDs{
    return DolarTodayResponse.USDs(
        bitcoin_ref, cencoex, dolartoday, efectivo, efectivo_cucuta, efectivo_real, localbitcoin_ref, promedio, promedio_real, sicad1, sicad2, transfer_cucuta, transferencia
    )
}

/** Dolar usd col dto to dolar usd col*/
private fun DolarTodayResponseDto.USDCOLs.toDolarUSDCOL(): DolarTodayResponse.USDCOLs{
    return DolarTodayResponse.USDCOLs(
        rate, ratecash, ratetrm, setfxbuy, setfxsell, trmfactor, trmfactorcash
    )
}

/** Dolar usd vef dto to dolar usd vef*/
private fun DolarTodayResponseDto.USDVEFs.toDollarUSDVEF(): DolarTodayResponse.USDVEFs{
    return DolarTodayResponse.USDVEFs(
        rate = rate
    )
}

/** Dolar antibloqueo dto to dolar antibloqueo*/
private fun DolarTodayResponseDto.Antibloqueo.toDolarAntibloqueo(): DolarTodayResponse.Antibloqueo{
    return DolarTodayResponse.Antibloqueo(
        alternativo, alternativo2, corto_alternativo, enable_admobbanners, enable_admobinterstitials, enable_iads, mobile, notifications, resource_id, video
    )
}

/** Dolar labels dto to dolar labels*/
private fun DolarTodayResponseDto.Labels.toDolarLabels(): DolarTodayResponse.Labels{
    return DolarTodayResponse.Labels(
        a, a1, b, c, d, e
    )
}

/** Dolar timestamp dto to dolar timestamp*/
private fun DolarTodayResponseDto.Timestamp.toDolarTimestamp(): DolarTodayResponse.Timestamp{
    return DolarTodayResponse.Timestamp(
        dia, dia_corta, epoch, fecha, fecha_corta, fecha_corta2, fecha_nice
    )
}

