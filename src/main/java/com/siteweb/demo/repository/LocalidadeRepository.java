package com.siteweb.demo.repository;

import com.siteweb.demo.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}
