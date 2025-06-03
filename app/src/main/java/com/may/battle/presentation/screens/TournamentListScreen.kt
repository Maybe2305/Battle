package com.may.battle.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.may.battle.domain.model.Tournament
import com.may.battle.presentation.viewmodels.TournamentListViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TournamentsListScreen(
    viewModel: TournamentListViewModel,
    onTournamentClick: (Tournament) -> Unit
) {

    val tournaments by viewModel.tournaments

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Выберите турнир:") }
            )
        }
    ) { padding ->

        LazyColumn(
            contentPadding = padding,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(16.dp)
        ) {

            items(tournaments) { tournament ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onTournamentClick(tournament) },
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Text(
                        text = tournament.title,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

    }
}