package com.yzdev.cashrateapp.di

import com.yzdev.cashrateapp.common.Constant
import com.yzdev.cashrateapp.data.remote.DolarTodayApi
import com.yzdev.cashrateapp.data.remote.InterceptorClient
import com.yzdev.cashrateapp.data.repository.DolarTodayRepositoryImp
import com.yzdev.cashrateapp.domain.repository.DolarTodayRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("BaseUrlDolarToday")
    fun provideBaseUrlDolarToday() = Constant.BASE_URL_DOLAR_TODAY

    private val client = OkHttpClient.Builder().apply {
        addInterceptor(InterceptorClient())
    }.build()

    @Provides
    @Singleton
    fun provideDolarTodayApi(@Named("BaseUrlDolarToday") baseUrl: String): DolarTodayApi{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DolarTodayApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDolarTodayRepository(api: DolarTodayApi): DolarTodayRepository{
        return DolarTodayRepositoryImp(api)
    }

}