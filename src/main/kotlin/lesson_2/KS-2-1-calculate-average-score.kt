package org.example.lesson_2
const val STUDENT_SCORE_SUM = 3 + 4 + 3 + 5
const val NUMBER_OF_STUDENTS = 4F

fun main() {
    val averageScore = STUDENT_SCORE_SUM / NUMBER_OF_STUDENTS
    println(String.format("%.2f", averageScore))
}