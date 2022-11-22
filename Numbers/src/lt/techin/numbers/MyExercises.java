package lt.techin.numbers;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class MyExercises implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().min(Integer::compare).get();
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().max(Integer::compare).get();
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }

    @Override
    public int computeSumOfNumbers(int i) {
        int tempSum = 0;
        for (int n = 1; n <= i; n++){
            tempSum += n;
        }
        return tempSum;
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int tempSum = 0;
        for (int n = 1; n <= i; n++){
            if (numberFilter.accept(n)) {
                tempSum += n;
            }
        }
        return tempSum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        List<Integer> list = new ArrayList<Integer>();
        for (int n = 1; n < i; n++){
            list.add(n);
        }
        return list;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int each : list){
            if (map.get(each) != null){
                map.put(each, (map.get(each) + 1));
            } else {
                map.put(each, 1);
            }
        }
        return map;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new MyIntegerGenerator(i, i1);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return null;
    }
}
