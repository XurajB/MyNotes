package com.iandrobot.mynotes.feature_note.data.repository

import com.iandrobot.mynotes.feature_note.data.local.NoteDao
import com.iandrobot.mynotes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNode(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNode(note)
    }
}