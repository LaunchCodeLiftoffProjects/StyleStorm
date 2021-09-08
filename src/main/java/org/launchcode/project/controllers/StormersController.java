package org.launchcode.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("stormers")
public class StormersController {

    private static List<String> posts = new ArrayList<>();

    @GetMapping("index")
    public String Stormers(Model model){
            model.addAttribute("posts", posts);
        return "stormers/index";
    }

    @GetMapping("form")
    public String displayStormersForm(){

        return "stormers/form";
    }

    @PostMapping("form")
    public String processStormersForm(@RequestParam String formsForPosts){
        posts.add(formsForPosts);
        return "redirect:index";
    }


}
