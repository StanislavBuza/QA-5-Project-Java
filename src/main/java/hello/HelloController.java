package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String test() {
        return  "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<form action=\"/login\" >" +
                "Login:<br/>" +
                " <input type=\"text\" name=\"login\"><br>" +
                "<br/>Password: <br/>" +
                "<input type=\"password\" name=\"password\"><br>" +
                "<br/>Gender<br/>" +
                "<input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\n" +
               " <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\n" +
                "<input type=\"radio\" name=\"gender\" value=\"other\"> Other<br>\n" +
                "<input type=\"submit\" value=\"Submit\">"+
                "</form>" +
                "</body>\n" +
                "</html>\n";
    }
    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam String login,@RequestParam String password) {
        System.out.println("Login :" + login);
        System.out.println("Password :" + password);
        return "Login: " + login + "       "  + "Password: " + password ;
    }
}