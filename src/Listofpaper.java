import java.util.ArrayList;
import java.util.Iterator;

public class Listofpaper implements Iterator {
    private ArrayList<Integer> nemamponeticotudelamteckalabubu;

    public Listofpaper() {
        this.nemamponeticotudelamteckalabubu = new ArrayList<>();
    }
    public ArrayList<Integer> getNemamponeticotudelamteckalabubu(int i) {
        return nemamponeticotudelamteckalabubu;
    }

    public void setNemamponeticotudelamteckalabubu(ArrayList<Integer> nemamponeticotudelamteckalabubu) {
        this.nemamponeticotudelamteckalabubu = nemamponeticotudelamteckalabubu;
    }

    public void addnemamponeticotudelamteckalabubu(int i){
        nemamponeticotudelamteckalabubu.add(i);

    }
public int velikostRadimoveKoty(){
        return nemamponeticotudelamteckalabubu.size();
}
public Iterator<Integer> iterator(){
        return new Itterator(this);
}
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
