package tienda.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    public Long idCategoria;
    public String descripcion;
    public String rutaImagen;
    public boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
    
    public boolean isActivo(){
        return activo;
    }
    
    public Long getIdCategoria(){
        return idCategoria;
    }
    
    public void setRutaImagen(String rutaImagen){
        this.rutaImagen = rutaImagen;
    }
    
}
