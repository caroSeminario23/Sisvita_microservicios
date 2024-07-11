package g4.sisvita.gestion_evaluaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "escala")
public class Escala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEscala;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_test", nullable = false)
    private Test test;

    @Column(name = "puntaje_max", nullable = false)
    private Integer puntajeMin;

    // Constructores
    public Escala() {}

    public Escala(String nombre, String descripcion, Test test, Integer puntajeMin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.test = test;
        this.puntajeMin = puntajeMin;
    }

    // Getters y Setters
    public Integer getIdEscala() {
        return idEscala;
    }

    public void setIdEscala(Integer idEscala) {
        this.idEscala = idEscala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Integer getPuntajeMin() {
        return puntajeMin;
    }

    public void setPuntajeMin(Integer puntajeMin) {
        this.puntajeMin = puntajeMin;
    }
}
