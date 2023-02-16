package com.iandrobot.mynotes.feature_note.domain.use_case

import com.iandrobot.mynotes.feature_note.data.repository.NoteRepository
import com.iandrobot.mynotes.feature_note.domain.model.InvalidNoteException
import com.iandrobot.mynotes.feature_note.domain.model.Note
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
    private val repository: NoteRepository
){
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title is empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content is empty")
        }
        repository.insertNote(note)
    }
}