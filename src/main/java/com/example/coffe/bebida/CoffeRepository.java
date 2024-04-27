package com.example.coffe.bebida;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeRepository extends JpaRepository<Coffe, Long>{ // herda todos os metodos de acesso ao banco de dados
    //JpaRepository<Classe, Tipo da chave primaria>
} 
