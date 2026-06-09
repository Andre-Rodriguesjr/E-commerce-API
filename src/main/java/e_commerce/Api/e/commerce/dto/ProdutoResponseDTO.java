package e_commerce.Api.e.commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponseDTO {
    private Long id;

    private String nome;

    private String marca;

    private BigDecimal preco;

    private String descricao;

    private int estoque;

    private String categoria;
}
