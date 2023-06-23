package com.lexmerciful.pokemonxel.repositories

import com.lexmerciful.pokemonxel.data.remote.PokemonApi
import com.lexmerciful.pokemonxel.data.remote.response.Pokemon
import com.lexmerciful.pokemonxel.data.remote.response.PokemonList
import com.lexmerciful.pokemonxel.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRespository @Inject constructor(
    private val pokemonApi: PokemonApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            pokemonApi.getPokemonList(limit, offset)
        } catch (e: Exception){
            return Resource.Error("An unknown error occured. Please try again", null)
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response = try {
            pokemonApi.getPokemonInfo(name)
        } catch (e: Exception){
            return Resource.Error("An unknown error occured. Please try again", null)
        }
        return Resource.Success(response)
    }

}