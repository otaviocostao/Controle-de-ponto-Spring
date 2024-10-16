package com.siteweb.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Movimentacao {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public static class MovimentacaoID implements Serializable {
                private long idMovimento;
                private long idUsuario;
        }

        @EmbeddedId
        private MovimentacaoID id;

        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodo;

        @ManyToOne // Relacionamento com Ocorrencia
        @JoinColumn(name = "ocorrencia_id") // Chave estrangeira
        private Ocorrencia ocorrencia;

        @ManyToOne // Relacionamento com Calendario
        @JoinColumn(name = "calendario_id") // Chave estrangeira
        private Calendario calendario;
}
