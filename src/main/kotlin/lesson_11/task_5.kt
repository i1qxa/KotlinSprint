package org.example.lesson_11

import kotlin.random.Random

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Admin")
    val user2 = forum.createNewUser("User")
    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user1.userId)
    forum.createNewMessage(user2.userId)
    forum.createNewMessage(user2.userId)
    forum.printThread()
}

class Forum(
    private val memberList: MutableList<ForumMember> = mutableListOf(),
    private val messageList: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(Random.nextInt(1000), userName)
        memberList.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int) {
        if (isUserInMemberList(userId)) {
            messageList.add(ForumMessage(userId, generateMessage()))
        }
    }

    fun printThread() {
        messageList.forEach { msg ->
            getUserNameById(msg.authorId)?.let { userName ->
                msg.printInConsole(userName)
            }
        }
    }

    private fun isUserInMemberList(userId: Int): Boolean {
        return memberList.find { it.userId == userId }?.userName != null
    }

    private fun getUserNameById(userId: Int): String? = memberList.find { it.userId == userId }?.userName

    private fun generateMessage(): String {
        var message = ""
        repeat(Random.nextInt(50)) {
            message += ('a'..'z').random()
        }
        return message
    }
}


class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    fun printInConsole(userName: String) {
        println("$userName:$message")
    }
}