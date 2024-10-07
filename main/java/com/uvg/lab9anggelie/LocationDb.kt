package com.uvg.lab9anggelie

object LocationDb {
    private val locations = listOf(
        Location("1", "Earth (C-137)", "Planet", "Dimension C-137"),
        Location("2", "Abadango", "Cluster", "unknown"),
        Location("3", "Citadel of Ricks", "Space station", "unknown"),
        Location("4", "Worldender's lair", "Planet", "unknown"),
        Location("5", "Anatomy Park", "Microverse", "Dimension C-137"),
        Location("6", "Interdimensional Cable", "TV", "unknown")
    )

    fun getLocations() = locations

    fun getLocation(id: String) = locations.find { it.id == id }
}