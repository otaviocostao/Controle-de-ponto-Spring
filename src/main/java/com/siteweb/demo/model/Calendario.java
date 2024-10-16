package com.siteweb.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Adicione esta anotação
    @JoinColumn(name = "tipo_data_id", nullable = false) // Defina a coluna de junção
    private TipoData tipoData; // Relacionamento com TipoData

    private String descricao;
    private LocalDateTime dataEspecial;
}
