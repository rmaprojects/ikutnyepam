package model
import com.google.gson.annotations.SerializedName

data class From(
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("id")
    val id: Long,
    @SerializedName("is_bot")
    val isBot: Boolean,
    @SerializedName("username")
    val username: String
)