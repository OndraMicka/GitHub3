//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Listik listik = new Listik();
        listik.addNumber(5);
        listik.addNumber(2);
        listik.addNumber(1);
        listik.addNumber(0);
        IteratorListik iterator = (IteratorListik) listik.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}