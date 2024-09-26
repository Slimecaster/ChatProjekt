package com.example.chatprojekt.Model;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;

public class File_model {
    private Message message;
    private int fileID;
    private String fileExtensions;
    private File file;
    private long size;
    private RandomAccessFile randomAccessFile;
    private Socket socket;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getFileExtensions() {
        return fileExtensions;
    }

    public void setFileExtensions(String fileExtensions) {
        this.fileExtensions = fileExtensions;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public RandomAccessFile getRandomAccessFile() {
        return randomAccessFile;
    }

    public void setRandomAccessFile(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    private String getExtensions(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."), fileName.length());
    }

    public File_model() {
    }

    public File_model(File file,Socket socket,Message message) throws IOException {
        randomAccessFile = new RandomAccessFile(file, "r");
        this.file = file;
        this.message = message;
        this.socket = socket;
        fileExtensions = getExtensions(file.getName());
        size = randomAccessFile.length();
    }

    public synchronized byte[]readFile() throws IOException {
        long fileposition = randomAccessFile.getFilePointer();
        if(fileposition != size){
            int max= 2000;
            long leght =fileposition+max>=size?size-fileposition:max;
            byte[] data = new byte[(int)leght];
            randomAccessFile.readFully(data);
            return data;
        }else
            return null;
    }

    public void StartSend(int fileID)throws IOException{
        this.fileID=fileID;
        sendingfile();
    }

    private void sendingfile()throws IOException{
        File_Sender data = new File_Sender();
        data.setFileID(fileID);
        byte[]bytes=readFile();
        if(bytes!=null){
            data.setFileData(bytes);
            data.setFinish(false);
        }else {
            data.setFinish(true);
            close();
        }
    }

    public double getPercentage()throws IOException{
        double percentage;
        long fileposition = randomAccessFile.getFilePointer();
        percentage =fileposition*100/size;
        return percentage;
    }
    public void close()throws IOException{
        randomAccessFile.close();
    }

}
