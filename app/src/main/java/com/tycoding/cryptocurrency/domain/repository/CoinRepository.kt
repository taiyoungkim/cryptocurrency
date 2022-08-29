package com.tycoding.cryptocurrency.domain.repository

import com.tycoding.cryptocurrency.data.remote.dto.CoinDetailDto
import com.tycoding.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coidId: String): CoinDetailDto
}