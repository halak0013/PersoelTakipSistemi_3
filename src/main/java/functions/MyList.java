package functions;

import java.util.ArrayList;

public class MyList<T, E> {
    public ArrayList<T> list;//?Obje
    public ArrayList<E> list2;//?Tür
    public ArrayList<String> listMessage;//?Mesaj

    public void add(T first, E second, String message) {
        list.add(first);
        list2.add(second);
        listMessage.add(message);
    }

    public MyList() {
        this.list=new  ArrayList<>();
        this.list2=new  ArrayList<>();
        this.listMessage=new  ArrayList<>();
    }
    

    public T getF(int index) {
        return list.get(index);
    }

    public E getS(int index) {
        return list2.get(index);
    }

    public String getM(int index) {
        return listMessage.get(index);
    }

    public int size() {
        return list.size();
    }

    public void remove(int index) {
        list.remove(index);
        list2.remove(index);
        listMessage.remove(index);
    }
}
