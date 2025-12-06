package com.example.myapp.errors.domain.interactor

import com.example.myapp.errors.data.repository.ErrorsRepository

class ErrorsInteractor(
    private val errorsRepository: ErrorsRepository
) {
    suspend fun getErrors() = errorsRepository.getErrors()
}