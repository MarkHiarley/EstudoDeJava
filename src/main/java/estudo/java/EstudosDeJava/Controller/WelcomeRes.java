package estudo.java.EstudosDeJava.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeRes {

    @GetMapping("/")
public ResponseEntity<estudo.java.EstudosDeJava.models.WelcomeRes> welComeRoot(){
      estudo.java.EstudosDeJava.models.WelcomeRes res = new estudo.java.EstudosDeJava.models.WelcomeRes(
            "Welcome to my API",
            "1.0.0",
            "MarkHiarley",
              "https://github.com/MarkHiarley/EstudoDeJava"
    );
        return ResponseEntity.ok(res);
}
}
