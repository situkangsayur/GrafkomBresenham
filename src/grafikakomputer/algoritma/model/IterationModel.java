/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.model;

/**
 *
 * @author hendri
 */
public class IterationModel {

    private Integer itterationK;
    private Integer parameterPx;
    private Koordinat point;
    private Integer pointX;
    private Integer pointY;

    public Integer getItterationK() {
        return itterationK;
    }

    public void setItterationK(Integer itterationK) {
        this.itterationK = itterationK;
    }

    public Integer getParameterPx() {
        return parameterPx;
    }

    public void setParameterPx(Integer parameterPx) {
        this.parameterPx = parameterPx;
    }

    public Koordinat getPoint() {
        return point;
    }

    public void setPoint(Koordinat point) {
        this.point = point;
        this.pointX = this.point.getX();
        this.pointY = this.point.getY();
    }

    public Integer getPointX() {
        return pointX;
    }

    public void setPointX(Integer pointX) {
        this.pointX = pointX;
    }

    public Integer getPointY() {
        return pointY;
    }

    public void setPointY(Integer pointY) {
        this.pointY = pointY;
    }
}
