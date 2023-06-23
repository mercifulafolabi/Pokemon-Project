package com.lexmerciful.pokemonxel.navigation

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splash")
    object PokemonNavListScreen: Screen("pokemon_list_screen")
    object PokemonNavDetailScreen: Screen("pokemon_detail_screen")
}
