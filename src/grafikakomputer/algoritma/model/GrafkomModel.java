/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.algoritma.model;

import grafikakomputer.algoritma.listener.GrafkomListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hendri
 */
public class GrafkomModel {

    private Koordinat startPoint;
    private Koordinat endPoint;
    private List<IterationModel> result;
    private BressenhamModel bresenham;
    private GrafkomListener listener;

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

    public void setListener(GrafkomListener listener) {
        this.listener = listener;
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.hitungAlgoritma(bresenham, result);
        }
    }

    public void searchResult() {
        if (bresenham == null) {
            bresenham = new BressenhamModel();
        }
        result = new ArrayList<IterationModel>();

        bresenham.setStartPoint(startPoint);
        bresenham.setEndPoint(endPoint);

        int k = 0;
        Koordinat start = new Koordinat();
        Koordinat end = new Koordinat();

        start.setX(startPoint.getX());
        start.setY(startPoint.getY());
        end.setX(endPoint.getX());
        end.setY(endPoint.getY());

        if (k == 0) {
            IterationModel iteration = new IterationModel();
            iteration.setItterationK(new Integer(k));
            iteration.setParameterPx(bresenham.getParameterKeNol());

            if (bresenham.getParameterKeNol() < 0) {
                start.setX(start.getX() + 1);
                start.setY(start.getY());

                //iteration.setParameterPx(bresenham.getParameterKeNol() + bresenham.getDuaDeltaY());
            } else {
                start.setX(start.getX() + 1);
                start.setY(start.getY() + 1);
                //iteration.setParameterPx(bresenham.getParameterKeNol() + bresenham.getDuaDeltaYMinDuaDeltaY());
            }
            iteration.setPoint(start);
            result.add(iteration);


        }
        System.out.println(end.getX() + "and" + end.getY());
        while ((result.get(k).getPoint().getX().intValue() != end.getX().intValue()) && (result.get(k).getPoint().getY().intValue() != end.getY().intValue())) {
            
            k++;
            System.out.println("ke-" + k);
            System.out.println(result.get(k - 1).getParameterPx());

            Koordinat newPoint = new Koordinat();
            IterationModel iteration = new IterationModel();
            iteration.setItterationK(k);
            
            if(result.get(k-1).getParameterPx() < 0){
                iteration.setParameterPx(result.get(k - 1).getParameterPx() + bresenham.getDuaDeltaY());
            }else{
                iteration.setParameterPx(result.get(k - 1).getParameterPx() + bresenham.getDuaDeltaYMinDuaDeltaY());
            }


            if (iteration.getParameterPx() < 0) {
                newPoint.setX(result.get(k - 1).getPoint().getX() + 1);
                newPoint.setY(result.get(k - 1).getPoint().getY());
               
            } else {
                newPoint.setX(result.get(k - 1).getPoint().getX() + 1);
                newPoint.setY(result.get(k - 1).getPoint().getY() + 1);
               
            }
            // System.out.println(bresenham.getDuaDeltaYMinDuaDeltaY());
            iteration.setPoint(newPoint);
            result.add(iteration);

            System.out.println(result.get(k).getPoint().getX() + "-DAN-" + result.get(k).getPoint().getY());


        }
        fireOnChange();
    }
}
