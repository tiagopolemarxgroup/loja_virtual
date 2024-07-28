package com.api.lojavirtual.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="categoria_produto")
@SequenceGenerator(name = "seq_categoria_produto", sequenceName = "seq_categoria_produto", allocationSize = 1, initialValue = 1)
public class CategoriaProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_categoria_produto")
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name = "nome_desc", nullable = false)
    private String nomeDesc;
}
