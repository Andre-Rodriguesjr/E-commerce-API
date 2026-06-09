package e_commerce.Api.e.commerce.service;


import e_commerce.Api.e.commerce.dto.ProdutoRequestDTO;
import e_commerce.Api.e.commerce.dto.ProdutoResponseDTO;
import e_commerce.Api.e.commerce.entity.Produto;
import e_commerce.Api.e.commerce.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public ProdutoResponseDTO adicionarProduto(ProdutoRequestDTO dto) {

        Produto produto = new Produto();

        produto.setNome(dto.getNome());
        produto.setMarca(dto.getMarca());
        produto.setPreco(dto.getPreco());
        produto.setDescricao(dto.getDescricao());
        produto.setEstoque(dto.getEstoque());
        produto.setCategoria(dto.getCategoria());

        Produto produtoSalvo = repository.save(produto);

        return converterParaResponse(produtoSalvo);
    }

    public List<ProdutoResponseDTO> listarProduto() {

        return repository.findAll()
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }

    public ProdutoResponseDTO listarPorId(Long id) {

        Produto produto = repository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Produto não encontrado"));

        return converterParaResponse(produto);
    }

    public List<ProdutoResponseDTO> findByCategoria(String categoria) {
        return repository.findByCategoria(categoria)
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }


    public ProdutoResponseDTO atualizarProduto(
            Long id,
            ProdutoRequestDTO dto) {

        Produto produto = repository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Produto não encontrado"));

        produto.setNome(dto.getNome());
        produto.setMarca(dto.getMarca());
        produto.setPreco(dto.getPreco());
        produto.setDescricao(dto.getDescricao());
        produto.setEstoque(dto.getEstoque());
        produto.setCategoria(dto.getCategoria());

        Produto produtoAtualizado = repository.save(produto);

        return converterParaResponse(produtoAtualizado);
    }

    public void removerProduto(Long id) {

        Produto produto = repository.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Produto não encontrado"));

        repository.delete(produto);
    }

    private ProdutoResponseDTO converterParaResponse(Produto produto) {

        return new ProdutoResponseDTO(
                produto.getId(),
                produto.getNome(),
                produto.getMarca(),
                produto.getPreco(),
                produto.getDescricao(),
                produto.getEstoque(),
                produto.getCategoria()
        );
    }
}

