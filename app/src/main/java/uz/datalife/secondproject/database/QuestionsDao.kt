package uz.datalife.secondproject.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import uz.datalife.secondproject.Data.Question

interface QuestionsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addQuestion(question: Question)

    @Query("SELECT * FROM Questions ORDER BY int ASC")
    fun readALLData(): LiveData<List<Question>>


}