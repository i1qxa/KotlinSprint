package org.example.lesson_22

fun main() {

    var state = State()
    println(state)

    fun loadData() {
        if (state.isLoading) {
            state = state.copy(data = "smth", isLoading = false)
            println(state)
        } else {
            state = state.copy(isLoading = true)
            println(state)
        }

    }

    loadData()
    loadData()
    loadData()

}

data class State(val data: String? = null, val isLoading: Boolean = false)