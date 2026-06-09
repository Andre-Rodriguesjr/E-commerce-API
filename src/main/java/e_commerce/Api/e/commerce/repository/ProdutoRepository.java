package e_commerce.Api.e.commerce.repository;

import e_commerce.Api.e.commerce.dto.ProdutoResponseDTO;
import e_commerce.Api.e.commerce.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findByCategoria (String categoria);

}


