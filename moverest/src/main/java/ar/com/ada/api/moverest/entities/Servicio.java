package ar.com.ada.api.moverest.entities;

import javax.persistence.MappedSuperclass;

/**
 * Servicio
 */

@MappedSuperclass
public abstract class Servicio {
    private double costo;

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Servicio() {
    }

    public Servicio(double costo) {
        this.costo = costo;
    }
}