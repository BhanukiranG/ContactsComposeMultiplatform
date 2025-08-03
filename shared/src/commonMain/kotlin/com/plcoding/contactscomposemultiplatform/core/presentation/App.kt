package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.plcoding.contactscomposemultiplatform.contacts.presentation.ContactListViewModel
import com.plcoding.contactscomposemultiplatform.contacts.presentation.ContactsScreen
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    ContactsTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        val viewModel = getViewModel(
            key = "contact_list_view_model",
            factory = viewModelFactory {
                ContactListViewModel()
            }
        )

        val state by viewModel.state.collectAsState()

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ContactsScreen(
                state = state,
                newContact = viewModel.newContact,
                onEvent = viewModel::onEventClick
            )
        }
    }
}