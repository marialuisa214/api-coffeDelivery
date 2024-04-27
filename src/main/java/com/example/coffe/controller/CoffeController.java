package com.example.coffe.controller;


import com.example.coffe.bebida.Coffe;
import com.example.coffe.bebida.CoffeRepository;
import com.example.coffe.bebida.CoffeRequestDTO;
import com.example.coffe.bebida.CoffeResponseDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("coffe")
public class CoffeController{
    @Autowired //injeção de dependencia
    private CoffeRepository repository;

    @GetMapping("/all")
    public @ResponseBody List<CoffeResponseDTO> getAllCoffe () {
        List<CoffeResponseDTO> coffeList =repository.findAll().stream().map(CoffeResponseDTO::new).toList();
        return coffeList;
    
    }

    @PostMapping
    public @ResponseBody void saveCoffe(@RequestBody CoffeRequestDTO data){
        Coffe coffeData = new Coffe(data);
        repository.save(coffeData);
        return;
        
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
}
