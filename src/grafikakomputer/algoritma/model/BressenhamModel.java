/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.model;

import java.util.Vector;

/**
 *
 * @author hendri
 */
public class BressenhamModel {

    private Koordinat startPoint;
    private Koordinat endPoint;
    private Float gradient;
    private Float parameterP;
    private Koordinat delta;

    public Koordinat getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Koordinat endPoint) {
        this.endPoint = endPoint;
    }

    public Koordinat getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Koordinat startPoint) {
        this.startPoint = startPoint;
    }

    public Koordinat getDelta() {
        setDelta();
        return delta;
    }

    public void setDelta() {
        if (this.delta == null) {
            this.delta = new Koordinat();
        }
        this.delta.setX(endPoint.getX() - startPoint.getX());
        this.delta.setY(endPoint.getY() - startPoint.getY());

    }

    public Float getGradient() {
        return gradient;
    }

    public void setGradient(Float gradient) {
        this.gradient = gradient;
    }

    public Float getParameterP() {
        return parameterP;
    }

    public void setParameterP(Float parameterP) {
        this.parameterP = parameterP;
    }

    public Integer getDuaDeltaX() {
        return this.getDelta().getX() * 2;
    }

    public Integer getDuaDeltaY() {
        return this.getDelta().getY() * 2;
    }

    public Integer getDuaDeltaYMinDuaDeltaY() {
        return this.getDuaDeltaY() - this.getDuaDeltaX();
    }

    public Integer getParameterKeNol() {
        return this.getDuaDeltaY() - this.getDelta().getX();
    }
}
