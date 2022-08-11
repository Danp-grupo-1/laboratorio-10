package dev.araozu.lab10.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.araozu.lab10.model.Partido
import dev.araozu.lab10.source.PartidoSource
import kotlinx.coroutines.flow.Flow

class PartidoViewModel: ViewModel() {
    val partidos: Flow<PagingData<Partido>> = Pager(PagingConfig(pageSize = 20)) {
        PartidoSource()
    }.flow.cachedIn(viewModelScope)

}