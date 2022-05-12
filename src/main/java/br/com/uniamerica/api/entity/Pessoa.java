package br.com.uniamerica.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@NoArgsConstructor
public abstract class Pessoa extends AbstractEntity {

    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 50)
    private String nome;

    @Getter @Setter
    @Column(name = "telefone", nullable = false, unique = true, length = 15)
    private String telefone;

    @Getter @Setter
    @Column(name = "celular", nullable = false, unique = true, length = 15)
    private String celular;

    @Getter @Setter
    @Column(name = "nacionalidade", nullable = false, unique = true, length = 20)
    private String nacionalidade;

    @Getter @Setter
    @Column(name = "cpf", nullable = false, unique = true, length = 15)
    private String cpf;

    @Getter @Setter
    @Column(name = "rg", nullable = false, unique = true, length = 15)
    private String rg;

    @Getter @Setter
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Getter @Setter
    @Column(name = "login", nullable = false, unique = true, length = 30)
    private String login;

    @Getter @Setter
    @Column(name = "senha", nullable = false, unique = true, length = 50)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String senha;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false, length = 12)
    private Sexo sexo;
}
