import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class Listik implements Iterable<Integer>{
    private ArrayList<Integer> listik;

    public void addNumber(Integer num){
        listik.add(num);
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}