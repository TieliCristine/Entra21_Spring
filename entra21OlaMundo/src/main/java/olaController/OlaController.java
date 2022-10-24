package olaController;

import model.Fabricante;
import model.Modelo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/ola", method = RequestMethod.GET)
@RestController
public class OlaController {

    @RequestMapping(value = "/mundo", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String ola() {
        return "Ola";
    }

    @RequestMapping(value = "/mundo/{nome}", method = RequestMethod.GET)
    public String OlaPessoa(@PathVariable String nome) {
        return "Ola " + nome;
    }

    @RequestMapping(value = "/mundo/fabricante", method = RequestMethod.GET)
    public Fabricante fabricante(Fabricante f){
        f.setId((long)1);
        f.setNome("AUDI");
        f.setOrigem("Alemanha");

        return f;
    }

    @RequestMapping(value = "/mundo/modelo", method = RequestMethod.GET)
    public Modelo modelo (Modelo m, Fabricante f){
        m.setId((long)2);
        m.setNome("Fusca");
        m.setCor("Preto");
        m.setAno(1969);
        m.setQuantPorta(2);
        f.setNome("Volkswagen");
        f.setOrigem("Alemanha");
//        m.setFabrigante(f);

        return m;
    }
}
