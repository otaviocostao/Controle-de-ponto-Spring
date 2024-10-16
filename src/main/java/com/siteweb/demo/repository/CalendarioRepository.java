package com.siteweb.demo.repository;

import com.siteweb.demo.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioRepository extends JpaRepository<Calendario, Long>{
}
