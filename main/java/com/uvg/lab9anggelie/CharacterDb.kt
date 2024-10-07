package com.uvg.lab9anggelie

object CharacterDb {
    fun getCharacters(): List<Character> {
        return listOf(
            Character(
                "1",
                "Rick Sanchez",
                "Human",
                "Alive",
                R.drawable.rick_image.toString()
            ),
            Character(
                "2",
                "Morty Smith",
                "Human",
                "Alive",
                R.drawable.profile_image.toString()
            ),
            Character(
                "3",
                "Summer Smith",
                "Human",
                "Alive",
                R.drawable.summer_image.toString()
            ),
            Character(
                "4",
                "Beth Smith",
                "Human",
                "Alive",
                R.drawable.beth_image.toString()
            ),
            Character(
                "5",
                "Jerry Smith",
                "Human",
                "Alive",
                R.drawable.profile_image.toString()
            )
        )
    }

    fun getCharacterById() {
        TODO("Not yet implemented")
    }
}
