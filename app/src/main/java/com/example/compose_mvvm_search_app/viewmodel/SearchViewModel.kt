package com.example.compose_mvvm_search_app.viewmodel

import androidx.lifecycle.ViewModel
import com.example.compose_mvvm_search_app.model.Item
import kotlinx.coroutines.flow.MutableStateFlow

class SearchViewModel : ViewModel() {
    val allItems = listOf(

        Item(
            "Jetpack Compose",
            "Jetpack Compose is the modern UI toolkit for building native Android interfaces. It allows developers to create UI using Kotlin code instead of XML layouts. Compose simplifies UI development and makes it easier to build dynamic and reactive interfaces."
        ),

        Item(
            "Kotlin Coroutines",
            "Kotlin Coroutines are used for asynchronous programming in Android applications. They help developers run background tasks without blocking the main thread. Coroutines make code more readable and easier to maintain compared to traditional callbacks."
        ),

        Item(
            "Android MVVM",
            "MVVM stands for Model View ViewModel and is a common architecture pattern in Android. It separates the UI from business logic to make code easier to manage and test. This architecture improves maintainability and scalability of Android applications."
        ),

        Item(
            "StateFlow",
            "StateFlow is a Kotlin Flow API used for managing state in modern Android apps. It emits updates whenever the state changes and allows the UI to react automatically. StateFlow works very well with Jetpack Compose for building reactive interfaces."
        ),

        Item(
            "Dependency Injection",
            "Dependency Injection is a design pattern used to manage object creation and dependencies. It helps reduce tight coupling between different parts of an application. Libraries like Hilt make dependency injection easier to implement in Android."
        )
    )

    private val _items = MutableStateFlow(allItems)
    val items = _items

    fun searchQuery(searchQuery: String) {
        if (searchQuery.isEmpty()) {
            _items.value = allItems
        } else {
            _items.value = allItems.filter { it.title.contains(searchQuery, ignoreCase = true) }
        }
    }
}