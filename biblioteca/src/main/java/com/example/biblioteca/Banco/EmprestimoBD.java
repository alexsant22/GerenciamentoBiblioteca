package com.example.biblioteca.Banco;

import com.example.biblioteca.Model.Cliente;
import com.example.biblioteca.Model.Emprestimo;
import com.example.biblioteca.Model.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
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

    // Consultas com base na DATA FIM do emprestimo
    public List<Emprestimo> buscarEmpData(Date dataFim) {
        return emprestimos.stream()
                .filter(emprestimo -> emprestimo.getDataFim().equals(dataFim))
                .toList();
    }

    // Criação de novo emprestimo
    public boolean criarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return true;//enserindo
    }

    // Add novos livros em um emprestimo
    public Emprestimo inserirLivroEmp (Long idEmprestimo, Livro livro) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(emprestimo -> emprestimo.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);

        if (emprestimoBD == null) {
            return null;
        }

        emprestimoBD.getLivros().add(livro);

        return emprestimoBD;
    }

    // Atualizar a DATA FIM do emprestimo
    public boolean attDataFimEmp(Long idEmprestimo, Emprestimo emprestimoEdit) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(emprestimo -> emprestimo.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);

        if (emprestimoBD == null) {
            return false;
        }

        emprestimoBD.setDataFim(emprestimoEdit.getDataFim());

        return true;
    }

    // Atualizar os dados de um cliente
    public boolean attClienteEmp(Long idEmprestimo, Long idCliente, Cliente cliente) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(emprestimo -> emprestimo.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);

        Cliente clienteBD = emprestimoBD.getClientes().stream()
                        .filter(clienteFiltro -> clienteFiltro.getIdClient() == idCliente)
                                .findFirst()
                                        .orElse(null);

        if (emprestimoBD == null) {
            return false;
        }

        clienteBD.setNome(cliente.getNome());
        clienteBD.setCpf(cliente.getCpf());
        clienteBD.setEmail(cliente.getEmail());
        clienteBD.setNmrTelefone(cliente.getNmrTelefone());

        return true;
    }

    // Excluir emprestimo
    public boolean excluir(Long idEmprestimo) {
        Emprestimo emprestimoBD = emprestimos.stream()
                .filter(emprestimo -> emprestimo.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);

        emprestimos.remove(emprestimoBD);

        return true;
    }

}
