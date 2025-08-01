package com.plcoding.contactscomposemultiplatform.contacts.domain

data class ContactArgs(
    val id: Long,
    val firstName: String,
    val secondName: String,
    val email: String,
    val phoneNumber: String,
    val profileImgBytes: ByteArray?
)
