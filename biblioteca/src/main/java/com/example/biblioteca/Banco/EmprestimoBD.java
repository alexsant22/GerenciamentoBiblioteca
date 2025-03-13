package com.example.biblioteca.Banco;

import com.example.biblioteca.Model.Emprestimo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmprestimoBD {
    public List<Emprestimo> emprestimos;

    public EmprestimoBD() {
        this.emprestimos = new ArrayList<>();
    }

    // Consulta todos emprestimos
    public List<Emprestimo> buscarTodos() {
        return emprestimos.stream()
                .sorted(Comparator.comparing(Emprestimo::getDataFim).reversed())
                .toList();
    }

    // Criação de novo emprestimo
    public boolean criarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return true;
    }

    // Add novos livros em um emprestimo


    // Atualizar a DATA FIM do emprestimo


    // Atualizar os dados de um cliente


    // Excluir emprestimo
    public boolean excluir(Long idEmprestimo) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(emprestimo -> emprestimo.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);

        emprestimos.remove(emprestimoBD);

        return true;
    }

    // Consultas com base na DATA FIM do emprestimo


}
