import java.util.ArrayList;
import java.util.Iterator;

public class Listofpaper implements Iterator {
    private ArrayList<Integer> papir;

    public void addPapir(int i){
        papir.add(i);

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
