package com.tayangpan.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseVO<T> {
    private String status;
    private Integer code;
    private String info;
    private T data;

}
