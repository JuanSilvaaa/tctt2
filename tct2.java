
import java.util.Arraylist;


public class Plane extends Machine{
    private boolean inAir;
    private int plate;

    public boolean isAir(){
        return inAir;
    }
}

public class Position{
    private int longitude;
    private int latitude;

    public int getLongitude(){
        return longitude;
    }

    public int getLatitude(){
        return latitude;
    }

    public int moveNorth(){
        longitude += 1;
        return longitude;
    }
}
public class Machine{

    private Position position;
    private Plane plane;

    public boolean isAir(){
        return plane.isAir();
    }

    public int getLatitud(){
        return position.getLatitude();
    }

    public int getLongitud(){
        return position.getLongitude();
    }

    public int moveNorth(){
        return position.moveNorth();
    }


}

public class Fleet{

    private ArrayList<Machine> machines;

    public void moveNorth(){
        for(Machine maquinas : machines){
            maquinas.moveNorth();
        }
    }

    public ArrayList<Machine> willBeDestroyed (int longitude, int latitud){
        ArrayList<Machine> machineDestroyed = new ArrayList<Machine>();
        for(Machine maquinas : machines){
            boolean estaEnAire = maquinas.isAir();
            int lati = maquinas.getLatitud();
            int longi = maquinas.getLongitud();
            if(longitude == longi && latitud == lati && estaEnAire == true){
                machineDestroyed.add(maquinas);
            }
        }
        return machineDestroyed;
    }
}

public class Sailor{
    private String name;
    private int rank;
}

public class Capsula extends Machine(){
    private int profundidad;
    private boolean inmunidad;
    private ArrayList<Sailor> sailor;

    public int cuantosSailorHay(){
        return sailor.size();
    }
    public void changeProfundidad(int nuevaProfundidad){
        if (nuevaProfunidad>8000){
            profundidad = nuevaProfundidad;
            inmunidad = true;
        }
        else{
            profundidad = nuevaProfundidad;
            inmunidad = false;
        }
    }


}
