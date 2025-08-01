package com.plcoding.contactscomposemultiplatform

import android.view.Surface
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.contactscomposemultiplatform.contacts.presentation.ContactsScreen
import com.plcoding.contactscomposemultiplatform.core.presentation.ContactsTheme

@Composable
fun Application(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    ContactsTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ContactsScreen(
                state = TODO(),
                newContact = TODO(),
                onEvent = TODO()
            )
        }
    }
}