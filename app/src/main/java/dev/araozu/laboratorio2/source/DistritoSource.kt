package dev.araozu.laboratorio2.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.araozu.laboratorio2.model.Distrito


class DistritoSource : PagingSource<Int, Distrito>() {
        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Distrito> {
            val nextPage = params.key ?: 1
            val distritosList = Distrito.values()

            return LoadResult.Page(
                data =distritosList.map {
                    it
                },
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (distritosList.isNotEmpty()) null else nextPage + 1
            )
        }

        override fun getRefreshKey(state: PagingState<Int, Distrito>): Int? {
            return state.anchorPosition //devuelve ultima pagina a la que se accedio
        }

    }