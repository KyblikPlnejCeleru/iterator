import java.util.ArrayList;
import java.util.Iterator;

public class Listofpaper implements Iterator {
    private ArrayList<Integer> nemamponeticotudelamteckalabubu;

    public void addnemamponeticotudelamteckalabubu(int i){
        nemamponeticotudelamteckalabubu.add(i);

    }
public int velikostRadimoveKoty(){
        return nemamponeticotudelamteckalabubu.size();
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
