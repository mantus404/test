package lt.techin.numbers;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.test.BaseTest;

public class Test extends BaseTest {
    @Override
    protected Exercises createExercises() {
        return new MyExercises();
    }
}
