package com.example.coffe.bebida;

public record CoffeResponseDTO(Long id, String name, String tag, Integer price, String img) {
    public CoffeResponseDTO(Coffe coffe) {
        this(coffe.getId(), coffe.getName(), coffe.getTag(), coffe.getPrice(), coffe.getImg());
    }
    
}
