package com.example.biblioteca.Controller;

import com.example.biblioteca.Banco.EmprestimoBD;
import com.example.biblioteca.Model.Cliente;
import com.example.biblioteca.Model.Emprestimo;
import com.example.biblioteca.Model.Livro;

import java.util.Date;
import java.util.List;

public class EmprestimoController {

    EmprestimoBD repositorio = new EmprestimoBD();

    // Buscar todos x
    public List<Emprestimo> buscarTodos() {
        return repositorio.buscarTodos();
    }

    // Buscar por Data fim x
    public List<Emprestimo> buscarDataFim(Date dataFim) {
        return repositorio.buscarEmpData(dataFim);
    }

    // Criar emprestimo x
    public boolean criarEmp(Emprestimo emprestimo) {
        return repositorio.criarEmprestimo(emprestimo);
    }

    // Add livros no emprestimo x
    public Emprestimo inserirLivros(Long idEmprestimo, Livro livro) {
        return repositorio.inserirLivroEmp(idEmprestimo, livro);
    }

    // Atualizar Data fim do emprestimo x
    public boolean attDataFim (Long idEmprestimo, Emprestimo emprestimo) {
        return repositorio.attDataFimEmp(idEmprestimo, emprestimo);
    }

    // Atualizar Cliente x
    public boolean attClienteEmp(Long idEmprestimo, Long idCliente, Cliente cliente){
        return repositorio.attClienteEmp(idEmprestimo, idCliente, cliente);
    }

    // Excluir emprestimo x
    public boolean excluirEmp(Long idEmprestimo) {
        return repositorio.excluir(idEmprestimo);
    }


}
