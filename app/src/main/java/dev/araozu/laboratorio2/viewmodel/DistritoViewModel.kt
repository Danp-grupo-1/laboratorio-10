package dev.araozu.laboratorio2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.araozu.laboratorio2.model.Distrito
import dev.araozu.laboratorio2.source.DistritoSource
import kotlinx.coroutines.flow.Flow

class DistritoViewModel : ViewModel() {
    val distritos: Flow<PagingData<Distrito>> = Pager(PagingConfig(pageSize = 20)) {
        DistritoSource()
    }.flow.cachedIn(viewModelScope)

}