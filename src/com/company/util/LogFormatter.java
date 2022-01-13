package com.company.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;


public class LogFormatter extends Formatter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_ORANGE = "\033[1;33m";

    // Here you can configure the format of the output and
    // its color by using the ANSI escape codes defined above.

    // format is called for every console log message

    public LogFormatter() {

    }

    public static LogRecord createLog(String message) {
        return new LogRecord(Level.INFO, message);
    }

    public static LogRecord createLog(Level level, String message) {
        return new LogRecord(level, message);
    }

    public LogFormatter(Logger logger) {
        Formatter formatter = new LogFormatter();
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(formatter);
        logger.addHandler(handler);
        logger.setLevel(Level.FINEST);
    }

    private static String getColorByLoggingLevel(Level level) {
        if (level == Level.INFO) return ANSI_GREEN;
        else if (level == Level.SEVERE) return ANSI_RED;
        else if (level == Level.WARNING) return ANSI_BLUE;
        return ANSI_PURPLE;
    }

    @Override
    public String format(LogRecord record) {
        // This example will print date/time, class, and log level in yellow,
        // followed by the log message and it's parameters in white .
        StringBuilder builder = new StringBuilder();
        builder.append(ANSI_YELLOW);

        builder.append("[");
        builder.append(calcDate(record.getMillis()));
        builder.append("]");

        builder.append(" [");
        builder.append(record.getSourceClassName());
        builder.append("]");

        builder.append(" [");
        builder.append(record.getLevel().getName());
        builder.append("]");

        builder.append(getColorByLoggingLevel(record.getLevel()));
        builder.append(" - ");
        builder.append(record.getMessage());

//        Object[] params = record.getParameters();

//        if (params != null)
//        {
//            builder.append("\t");
//            for (int i = 0; i < params.length; i++)
//            {
//                builder.append(params[i]);
//                if (i < params.length - 1)
//                    builder.append(", ");
//            }
//        }

        builder.append(ANSI_RESET);
        builder.append("\n");
        return builder.toString();
    }

    private static String calcDate(long millisecs) {
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date resultdate = new Date(millisecs);
        return date_format.format(resultdate);
    }
}