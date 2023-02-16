package com.iandrobot.mynotes.feature_note.domain.use_case

import com.iandrobot.mynotes.feature_note.data.repository.NoteRepository
import com.iandrobot.mynotes.feature_note.domain.model.Note
import javax.inject.Inject

class GetNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}