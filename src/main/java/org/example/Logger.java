package org.example;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null){
            return new Logger();
        }
        return logger;
    }
}