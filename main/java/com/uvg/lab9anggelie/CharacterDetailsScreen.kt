package com.uvg.lab9anggelie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

private val name: String
    get() = Unit.toString()
private val gender: String
    get() = Unit.toString()
private val species: String
    get() = Unit.toString()
private val status: String
    get() = Unit.toString()

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterDetailsScreen(characterId: String?, navController: NavController) {
    val character = characterId?.toIntOrNull()?.let { CharacterDb.getCharacterById() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Character Details") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            character?.let {
                Text("Name: $name", style = MaterialTheme.typography.headlineMedium)
                Text("Status: $status", style = MaterialTheme.typography.bodyLarge)
                Text("Species: $species", style = MaterialTheme.typography.bodyLarge)
                Text("Gender: $gender", style = MaterialTheme.typography.bodyLarge)
                Text("Origin: ${it.javaClass.name}", style = MaterialTheme.typography.bodyLarge)
                Text("Location: $name", style = MaterialTheme.typography.bodyLarge)
            } ?: Text("Character not found", style = MaterialTheme.typography.bodyLarge)
        }
    }
}