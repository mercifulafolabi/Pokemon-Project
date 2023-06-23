package com.lexmerciful.pokemonxel.data.remote.response

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)