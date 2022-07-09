package com.wipro.velocity.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection="scholarshipapplicalionDetails")
public class FileUploadModel {
	
    private String fileName;
    private String fileType;
    private String fileSize;
    private byte[] file;

}
