package estudo.java.EstudosDeJava.Services;

import estudo.java.EstudosDeJava.Repository.AnaoRepository;
import estudo.java.EstudosDeJava.models.Anao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AnaoService {

    private final AnaoRepository anaoRepository;

    public  AnaoService(AnaoRepository anaoRepository) {
        this.anaoRepository = anaoRepository;
    }


    public Anao ListAnoes(){
        return anaoRepository.ListAnoes();
    }

}
