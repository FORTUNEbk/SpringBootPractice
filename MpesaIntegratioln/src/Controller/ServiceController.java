
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/status")
    public String getMpesaStatus() {
        return "Mpesa is running";
    }
}
