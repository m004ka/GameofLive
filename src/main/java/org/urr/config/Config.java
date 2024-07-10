package org.urr.config;

import org.urr.enums.Status;

import java.awt.*;

public class Config {
    public static final int SIZE = 20;
    public static final int WIDTH = 40;
    public static final int HEIGHT = 30;
    public static final int SLEEPMS = 50;

    public static Color getColor(Status status) {
        switch (status) {
            default:
            case NONE:
                return Color.BLACK;
            case BORN:
                return Color.GRAY;
            case LIVE:
                return Color.GREEN;
            case DIED:
                return Color.BLACK;
        }
    }
}
