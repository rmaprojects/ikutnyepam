import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import okhttp3.Dispatcher
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

@OptIn(ExperimentalTime::class)
fun main() {
    val api = ApiInterface.createApi()
    runBlocking {
        var isSpammable = true
        while (isSpammable) {
            runCatching {
                val res = api.messageHIM()
                if (res.ok) {
                    println("Nyepam masih berhasil")
                } else {
                    println("Nyepam udeh di blokir wir")
                    isSpammable = false
                }
            }.onFailure {
                isSpammable = false
            }
            delay(3.seconds)
        }

    }
}