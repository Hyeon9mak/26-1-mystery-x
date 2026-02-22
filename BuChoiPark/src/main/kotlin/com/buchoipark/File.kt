package com.buchoipark

data class File(
    val id: String,
    val userId: String,
    val uploadedAt: Long,
    val fileName: String,
    val fileLocation: String,
    val extension: String,
    val fileSize: Long
)
