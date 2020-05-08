/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Huesped {

    private int id;
    private int cedula;
    private String nombrecompleto;
    private String genero;
    private String correo;
    private String telefono;
    private Date fechanacimiento;
    private String nacionalidad;
    private String contrasena;

    public Huesped() {

    }

    public Huesped(int id, int cedula, String nombrecompleto, String genero, String correo, String telefono, Date fechanacimiento, String nacionalidad, String contrasena) {
        this.id = id;
        this.cedula = cedula;
        this.nombrecompleto = nombrecompleto;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.nacionalidad = nacionalidad;
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
