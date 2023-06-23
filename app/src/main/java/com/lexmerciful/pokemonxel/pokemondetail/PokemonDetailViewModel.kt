package com.lexmerciful.pokemonxel.pokemondetail

import androidx.lifecycle.ViewModel
import com.lexmerciful.pokemonxel.data.remote.response.Pokemon
import com.lexmerciful.pokemonxel.repositories.PokemonRespository
import com.lexmerciful.pokemonxel.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val pokemonRespository: PokemonRespository
) : ViewModel() {


    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return pokemonRespository.getPokemonInfo(pokemonName)
    }

}