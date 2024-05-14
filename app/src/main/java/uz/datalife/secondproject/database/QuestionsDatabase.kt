@file:OptIn(InternalCoroutinesApi::class)

package uz.datalife.secondproject.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
import uz.datalife.secondproject.Data.Question

@Database(entities = [Question::class], version = 1, exportSchema = false)
abstract class QuestionsDatabase: RoomDatabase() {

    abstract fun questionDao(): QuestionsDao

    companion object{
        @Volatile
        private var INSTANCE: QuestionsDatabase? = null

        fun getDatabase(context: Context): QuestionsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuestionsDatabase::class.java,
                    "questions_database"
                ).build()

                INSTANCE = instance
                return instance

            }
        }

    }
}