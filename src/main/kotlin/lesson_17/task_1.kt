package org.example.lesson_17

class Quiz() {
    var question = ""
        get() = field
    var answer = ""
        get() = field
        set(value) {
            field = value
        }
}