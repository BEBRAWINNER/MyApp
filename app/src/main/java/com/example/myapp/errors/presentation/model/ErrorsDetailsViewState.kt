package com.example.myapp.errors.presentation.model

data class ErrorsDetailsViewState (
    val errors: ErrorsUiModel,
    val rating: Float = 0f,

) {
    val userVoteVisible get() = rating != 0f
}