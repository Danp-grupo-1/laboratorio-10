package dev.araozu.lab10.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.araozu.lab10.model.AppDatabase
import dev.araozu.lab10.model.Candidato

class CandidatoSource(
    val filtroDistrito: String? = null,
    val filtroPartido: String? = null,
) : PagingSource<Int, Candidato>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Candidato> {
        val roomInstance = AppDatabase.getDatabase()
        val nextPage = params.key ?: 1
        // Obtiene toda la lista de candidatos
        val CandidatosList =
            if (filtroDistrito != null) {
                roomInstance.candidatoDao().getByDistrito(filtroDistrito)
            } else if (filtroPartido != null) {
                roomInstance.candidatoDao().getByPartido(filtroPartido)
            } else {
                roomInstance.candidatoDao().getAll()
            }

        return LoadResult.Page(
            data = CandidatosList,
            prevKey = if (nextPage == 1) null else nextPage - 1,
            nextKey = if (CandidatosList.isNotEmpty()) null else nextPage + 1
        )
    }

    override fun getRefreshKey(state: PagingState<Int, Candidato>): Int? {
        return state.anchorPosition
    }

}
