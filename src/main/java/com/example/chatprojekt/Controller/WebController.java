package com.example.chatprojekt.Controller;

import com.example.chatprojekt.Model.Emoji;
import com.example.chatprojekt.Model.Emoji_Model;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.OptionalDataException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


@Controller
public class WebController {
    private Panel panelDetail;
    private Panel panelHeader;



   /* private Button getEmojiStylel(){
        Button cmd =new Button();
        cmd.setIcon(Emoji.getInstance().getImoj(1).toSize(25,25).getIcon());
        cmd.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelDetail.removeAll();
                for(Emoji_Model d:Emoji.getInstance().getStylel()){
                    Button c =new Button(d.getIcon());
                    c.setName(d.getId()+"");
                    c.setBorder(new EmptyBorder(10,10,10,10));
                    c.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    c.setContentAreaFilled(false);
                    panelDetail.add(c);
                }
                panelDetail.repaint();
                panelDetail.revalidate();
            }
        });
        return cmd;
    }*/

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a");
        String timeStamp = simpleDateFormat.format(calendar.getTime());

        public boolean isFile(File file) {
            String fileName = file.getName().toLowerCase();
            return fileName.endsWith(".txt");
        }

}
