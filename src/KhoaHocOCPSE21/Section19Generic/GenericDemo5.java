package KhoaHocOCPSE21.Section19Generic;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo5 {
   public static void main(String[] args) {
       List<Integer> integers = new ArrayList<>();
       List list = new ArrayList();
       list = integers;
       list.add("some string");

    }
}
