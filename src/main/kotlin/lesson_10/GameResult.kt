package org.example.lesson_10

enum class GameResult {
    COMPUTER_WIN{
        override fun toString(): String {
            return "Победила машина"
        }
    },
    HUMAN_WIN{
        override fun toString(): String {
            return "Победил человек"
        }
    },
    DRAW{
        override fun toString(): String {
            return "Победила дружба"
        }
    }
}