package com.tian.tblong;

import com.tian.tblong.init.InitConfiguretion;
import com.tian.tblong.service.RedisService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright: Copyright (c) 2019 xxx有限公司
 *
 * @ClassName: RedisTest
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: tblong
 * @date: 2020/3/7 23:26
 * <p>
 * Modification History:
 * Date            Author          Version         Description
 * -------------------------------------------------------------*
 * 2020/3/7     tblong           v1.0.0            新建
 */
public class RedisTest {

    @Test
    public void startRedis(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitConfiguretion.class);

        RedisService redisService = (RedisService) applicationContext.getBean("redisService");
        if(redisService != null){
            redisService.set("ABC", "123456");
            System.out.println("----->" + redisService.get("ABC"));
        }
    }
}
