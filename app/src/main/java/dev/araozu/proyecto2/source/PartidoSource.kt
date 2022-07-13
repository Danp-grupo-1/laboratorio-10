package dev.araozu.proyecto2.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.araozu.proyecto2.model.AppDatabase
import dev.araozu.proyecto2.model.Partido

class PartidoSource: PagingSource<Int, Partido>() {
        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Partido> {
            val nextPage = params.key ?: 1
            val partidosList = AppDatabase.getDatabase().partidoDao().getAll()

            return LoadResult.Page(
                data = partidosList.map { partido ->
                    Partido(
                        nombre = partido.nombre,
                        fundacion = partido.fundacion,
                        domicilio = partido.domicilio,
                        imagen = partido.imagen,
                    )
                },
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (partidosList.isNotEmpty()) null else nextPage + 1
            )
        }

        override fun getRefreshKey(state: PagingState<Int, Partido>): Int? {
            return state.anchorPosition //devuelve ultima pagina a la que se accedio
        }

    }