package com.api.lojavirtual.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "pessoa_juridica")
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String nomeFantasia;
    private String razaoSocial;
    private String categoria;
}
