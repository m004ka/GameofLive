package org.urr.models;

import org.urr.config.Config;

import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {
    public Box(int x, int y){
        super();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);
    }
}
