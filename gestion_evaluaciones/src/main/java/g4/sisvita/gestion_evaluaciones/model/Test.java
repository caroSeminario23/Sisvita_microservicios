package g4.sisvita.gestion_evaluaciones.model;


import g4.sisvita.gestion_evaluaciones.model.TipoTest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTest;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_tipo_test", nullable = false)
    private TipoTest tipoTest;

    @Column(name = "n_preguntas", nullable = false)
    private Integer nPreguntas;

    @Column(name = "id_idioma", nullable = false)
    private Integer idIdioma;

    @Column(name = "n_version", nullable = false)
    private Integer nVersion;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}
