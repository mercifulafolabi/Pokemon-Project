package com.lexmerciful.pokemonxel.di

import com.lexmerciful.pokemonxel.data.remote.PokemonApi
import com.lexmerciful.pokemonxel.repositories.PokemonRespository
import com.lexmerciful.pokemonxel.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun pokemonRespository(
        pokemonApi: PokemonApi
    ) = PokemonRespository(pokemonApi)

    @Singleton
    @Provides
    fun pokemonApi(): PokemonApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokemonApi::class.java)
    }
}