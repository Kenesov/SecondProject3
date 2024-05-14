package uz.datalife.secondproject.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Questions")
data class Question(
    @PrimaryKey
    val int: Int,
    val question: String,
    val question_image: String? = null,
    val option1: String,
    val option2: String,
    val option3: String? = null,
    val option1_image: String? = null,
    val option2_image: String? = null,
    val option3_image: String? = null,
    val correct_answer: String

)
