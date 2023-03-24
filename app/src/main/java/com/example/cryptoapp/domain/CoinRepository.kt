package com.example.cryptoapp.domain

import androidx.lifecycle.LiveData

interface CoinRepository {

    fun getCoinInfoList() : LiveData<List<CoinInfo>>

    fun getCoinInfo(frobSymbol: String): LiveData<CoinInfo>

    suspend fun loadData()

}