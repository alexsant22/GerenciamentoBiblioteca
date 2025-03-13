package com.example.biblioteca.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    // Atributos
    private Long idLivro;
    private String nome;
    private String autor;
    private String genero;

}
