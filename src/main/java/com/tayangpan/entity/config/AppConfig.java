package com.tayangpan.entity.config;

import com.tayangpan.entity.query.utils.StringTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("appConfig")
public class AppConfig {

    private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);

    /**
     * 文件目录
     */
    @Value("${project.folder:}")
    private String projectFolder;

    /**
     * 发送人
     */
    @Value("${spring.mail.username:}")
    private String sendUserName;


    @Value("${admin.emails:}")
    private String adminEmails;

    public String getAdminEmails() {
        return adminEmails;
    }

    @Value("${dev:false}")
    private Boolean dev;

    public String getProjectFolder() {
        if (!StringTools.isEmpty(projectFolder) && !projectFolder.endsWith("/")) {
            projectFolder = projectFolder + "/";
        }
        return projectFolder;
    }

    public static Logger getLogger() {
        return logger;
    }

    public String getSendUserName() {
        return sendUserName;
    }

    public Boolean getDev() {
        return dev;
    }

}
