package net.xdclass.demoproject.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 视频控制器
 */


//@Controller
@RestController
@RequestMapping("/api")
//@SpringBootApplication
public class VideoController {



    @RequestMapping("/hello")
    public String list(String num){
        try {
            Integer n = Integer.parseInt(num);
            if (n > 0) {
                return "整数";
            } else if (n == 0) {
                return "零";
            } else {
                return "负数";
            }
        }catch (Exception e){
            return "不是数字";
        }

    }

    @RequestMapping("/hello2")
    public String list2(String num){
        try {
            Integer n = Integer.parseInt(num);
            if (n > 0) {
                return "整数2";
            } else if (n == 0) {
                return "零2";
            } else {
                return "负数2";
            }
        }catch (Exception e){
            return "不是数字2";
        }

    }

}
