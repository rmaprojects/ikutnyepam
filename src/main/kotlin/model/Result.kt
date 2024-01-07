package model
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("chat")
    val chat: Chat,
    @SerializedName("date")
    val date: Int,
    @SerializedName("from")
    val from: From,
    @SerializedName("message_id")
    val messageId: Int,
    @SerializedName("text")
    val text: String
)