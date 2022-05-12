package br.com.uniamerica.api.service;
import br.com.uniamerica.api.entity.Agenda;
import br.com.uniamerica.api.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public Optional<Agenda> fyndById(Long id){return this.agendaRepository.findById(id);
    }

    public Page<Agenda> listAll(Pageable pageable){return this.agendaRepository.findAll(pageable);
    }

    @Transactional
    public void insert(Agenda agenda){
        this.agendaRepository.save(agenda);
    }

    @Transactional
    public void updateStatus(Long id, Agenda agenda){
        if (id == agenda.getId()) {
            this.agendaRepository.updateStatus(LocalDateTime.now(),agenda.getId());
        }
        else {
            throw new RuntimeException();
        }
    }
}




