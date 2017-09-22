package com.client.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Author:   niuruijun
 * Version：
 * Date:     2017/9/21 0021
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * --------------------------------------------------------------
 * Why & What is modified:
 */
@RestController
public class HelloController {
    @RequestMapping("/home")
    public String index(){
        return "hello world";
    }
}
