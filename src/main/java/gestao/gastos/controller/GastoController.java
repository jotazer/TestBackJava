package gestao.gastos.controller;


import gestao.gastos.application.GastoApplication;
import gestao.gastos.model.GastoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    private GastoApplication application;

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody GastoModel gasto, Principal principal){
        application.save(gasto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getLast(Principal principal){
        LocalDateTime data = LocalDateTime.now().minusSeconds(5);
        data = LocalDateTime.now().minusMinutes(5);
        return new ResponseEntity<List<GastoModel>>(application.findByData(data), HttpStatus.OK);
    }




}
