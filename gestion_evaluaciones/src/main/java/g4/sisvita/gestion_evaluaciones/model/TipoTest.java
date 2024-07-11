package g4.sisvita.gestion_evaluaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_test")
public class TipoTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoTest;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    // Constructores
    public TipoTest() {}

    public TipoTest(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Integer getIdTipoTest() {
        return idTipoTest;
    }

    public void setIdTipoTest(Integer idTipoTest) {
        this.idTipoTest = idTipoTest;
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
}
