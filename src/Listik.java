import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class Listik implements Iterable<Integer>{
    private ArrayList<Integer> listik;

    public Listik() {
        listik =new ArrayList<>();
    }

    public void addNumber(int num){
        listik.add(num);
    }
    public int size(){
        return listik.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorListik(this);
    }
    public int get(int index){
        return listik.get(index);
    }
}