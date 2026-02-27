package com.namejm.utils.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTimeFormatUtil {

	private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private DateTimeFormatUtil() {
	}

	public static String formatNow() {
		return LocalDateTime.now().format(DEFAULT_FORMATTER);
	}
}
