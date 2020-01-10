package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Java is fucking hard!";
    }
    @RequestMapping("/test")
    public String test() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>Just a title</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <p>This is just a text!</p>\n" +
                "  </body>\n" +
                "</html>";
    }
}
