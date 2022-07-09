package com.wipro.velocity.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="scholarshipapplicalionDetails")
public class FileUploadModel {
	
    private String filename;
    private String fileType;
    private String fileSize;
    private byte[] file;

    public FileUploadModel() {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
