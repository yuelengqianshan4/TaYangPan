package com.tayangpan.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tayangpan.entity.enums.DateTimePatternEnum;
import com.tayangpan.entity.query.utils.DateUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 邮箱验证码
 */
@Data
@NoArgsConstructor
public class EmailCode implements Serializable {


    /**
     * 邮箱
     */
    private String email;

    /**
     * 编号
     */
    private String code;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 0:未使用  1:已使用
     */
    private Integer status;

    @Override
    public String toString() {
        return "邮箱:" + (email == null ? "空" : email) + "，编号:" + (code == null ? "空" : code) + "，创建时间:" + (createTime == null ? "空" : DateUtil.format(createTime,
                DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "，0:未使用  1:已使用:" + (status == null ? "空" : status);
    }
}
