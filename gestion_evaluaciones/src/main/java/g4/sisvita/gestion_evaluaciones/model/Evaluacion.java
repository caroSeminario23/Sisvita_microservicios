package g4.sisvita.gestion_evaluaciones.model;

import jakarta.persistence.Column;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluacion")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEvaluacion;

    @Column(name = "id_paciente", nullable = false)
    private Integer idPaciente;

    @Column(name = "id_test", nullable = false)
    private Integer idTest;

    @Column(name = "respuestas", nullable = false)
    private String respuestas;

    @Column(name = "fec_realizacion", nullable = false)
    private LocalDate fecRealizacion;

    @Column(name = "puntaje", nullable = false)
    private Integer puntaje;

    @Column(name = "id_estado", nullable = false)
    private Integer idEscala;
}