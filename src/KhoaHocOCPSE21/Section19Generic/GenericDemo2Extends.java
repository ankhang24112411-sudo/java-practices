package KhoaHocOCPSE21.Section19Generic;

public class GenericDemo2Extends {

    public static void main(String[] args) {
        System.out.println(maxVal(5,9,10));
    }
    public static <T extends Comparable<T>> T maxVal(T x, T y , T z){
        T max = x ;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return  max;
    }

}
