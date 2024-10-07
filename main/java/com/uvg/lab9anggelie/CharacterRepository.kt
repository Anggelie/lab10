package com.uvg.lab9anggelie

class CharacterRepository {
    fun getCharacters(): List<Character> {
        return listOf(
            Character("1", "Rick Sanchez", "Human", "Alive", "rick_image_jpg"),
            Character("2", "Morty Smith", "Human", "Alive", "morty_image_jpg"),
            Character("3", "Summer Smith", "Human", "Alive", "summer_image_jpg"),
            Character("4", "Beth Smith", "Human", "Alive", "beth_image_jpg"),
            Character("5", "Jerry Smith", "Human", "Alive", "jerry_image_jpg")
        )
    }
}