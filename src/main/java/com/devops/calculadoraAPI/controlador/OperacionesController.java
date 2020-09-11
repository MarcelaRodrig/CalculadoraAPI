package com.devops.calculadoraAPI.controlador;

import com.devops.calculadoraAPI.modelo.Operaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class OperacionesController {

    @Autowired
    Operaciones calculadora;

    @RequestMapping(value="/suma/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> suma(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body(calculadora.suma(n1,n2));
    }

    @RequestMapping(value="/resta/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> resta(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body(calculadora.resta(n1,n2));
    }

    @RequestMapping(value="/multiplicacion/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> multiplicacion(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body(calculadora.multiplicacion(n1,n2));
    }

    @RequestMapping(value="/division/{n1}/{n2}",method = RequestMethod.GET)
    public ResponseEntity<Double> division(@PathVariable("n1") double n1,@PathVariable("n2") double n2){
        return ResponseEntity.status(200).body(calculadora.division(n1,n2));
    }
}
