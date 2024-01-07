package model
import com.google.gson.annotations.SerializedName

data class Chat(
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("id")
    val id: Long,
    @SerializedName("type")
    val type: String
)