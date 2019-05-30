package life.aper.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizeController
{
    @GetMapping("/callback")
    public String callback(){
        return "index";
    }
}
