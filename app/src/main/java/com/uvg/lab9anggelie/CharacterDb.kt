package com.uvg.lab9anggelie

object CharacterDb {
    private val characters = listOf(
        Character(id = "1", name = "Rick Sanchez", species = "Human"),
        Character(id = "2", name = "Morty Smith", species = "Human"),
        Character(id = "3", name = "Summer Smith", species = "Human"),
        Character(id = "4", name = "Beth Smith", species = "Human"),
        Character(id = "5", name = "Jerry Smith", species = "Human"),
        Character(id = "6", name = "Anggelie Velásquez", species = "Human")
    )

    fun getCharacters(): List<Character> {
        return characters
    }

    fun getCharacterById() {

    }
}