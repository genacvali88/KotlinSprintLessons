package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val remainingSecondsAfterHours = totalSeconds % (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)

    val minutes = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTime)
}