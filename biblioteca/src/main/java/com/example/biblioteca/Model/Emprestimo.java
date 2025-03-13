package com.example.biblioteca.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo {
    // Atributos
    private Long idEmprestimo;
    private Date dataInicio;
    private Date dataFim;
    private ArrayList<Livro> livros;
    private ArrayList<Cliente> clientes;

}
