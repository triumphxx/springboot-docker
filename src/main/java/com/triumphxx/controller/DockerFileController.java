package com.triumphxx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:triumphxx
 * @Date:2020/8/1
 * @Time:4:53 下午
 * @微信公众号：北漂码农有话说
 * @网站：http://blog.triumphxx.com.cn
 * @GitHub https://github.com/triumphxx
 **/
@RestController
public class DockerFileController {
    @RequestMapping("/docker")
    public String dockerFileRun(){
        System.out.println("dockerfile测试");
        return "DockerFile";
    }
}
