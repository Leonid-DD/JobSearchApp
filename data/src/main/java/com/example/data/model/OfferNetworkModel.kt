package com.example.data.model

data class OfferNetworkModel(
    val id: String?,
    val title: String,
    val link: String,
    val button: Button? = null
)

data class Button(
    val text: String
)
