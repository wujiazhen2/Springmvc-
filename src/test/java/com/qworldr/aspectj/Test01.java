package com.qworldr.aspectj;

import com.qworldr.aspectj.introductions.Introduction;
import com.qworldr.aspectj.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author wujiazhen
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test01 {

    @Autowired
    private TestService testService;
    @Test
    public void test(){
        testService.test();
        Introduction testService = (Introduction) this.testService;
        System.out.println(testService.introduction());
    }
}
