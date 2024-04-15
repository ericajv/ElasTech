package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/elastech")
    @ResponseBody
    public String paginaelastech(){
        return "Ola eu sou a pagina ElasTech";
    }
}
