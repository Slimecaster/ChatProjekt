package com.example.chatprojekt.Model;

import javax.swing.*;
import java.awt.*;

public class Emoji_Model {
    int id;
    Icon icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Emoji_Model(){
    }

    public Emoji_Model(int id, Icon icon) {
        this.id = id;
        this.icon = icon;
    }
    public Emoji_Model toSize(int width, int height) {
        return new Emoji_Model(id, new ImageIcon(((ImageIcon)icon).getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH)));
    }
}
