package com.iandrobot.mynotes.feature_note.data.local

import androidx.room.*
import com.iandrobot.mynotes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    // it is not suspend because it is returning flow
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    // it is suspend because it is returning note
    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNode(note: Note)

    @Delete
    suspend fun deleteNode(node: Note)
}