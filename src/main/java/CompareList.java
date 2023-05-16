import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareList {


    @Test
    public void testListEaquality(){
        List<String> list1 = new ArrayList<>();
        list1.add ("dog");
        list1.add ("cat");
        list1.add("Money");
        list1.add("Horse");

        List<String> list2 = new ArrayList<>();
        list2.add ("dog");
        list2.add ("cat");
        list2.add("Money");
        list2.add("Horse");


        //assertArrayEaquls(list1.toArray(), list2.toArray());
    }

    }





