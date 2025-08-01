package com.plcoding.contactscomposemultiplatform.contacts.presentation

import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactArgs

sealed interface ContactListEvent {
    object OnAddNewContactClick: ContactListEvent
    object DismissContact: ContactListEvent
    data class OnFirstNameChanged(val value: String): ContactListEvent
    data class OnSecondNameChanged(val value: String): ContactListEvent
    data class OnPhoneNumberChanged(val value: String): ContactListEvent
    data class OnEmailChanged(val value: String): ContactListEvent
    class  OnProfileImgPicked(val byteArray: ByteArray): ContactListEvent
    object OnAddProfileImgClicked: ContactListEvent
    object OnSaveContactClicked: ContactListEvent
    data class SelectContact(val contact: ContactArgs): ContactListEvent
    data class EditContact(val contact: ContactArgs): ContactListEvent
    object DeleteContact: ContactListEvent
}