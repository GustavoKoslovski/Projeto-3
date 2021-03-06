package br.com.uniamerica.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEntity {

    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Getter @Setter
    @Column(name = "cadastro", nullable = false)
    private LocalDateTime cadastro;

    @Getter @Setter
    @Column(name = "atualizado")
    private LocalDateTime atualizado;

    @Getter @Setter
    @Column(name = "excluido")
    private LocalDateTime excluido;

    @Getter @Setter
    @Column(name = "ativo")
    private Boolean ativo;

    /**
     * Método executado antes da execução repository.save
     */
    @PrePersist
    public void dataCadastro(){
        this.cadastro = LocalDateTime.now();
    }

    /**
     * Método executado antes da execução repository.update
     */
    @PreUpdate
    public void dataAtualizacao(){
        this.atualizado = LocalDateTime.now();
    }

}
