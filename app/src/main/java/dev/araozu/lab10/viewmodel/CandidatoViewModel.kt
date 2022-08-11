package dev.araozu.lab10.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dev.araozu.lab10.model.Candidato
import dev.araozu.lab10.source.CandidatoSource
import kotlinx.coroutines.flow.Flow

class CandidatoViewModel(
    val filtroDistrito: String? = null,
    val filtroPartido: String? = null,
) : ViewModel() {
    val candidatos: Flow<PagingData<Candidato>> = Pager(PagingConfig(pageSize = 20)) {
        CandidatoSource(filtroDistrito, filtroPartido)
    }.flow.cachedIn(viewModelScope)

}