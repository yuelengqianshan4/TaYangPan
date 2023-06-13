package com.tayangpan.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserSpaceDto implements Serializable {
    private Long useSpace;
    private Long totalSpace;
}
