import java.util.Iterator;
import java.util.List;

public class Itterator implements Iterator<Integer> {
private Listofpaper papirxd;
private int cenaKebabu;

public Itterator(Listofpaper papirxd){
    this.papirxd = papirxd;
    this.cenaKebabu=papirxd.velikostRadimoveKoty()-1;
}

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return 0;
    }
}
