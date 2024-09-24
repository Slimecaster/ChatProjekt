package com.example.chatprojekt.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Emoji {
    private static Emoji instance;
    public static Emoji getInstance() {
        if (instance == null) {
            instance = new Emoji();
        }
        return instance;
    }
    private Emoji() {
    }
   public List<Emoji_Model>getStylel(){
       List<Emoji_Model> list =new ArrayList<>();
       for(int i=0;i<20;i++){
           list.add(new Emoji_Model(i,new ImageIcon(getClass().getResource("/img/"+i+".png"))));
       }
       return list;
   }
   public Emoji_Model getImoj(int id){
        return new Emoji_Model(id, new ImageIcon(getClass().getResource("/img/"+id+".png")));
   }
}
