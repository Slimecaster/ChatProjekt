package com.example.chatprojekt.Model;

import javax.swing.*;
import java.awt.*;

public class Chat_right extends JLayeredPane {
    private Chat_item txt;

    public Chat_right() {
        txt.setBackground(new Color(22, 242, 222));
        txt.setOpaque(false);
    }
    public void setText(String text) {
        txt.setText(text);
    }
}

