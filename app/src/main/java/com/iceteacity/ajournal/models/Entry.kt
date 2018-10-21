package com.iceteacity.ajournal.models

import java.util.*

data class Entry(var title: String, var content: String, val posted: Date = Date()) {

    val summary: String
        get() {
            if (content.length > 200) {
                return content.substring(0, 197) + "..."
            }
            return content
        }

}