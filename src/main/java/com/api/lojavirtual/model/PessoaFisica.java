package com.api.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Pessoa{
    @Column(nullable = false)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

}
