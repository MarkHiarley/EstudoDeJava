package estudo.java.EstudosDeJava.Repository;


import estudo.java.EstudosDeJava.models.Anao;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public class AnaoRepository {


    public Anao ListAnoes(){
        return new Anao(null, "Gimli", 139, 120, null, null);
    }

}
