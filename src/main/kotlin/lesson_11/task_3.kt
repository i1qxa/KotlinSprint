package org.example.lesson_11

fun main() {
    val user1 = User(
        1,
        "asd",
        "asddd",
    )
    val user2 = User(
        2,
        "zxc",
        "zxczxc",
    )
    val user3 = User(
        3,
        "qwe",
        "123123",
    )
    val user4 = User(
        4,
        "asd123",
        "asddd123",
    )
    val room = Room(
        1,
        "asd",
        "asddgf",
        mutableListOf(user1, user2, user3, user4)
    )
    room.addUser(user4)
    room.updateUserStatus("qwe", "Разговаривает")
}

class User(
    val id: Int,
    val name: String,
    val avatar: String,
    var status: String = "",
) {
    fun updateStatus(userStatus: String) {
        status = userStatus
    }
}

class Room(
    val id: Int,
    val logo: String,
    val title: String,
    val listUsers: MutableList<User>,
) {
    fun addUser(user: User) {
        listUsers.add(user)
    }

    fun updateUserStatus(userName: String, status: String) {
        try {
            listUsers.find { it.name == userName }?.updateStatus(status)
        } catch (e: Exception) {
            println("Такого пользователя нет в комнате")
        }
    }
}
