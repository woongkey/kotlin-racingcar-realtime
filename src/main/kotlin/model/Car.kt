package model

import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

data class Car(
    val carName: String
) {
    var position: Int = 0
    var duration = 500

    suspend fun move() {
        val duration = (0..duration).random().milliseconds
        delay(duration)
        position++
        println("$carName : ${"-".repeat(position)}")
    }

    fun equals(other: String?): Boolean {
        return carName == other
    }

    fun boostSpeed() {
        duration /= 2
    }

    fun slowSpeed() {
        duration *= 2
    }
}
