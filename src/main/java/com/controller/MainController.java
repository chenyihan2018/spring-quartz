package com.controller;/**
 * Created by chenjia on 2018/5/21.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenjia
 * @create 2018-05-21 15:15
 * @desc
 **/
@Controller
@RequestMapping(value = "/login")
public class MainController {

    @RequestMapping(value = "/index.do",method = RequestMethod.GET)
    public String index(){
        return "/login/login";
    }

}
