package com.proyecto.convertic.entidades;

import javax.persistence.*;

@Entity
@Table(name="registro")
public class Registro {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)

@Column(name="id_registro")
   private int IdRegistro;

   @Column(name="n_documento")
   private String nDocumento;

   private String nombres;
   private String apellidos;
   @Column(name="correo_electronico")

   private String correoElectronico;
   private String contrasenna;

   @ManyToOne
   @JoinColumn(name = "id_documento")
   private TipoDocumento tipoDocumento;

   public int getIdRegistro() {
      return IdRegistro;
   }

   public void setIdRegistro(int idRegistro) {
      IdRegistro = idRegistro;
   }

   public String getnDocumento() {
      return nDocumento;
   }

   public void setnDocumento(String nDocumento) {
      this.nDocumento = nDocumento;
   }

   public String getNombres() {
      return nombres;
   }

   public void setNombres(String nombres) {
      this.nombres = nombres;
   }

   public String getApellidos() {
      return apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public String getCorreoElectronico() {
      return correoElectronico;
   }

   public void setCorreoElectronico(String correoElectronico) {
      this.correoElectronico = correoElectronico;
   }

   public String getContrasenna() {
      return contrasenna;
   }

   public void setContrasenna(String contrasenna) {
      this.contrasenna = contrasenna;
   }

   public TipoDocumento getTipoDocumento() {
      return tipoDocumento;
   }

   public void setTipoDocumento(TipoDocumento tipoDocumento) {
      this.tipoDocumento = tipoDocumento;
   }
}


