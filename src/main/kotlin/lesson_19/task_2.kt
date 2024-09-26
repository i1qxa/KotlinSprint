package org.example.lesson_19

fun main() {
    Goods(1, "Носки", Category.CLOTHES).printGoodsInfo()
    Goods(2, "Шариковая ручка", Category.STATIONERY).printGoodsInfo()
    Goods(3, "Полотно для электролобзика", Category.SUNDRY).printGoodsInfo()
}

enum class Category {
    CLOTHES {
        override fun getCategoryName(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getCategoryName(): String {
            return "Канцелярские товары"
        }
    },
    SUNDRY {
        override fun getCategoryName(): String {
            return "Разное"
        }
    },
    ;

    abstract fun getCategoryName(): String
}

class Goods(
    val id: Int,
    val name: String,
    val category: Category,
) {

    fun printGoodsInfo() {
        println("id:$id\nНазвание:$name\nКатегория:${category.getCategoryName()}")
    }

}