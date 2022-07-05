package dev.araozu.laboratorio2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.araozu.laboratorio2.model.Candidato
import dev.araozu.laboratorio2.source.CandidatoSource
import kotlinx.coroutines.flow.Flow

class CandidatoViewModel: ViewModel() {
    val candidatos: Flow<PagingData<Candidato>> = Pager(PagingConfig(pageSize = 20)) {
        CandidatoSource()
    }.flow.cachedIn(viewModelScope)

}