package br.com.uniamerica.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;


@Entity
@Table(name = "medicos", schema = "public")
@NoArgsConstructor
public class Medico extends Pessoa {

    @Getter @Setter
    @Column(name = "crm", nullable = false, unique = true, length = 50)
    private String crm;

    @Getter @Setter
    @Digits(integer=5, fraction=3)
    @Column(name = "porcentagem_participacao", precision = 5, scale = 3, nullable = false)
    private BigDecimal porcentagemParticipacao;

    @Getter @Setter
    @Column(name = "consultorio", nullable = false, unique = true, length = 50)
    private String consultorio;

    @Getter @Setter
    @Digits(integer=5, fraction=3)
    @Column(name = "valor_consulta", precision = 5, scale = 3, nullable = false)
    private BigDecimal valorConsulta;

    @Getter @Setter
    @ManyToOne
    private Especialidade especialidade;
}
