@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "index";
    }
}