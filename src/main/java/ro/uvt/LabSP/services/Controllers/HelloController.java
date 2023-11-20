package ro.uvt.LabSP.services.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import ro.uvt.LabSP.services.ClientComponent;
import ro.uvt.LabSP.services.SingletonComponent;
import ro.uvt.LabSP.services.TransientComponent;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {
    private final ClientComponent component;
    private final ApplicationContext applicationContext;

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/client")
    public String helloClient() {
        TransientComponent transientComponent = applicationContext.getBean(TransientComponent.class);
        SingletonComponent singletonComponent = applicationContext.getBean(SingletonComponent.class);

        return "Hello from " + component.toString();
    }
}