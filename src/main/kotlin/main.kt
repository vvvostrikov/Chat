fun main() {
    var x = ChatService
    val user1Id = 1
    val user2Id = 2
    val text = "1"
    ChatService.sendMessage(user1Id, user2Id, text)
    println(ChatService.chats)
    println(ChatService.getChats(user1Id))
    println(ChatService.deleteMessage(1, 1))
}