package com.proyecto.convertic.entidades;

import javax.persistence.*;

@Entity
@Table(name="tipo_documento")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
private int id_documento;
private String documento;

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
