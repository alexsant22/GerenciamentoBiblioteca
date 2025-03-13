package com.example.biblioteca.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    // Atributos
    private Long idClient;
    private String nome;
    private String cpf;
    private String nmrTelefone;
    private String email;

}
