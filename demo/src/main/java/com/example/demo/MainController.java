@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "index";
    }
}