package com.priyank.stockmarketapp.di

import com.priyank.stockmarketapp.data.csv.CSVParser
import com.priyank.stockmarketapp.data.csv.CompanyListingsParser
import com.priyank.stockmarketapp.data.csv.IntradayInfoParser
import com.priyank.stockmarketapp.data.repository.StockRepositoryImpl
import com.priyank.stockmarketapp.domain.model.CompanyListing
import com.priyank.stockmarketapp.domain.model.IntradayInfo
import com.priyank.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}