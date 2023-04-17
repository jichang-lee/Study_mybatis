package org.spring.mybatis.controller;

import lombok.Getter;
import org.spring.mybatis.dto.UserDto;
import org.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping({"/index",""})
    public String index(){
        return "/index";
    }

    @GetMapping("/join")
    public String joinView(){
        return "/join";
    }
    @PostMapping("/join")
    public String joinForm(@ModelAttribute UserDto userDto){
        userService.insert(userDto);
        return "/join";
    }


    @GetMapping("/join2")
    public String joinView2(){
        return "/join2";
    }
    @PostMapping("/join2")
    public String joinForm2(@ModelAttribute UserDto userDto){
        userService.insert2(userDto);
        return "/join2";
    }

    //@RestController
    @GetMapping("/list")
    public @ResponseBody List<UserDto> userList(){
        List<UserDto> list = userService.userlist();
        return list;
    }

    @GetMapping("/list2")
    public String userList2(Model model){
        List<UserDto> list = userService.userlist();
        model.addAttribute("userList",list);
        return "/list";
    }

}
