import model.ApiResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {

    @POST("sendMessage")
    suspend fun messageHIM(
        @Query("chat_id") chatId: String = "6646401965",
        @Query("text") text: String = "Badut amat lu, ngoding apa nyimeng anjir, minimal tobat lah anjir, salah sasaran lu tolol amat najis goblok"
    ): ApiResponse

    companion object {
        fun createApi(): ApiInterface {
            return Retrofit.Builder()
                .baseUrl("https://api.telegram.org/bot6858626486:AAFGv8jhENE0uBxjVY5IGsNbabyx_fnZlL0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiInterface::class.java)
        }

    }
}