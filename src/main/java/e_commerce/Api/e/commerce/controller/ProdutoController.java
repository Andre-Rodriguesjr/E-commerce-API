package e_commerce.Api.e.commerce.controller;

import e_commerce.Api.e.commerce.dto.ProdutoRequestDTO;
import e_commerce.Api.e.commerce.dto.ProdutoResponseDTO;
import e_commerce.Api.e.commerce.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    // C
    @PostMapping
    public ProdutoResponseDTO adicionarProduto(
            @RequestBody @Valid ProdutoRequestDTO dto) {

        return produtoService.adicionarProduto(dto);
    }

    // R
    @GetMapping
    public List<ProdutoResponseDTO> listarProdutos() {
        return produtoService.listarProduto();
    }

    @GetMapping("/categoria/{categoria}")
    public List<ProdutoResponseDTO> findByCategoria(@PathVariable String categoria){
        return produtoService.findByCategoria(categoria);
    }

    // R
    @GetMapping("/{id}")
    public ProdutoResponseDTO listarPorId(@PathVariable Long id) {
        return produtoService.listarPorId(id);
    }

    // U
    @PutMapping("/{id}")
    public ProdutoResponseDTO atualizarProduto(
            @PathVariable Long id,
            @RequestBody @Valid ProdutoRequestDTO dto) {

        return produtoService.atualizarProduto(id, dto);
    }

    // D
    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        produtoService.removerProduto(id);
    }

}