package com.tayangpan.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadResultDto implements Serializable {
    private String fileId;
    private String status;

}
