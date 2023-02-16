package com.iandrobot.mynotes.feature_note.presentation.notes.component

import com.iandrobot.mynotes.feature_note.domain.model.Note
import com.iandrobot.mynotes.feature_note.domain.util.NoteOrder
import com.iandrobot.mynotes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
