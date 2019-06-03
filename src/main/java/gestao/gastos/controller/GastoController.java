package gestao.gastos.controller;


import gestao.gastos.model.GastoModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.security.Principal;

@RestController
@RequestMapping("/gasto")
public class GastoController {

    @GetMapping
    public ResponseEntity integracaoGastosCartao(){
        //return "Funfou!";
        return ResponseEntity.ok("GastoController");
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody GastoModel gasto, Principal principal){
        gasto.getValor();
        return ResponseEntity.ok().build();
    }


}
