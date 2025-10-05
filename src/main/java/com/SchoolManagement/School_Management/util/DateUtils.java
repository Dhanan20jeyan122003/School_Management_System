package com.SchoolManagement.School_Management.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final String DATE_PATTERN = "dd-MM-yyyy";
    private static final String DATETIME_PATTERN = "dd-MM-yyyy HH:mm";

    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern(DATETIME_PATTERN));
    }
}