package lt.techin.numbers;

import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyIntegerGenerator implements IntegerGenerator {


    Iterator<Integer> iterator;
    public MyIntegerGenerator(int from, int to){
        List<Integer> list;
        list = new ArrayList<>();
        for (int i = from; i <= to; i++){
            list.add(i);
        }
        this.iterator = list.iterator();
    }
    public MyIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter){
        List<Integer> list;
        list = new ArrayList<>();
        Integer temp;
        boolean foundNull = false;
        do {
            try {
                temp = integerGenerator.getNext();
                if (numberFilter.accept(temp)) {
                    list.add(temp);
                }
            } catch (NullPointerException e){
                foundNull = true;
            }

        } while (!foundNull);
        this.iterator = list.iterator();

    }

    @Override
    public Integer getNext() {
        if (iterator.hasNext()) {
            return this.iterator.next();
        } else {
            return null;
        }
    }
}
