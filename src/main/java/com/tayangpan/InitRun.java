package com.tayangpan;

import com.tayangpan.component.RedisComponent;
import com.tayangpan.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Component("initRun")
public class InitRun implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitRun.class);

    @Resource
    private DataSource dataSource;

    @Resource
    private RedisComponent redisComponent;

    @Override
    public void run(ApplicationArguments args) {
        try {
            dataSource.getConnection();
            redisComponent.getSysSettingsDto();
            logger.info("服务启动成功，可以开始愉快的开发了");
        } catch (Exception e) {
            logger.error(e.toString());
            logger.error("配置错误");
            throw new BusinessException("服务启动失败");
        }
    }
}
