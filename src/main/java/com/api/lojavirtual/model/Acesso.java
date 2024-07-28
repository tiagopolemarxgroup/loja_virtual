package com.api.lojavirtual.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)
public class Acesso implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false)
    private String descricao; /*Acesso ex: ROLE_ADMIN OU ROLE_SECRETARIO*/
    @Override
    public String getAuthority() {
        return this.descricao;
    }
}
