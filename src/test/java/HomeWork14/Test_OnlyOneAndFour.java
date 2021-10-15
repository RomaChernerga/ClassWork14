package HomeWork14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class Test_OnlyOneAndFour {


    private int[] in;
    private boolean out;

    public Test_OnlyOneAndFour(int[] in, boolean out) { // конструктор для проверяемого массива и вывода
        this.in = in;
        this.out = out;
    }


    @Test
    void onlyOneAndFour() {
    }
}