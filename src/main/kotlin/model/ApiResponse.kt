package model
import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("ok")
    val ok: Boolean,
    @SerializedName("result")
    val result: Result
)