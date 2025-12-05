package app;

import impl.ConsoleLogger;
import impl.FileLogger;
import logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.log("This is a message");
        Logger fileLogger = new FileLogger("output.txt");
        fileLogger.log("This is an another message");
    }
}
