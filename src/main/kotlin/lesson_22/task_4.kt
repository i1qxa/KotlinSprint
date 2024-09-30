package org.example.lesson_22

fun main() {

    val viewModel = ViewModel()
    viewModel.loadData()
    viewModel.loadData()
    viewModel.loadData()

}

class ViewModel() {
    var state = State()

    fun loadData() {
        if (state.isLoading) {
            state = state.copy(data = "smth", isLoading = false)
            println(state)
        } else {
            state = state.copy(isLoading = true)
            println(state)
        }

    }
}

data class State(val data: String? = null, val isLoading: Boolean = false)