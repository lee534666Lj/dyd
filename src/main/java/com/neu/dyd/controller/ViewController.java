package com.neu.dyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @DO:
 * @Program:pspenv
 * @Author 李君（2765395275）
 * @Create: 2019/4/15 21:49
 *--学海无涯苦作舟--
 */
@Controller
public class ViewController {

    @RequestMapping(value="/myWebSocket",method = RequestMethod.GET)
    public String index(){
        return "myWebSocket";
    }

}
