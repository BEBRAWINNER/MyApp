package com.example.myapp.errors.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapp.errors.domain.interactor.ErrorsInteractor
import com.example.myapp.errors.presentation.model.ErrorsSettingState
import com.example.myapp.navigation.Route
import com.example.myapp.navigation.TopLevelBackStack
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ErrorsSettingsViewModel(
    private val topLevelBackStack: TopLevelBackStack<Route>,
    private val interactor: ErrorsInteractor
) : ViewModel() {
    private val mutableState = MutableStateFlow(value = ErrorsSettingState())
    val viewState = mutableState.asStateFlow()

    init {
        viewModelScope.launch {
            interactor.observeDescendingSortSettings().collect { newFirst ->
                mutableState.update { it.copy(descendingSort = newFirst) }
            }
        }
    }

    fun onSortCheckedChange(isChecked: Boolean) {
        mutableState.update { it.copy(descendingSort = isChecked) }
    }

    fun onBack() {
        topLevelBackStack.removeLast()
    }

    fun onSaveClicked() {
        viewModelScope.launch {
            interactor.setDescendingSortSettings(viewState.value.descendingSort)
            onBack()
        }
    }
}