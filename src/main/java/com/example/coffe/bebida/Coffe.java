package com.example.coffe.bebida;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

//representa uma entidade da minha tabela SQL
@Table(name = "coffe") //nome da tabela 
@Entity(name = "coffe") //nome da entidade
@Getter //gera os gets em tempo de execução 
@NoArgsConstructor // declara contrutor sem argumentos
@AllArgsConstructor // declara contrutor com todos os argumentos
@EqualsAndHashCode(of = "id")
public class Coffe {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String tag; 
    private Integer price;
    private String img;

    public Coffe(CoffeRequestDTO data){
        this.name = data.name();
        this.tag = data.tag();
        this.price = data.price();
        this.img = data.img();
    }
}
