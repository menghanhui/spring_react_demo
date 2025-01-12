package react.backend;

import static org.junit.jupiter.api.Assertions.*;

class ArrayObjectTest {

    @org.junit.jupiter.api.Test
    void result1() throws Exception {
        ArrayObject newObject = new ArrayObject();
        int[] cash = new int[1];
        int[] longterm = new int[1];
        int[] debt = new int[1];
        int[] lia = new int[1];

        cash[0] = 100;
        longterm[0] = 200;
        debt[0] = 150;
        lia[0] = 150;

        newObject.setCash(cash);
        newObject.setLongterm(longterm);
        newObject.setDebt(debt);
        newObject.setLiab(lia);

        int[] real_result = newObject.result();
        assertEquals(real_result[0], 300);
        assertEquals(real_result[1], 300);
        assertEquals(real_result[2], 0);

    }


    @org.junit.jupiter.api.Test
    void result2() throws Exception {
        ArrayObject newObject = new ArrayObject();
        int[] cash = new int[1];
        int[] longterm = new int[1];
        int[] debt = new int[1];
        int[] lia = new int[1];

//        cash[0] = -1;
//        longterm[0] = 0;
//        debt[0] = 0;
//        lia[0] = 0;
//
//        newObject.setCash(cash);
//        newObject.setLongterm(longterm);
//        newObject.setDebt(debt);
//        newObject.setLiab(lia);

        int[] real_result = newObject.result();
        assertEquals(real_result[0], 0);
        assertEquals(real_result[1], 0);
        assertEquals(real_result[2], 0);

    }
}