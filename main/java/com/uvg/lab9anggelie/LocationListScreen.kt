package com.uvg.lab9anggelie

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationListScreen(navController: NavHostController) {
    val locations = LocationDb.getLocations()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Locations") }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(locations) { location ->
                LocationItem(
                    location = location,
                    onItemClick = {
                        navController.navigate("location_details/${location.id}")
                    }
                )
            }
        }
    }
}

@Composable
fun LocationItem(location: Location, onItemClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = onItemClick
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = location.name,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = location.type,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}