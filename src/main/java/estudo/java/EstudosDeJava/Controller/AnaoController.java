package estudo.java.EstudosDeJava.Controller;

import estudo.java.EstudosDeJava.Services.AnaoService;
import estudo.java.EstudosDeJava.models.Anao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Sempre por uma Anotation @RestController
//@RequestMapping("/anao")
public class AnaoController {
    //injeção de dependencias

    private final AnaoService anaoService;
    public AnaoController(estudo.java.EstudosDeJava.Services.AnaoService anaoService) {
        this.anaoService = anaoService;
    }


    @RequestMapping("/anao")
    public ResponseEntity<Anao> GetAnao(){
        return ResponseEntity.ok(anaoService.ListAnoes());
    }

}
