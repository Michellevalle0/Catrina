/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;

import java.sql.Date;
import mx.itson.catrina.entidades.enumeradores.TipoMovimiento;

/**
 *
 * @author miche
 */
public class Movimiento {
    
    private Date fecha;
    private String descripcion;
    private TipoMovimiento tipo;
    private Cuenta cuenta;

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the tipo
     */
    public TipoMovimiento getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
