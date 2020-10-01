package com.eliong92.printtime.util

import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

class DateUtil : IDateUtil {
    override fun getCurrentTime(format: String): String {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format))
    }
}