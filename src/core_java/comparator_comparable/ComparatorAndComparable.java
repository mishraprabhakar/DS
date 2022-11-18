package core_java.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorAndComparable {

    public static void main(String[] args) {

        List<Laptop> laptopList = new ArrayList<>();

        laptopList.add(new Laptop("HP", 8, 20000));
        laptopList.add(new Laptop("DELL", 12, 30000));
        laptopList.add(new Laptop("APPLE", 8, 50000));

        Collections.sort(laptopList);

//        Comparator<Laptop> com = new Comparator<Laptop>() {
//            @Override
//            public int compare(Laptop o1, Laptop o2) {
//                if (o1.getPrice() > o2.getPrice()){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        };


//        Collections.sort(laptopList, com);
        for (Laptop laptop: laptopList) {
            System.out.println(laptop);
        }

    }


}
