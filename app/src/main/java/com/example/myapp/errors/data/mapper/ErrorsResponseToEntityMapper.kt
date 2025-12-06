package com.example.myapp.errors.data.mapper

import com.example.myapp.errors.data.model.ErrorsListResponse
import com.example.myapp.errors.domain.model.ErrorsEntity
import com.example.myapp.errors.domain.model.SeeAlsoModel

class ErrorsResponseToEntityMapper {
    fun mapResponse(response: ErrorsListResponse): List<ErrorsEntity> {
        return response.documents?.map { document ->
            ErrorsEntity(
                code = document.code.orEmpty(),
                title = document.title.orEmpty(),
                imageUrl = document.imageUrl.orEmpty(),
                description = document.description.orEmpty(),
                seeAlso = document.seeAlso?.map { seeAlsoData ->
                    SeeAlsoModel(
                        text = seeAlsoData.text.orEmpty(),
                        url = seeAlsoData.url
                    )
                } ?: emptyList(),
                source = document.source
            )

        }.orEmpty()
    }
}