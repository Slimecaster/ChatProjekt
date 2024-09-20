package com.example.chatprojekt.Model;

import javax.swing.*;
import java.awt.*;

public class Chat_item extends JLayeredPane {

    public Chat_item() {
        Component txt = null;
        txt.setEnabled(false);
        txt.setBackground(new Color(0, 0, 0));
    }

    public void setText(String text) {
        Label txt = new Label();
        txt.setText(text);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        super.paint(g);
    }

}
