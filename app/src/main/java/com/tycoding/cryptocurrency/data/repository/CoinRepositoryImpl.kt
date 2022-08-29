package com.tycoding.cryptocurrency.data.repository

import com.tycoding.cryptocurrency.data.remote.CoinPaprikaApi
import com.tycoding.cryptocurrency.data.remote.dto.CoinDetailDto
import com.tycoding.cryptocurrency.data.remote.dto.CoinDto
import com.tycoding.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coidId: String): CoinDetailDto {
        return api.getCoinById(coidId)
    }
}