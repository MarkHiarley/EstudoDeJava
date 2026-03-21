package estudo.java.EstudosDeJava;

import models.WelcomeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/")
public ResponseEntity<WelcomeResponse> welComeRoot(){
      WelcomeResponse res = new WelcomeResponse(
            "Welcome to my API",
            "1.0.0",
            "MarkHiarley",
              "https://github.com/MarkHiarley/EstudoDeJava"
    );
        return ResponseEntity.ok(res);
}

}
