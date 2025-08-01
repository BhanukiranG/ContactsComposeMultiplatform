package com.plcoding.contactscomposemultiplatform.contacts.presentation

import androidx.compose.runtime.Immutable
import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactArgs

@Immutable
data class ContactsListsState(
    val contacts: List<ContactArgs> = emptyList(),
    val recentContacts: List<ContactArgs> = emptyList(),
    val selectedContact: ContactArgs? = null,
    val isSelectedContactSheetOpen: Boolean = false,
    val isAddContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val secondNameError: String? = null,
    val phoneNumberError: String? = null,
    val emailError: String? = null
) {
    val contactsSize: Int get() = contacts.size
}