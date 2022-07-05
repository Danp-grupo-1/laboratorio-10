package dev.araozu.laboratorio2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.araozu.laboratorio2.model.Partido
import dev.araozu.laboratorio2.source.PartidoSource
import kotlinx.coroutines.flow.Flow

class PartidoViewModel: ViewModel() {
    val partidos: Flow<PagingData<Partido>> = Pager(PagingConfig(pageSize = 20)) {
        PartidoSource()
    }.flow.cachedIn(viewModelScope)

}