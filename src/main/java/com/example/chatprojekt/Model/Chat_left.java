package com.example.chatprojekt.Model;

import javax.swing.*;
import java.awt.*;

public class Chat_left extends JLayeredPane {
    private Chat_item txt;

    public Chat_left() {
        txt.setBackground(new Color(242, 242, 242));
        txt.setOpaque(false);
    }
    public void setText(String text) {
        txt.setText(text);

    }
}
