package com.example.biblioteca.View;

import com.example.biblioteca.Controller.EmprestimoController;
import com.example.biblioteca.Model.Cliente;
import com.example.biblioteca.Model.Emprestimo;
import com.example.biblioteca.Model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoView {

    EmprestimoController emprestimoController = new EmprestimoController();

    @GetMapping
    public List<Emprestimo> buscarEmp(
            @RequestParam(required = false)Date dataFim
            ) {
        if (dataFim != null) {
            return emprestimoController.buscarDataFim(dataFim);
        } else {
            return emprestimoController.buscarTodos();
        }
    }

    @PostMapping
    public boolean criarEmp(@RequestBody Emprestimo emprestimo) {
        return emprestimoController.criarEmp(emprestimo);
    }

    @PostMapping("/{idEmprestimo}/livro")
    public Emprestimo inserirLivro (@RequestBody Livro livro, @PathVariable Long idEmprestimo) {
        return emprestimoController.inserirLivros(idEmprestimo, livro);
    }

    @PutMapping("/{idEmprestimo}")
    public boolean attDataFim (@RequestBody Emprestimo emprestimo, @PathVariable Long idEmprestimo) {
        return emprestimoController.attDataFim(idEmprestimo, emprestimo);
    }

    @PutMapping("/{idEmprestimo}/clientes/{idCliente}")
    public boolean atualizarCliente(@PathVariable Long idEmprestimo, @PathVariable Long idCliente, @RequestBody Cliente cliente) {
        return emprestimoController.attClienteEmp(idEmprestimo, idCliente, cliente);
    }

    @DeleteMapping("/{idEmprestimo}")
    public boolean excluirEmp(@PathVariable Long idEmprestimo) {
        return emprestimoController.excluirEmp(idEmprestimo);
    }
}
