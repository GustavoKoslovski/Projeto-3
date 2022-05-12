package br.com.uniamerica.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
@Table(name = "agendas", schema = "public")
@NoArgsConstructor
public class Agenda extends AbstractEntity {

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusAgenda status;

    @Getter @Setter
    @Column(name = "data_de", nullable = false)
    private LocalDateTime dataDe;

    @Getter @Setter
    @Column(name = "data_ate", nullable = false)
    private LocalDateTime dataAte;

    @Getter @Setter
    @Column(name = "encaixe", columnDefinition = "BOOLEAN DEFAULT TRUE", nullable = false)
    private Boolean encaixe;

    @Getter @Setter
    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;
}