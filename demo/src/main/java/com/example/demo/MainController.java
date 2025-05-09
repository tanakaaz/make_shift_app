@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        System.out.println("Aa");
        return "index";
    }
}