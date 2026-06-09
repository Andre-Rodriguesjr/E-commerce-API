package e_commerce.Api.e.commerce.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequestDTO {


    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "A marca é obrigatório")
    private String marca;

    @Positive(message = "O preço deve ser maior que zero")
    private BigDecimal preco;

    @Size(max = 500, message = "A descrição deve ter no máximo 500 caracteres")
    private String descricao;

    @PositiveOrZero(message = "O estoque não pode ser negativo")
    private int estoque;

    @NotBlank(message = "A categoria é obrigatória")
    private String categoria;
}
