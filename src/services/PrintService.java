package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    
    private List<T> list  = new ArrayList<T>();


    public T frist(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return  list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++){
            System.out.print(" , " + list.get(i));
        }
        System.out.println("]");
    }

    public void addValue(T values){
        list.add(values);
    }
}
