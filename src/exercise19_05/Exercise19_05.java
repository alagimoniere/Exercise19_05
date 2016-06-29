package exercise19_05;

public class Exercise19_05 {

    public static <E extends Comparable<E>> E max(E[] list) {
        E largest = list[0] ;
	for (int i = 1; i < list.length ; i++) {
            if (list[i].compareTo(largest) > 0)
		largest = list[i] ;
        }
	return largest; 
    }

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        System.out.println(max(integers));
    }
    
}
