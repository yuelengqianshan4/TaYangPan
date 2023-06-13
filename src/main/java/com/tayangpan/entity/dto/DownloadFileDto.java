package com.tayangpan.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DownloadFileDto {
    private String downloadCode;
    private String fileId;
    private String fileName;
    private String filePath;

}
