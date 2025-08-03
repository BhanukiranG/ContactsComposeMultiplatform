package com.plcoding.contactscomposemultiplatform.contacts.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactArgs
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel : ViewModel() {

    private val _state = MutableStateFlow(ContactsListsState(
        contacts = contacts
    ))
    val state = _state.asStateFlow()

    var newContact: ContactArgs? by mutableStateOf(null)
        private set

    fun onEventClick(event: ContactListEvent) {

    }
}

private val contacts = (1..50).map {
    ContactArgs(
        id = it.toLong(),
        firstName = "First $it",
        secondName = "Second $it",
        email = "dinosir$it@gmail.com",
        phoneNumber = "1234554$it",
        profileImgBytes = null
    )
}