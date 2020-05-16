/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITV;

/**
 *
 * @author usuario
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;

public class Vehiculo {
    
    String Marca,Modelo,Matricula,Cilindrada,Potencia,Hora_de_llegada,Fecha_de_matriculacion;

    public Vehiculo(String Marca, String Modelo, String Matricula, String Cilindrada, String Potencia, String Hora_de_llegada, String Fecha_de_matriculacion) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Matricula = Matricula;
        this.Cilindrada = Cilindrada;
        this.Potencia = Potencia;
        this.Hora_de_llegada = Hora_de_llegada;
        this.Fecha_de_matriculacion = Fecha_de_matriculacion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    public String getHora_de_llegada() {
        return Hora_de_llegada;
    }

    public void setHora_de_llegada(String Hora_de_llegada) {
        this.Hora_de_llegada = Hora_de_llegada;
    }

    public String getFecha_de_matriculacion() {
        return Fecha_de_matriculacion;
    }

    public void setFecha_de_matriculacion(String Fecha_de_matriculacion) {
        this.Fecha_de_matriculacion = Fecha_de_matriculacion;
    }
    
    
}
