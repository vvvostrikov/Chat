import org.junit.After
import org.junit.Test

import org.junit.Assert.*

class ChatServiceTest{

    @After
    fun tearDown() {
        clear()
    }

    @Test
    fun getChats() {

    }

    @Test
    fun setChats() {
    }

    @Test
    fun getId() {
    }

    @Test
    fun setId() {
    }

    @Test
    fun sendMessage() {
        ChatService
        val user1Id = 1
        val user2Id = 2
        val text = "1"
        ChatService.sendMessage(user1Id, user2Id, text)
        assertEquals(1, ChatService.chats.size)

    }

    @Test
    fun testGetChats() {
    }

    @Test
    fun readChat() {
        ChatService
        val user1Id = 1
        val user2Id = 2
        val text = "1"
        ChatService.sendMessage(user1Id, user2Id, text)
        ChatService.sendMessage(user1Id, user2Id, text)
        val result = ChatService.readChat(1)
        assertTrue(result)
    }
    @Test
    fun noReadChat() {
        ChatService
        val user1Id = 1
        val user2Id = 2
        val text = "1"
        ChatService.sendMessage(user1Id, user2Id, text)
        ChatService.sendMessage(user1Id, user2Id, text)
        val result = ChatService.readChat(44)
        assertFalse(result)
    }

    @Test
    fun getUnreadChatsCount() {
    }

    @Test
    fun deleteChat() {

    }

    @Test
    fun noDeleteChat() {

    }

    @Test
    fun editMessage() {

    }

    @Test
    fun deleteMessage() {

    }

    @Test
    fun clear() {
    }
}