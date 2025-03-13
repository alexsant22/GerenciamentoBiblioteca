package com.example.biblioteca.Controller;

import com.example.biblioteca.Banco.EmprestimoBD;
import com.example.biblioteca.Model.Emprestimo;

import java.util.List;

public class EmprestimoController {

    EmprestimoBD repositorio = new EmprestimoBD();

    // Buscar todos
    public List<Emprestimo> buscarTodos() {
        return repositorio.buscarTodos();
    }

    // Buscar por Data fim


    // Criar emprestimo
    public String criarEmp(Emprestimo emprestimo) {
        boolean resultado = repositorio.criarEmprestimo(emprestimo);

        if (resultado == true) {
            System.out.println("Empréstimo criado com sucesso!");
        }

        return "Não foi possivél criar o empréstimo.";
    }

    // Add livros no emprestimo


    // Atualizar Data fim do emprestimo


    // Atualizar Cliente


    // Excluir emprestimo
    public String excluirEmp(Long idEmprestimo) {
        boolean resultado = repositorio.excluir(idEmprestimo);

        if (resultado == true) {
            System.out.println("Empréstimo excluído com sucesso!");
        }

        return "Não foi possivél excluir o empréstimo.";
    }


}
