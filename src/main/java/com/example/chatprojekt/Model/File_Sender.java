package com.example.chatprojekt.Model;

public class File_Sender {
    private int fileID;
    private byte[] fileData;
    private boolean finish;

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public File_Sender() {
    }

    public File_Sender(int fileID, byte[] fileData, boolean finish) {
        this.fileID = fileID;
        this.fileData = fileData;
        this.finish = finish;
    }


}
