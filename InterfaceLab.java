/**
 * <h2>InterfaceLab.java - Sort an array of doubles</h2>
 * <p>Initial program for Lab 16, which sorts an array of elements that implement the 
 *    Comparable interface</p>
 *    
 * <p>Algorithm:</p>
 * <ul>
 *   <li>Create a method named <code>sort</code> which takes an array of 
 *       objects whose class implements the Comparable interface and
 *       uses a compareTo method to put them in ascending order</li>
 *   <li>Create another method named <code>print</code> which takes an array
 *       of Objects and prints them on a single line on the console in
 *       the order in which they appear in the array.</li>
 * </ul>
 * 
 * <p>In <code>main</code>:<p>
 * <ol>
 *   <li>In <code>main</code> create two arrays, one unsorted and one
 *       sorted in descending order</li>
 *   <li>For each array:
 *     <ul>
 *       <li>Call the <code>printArray</code> method to print the array
 *           on the console in unsorted order</li>
 *       <li>Call the <code>sort</code> method to put the elements in the
 *           array in ascending order</li>
 *       <li>Call the <code>printArray</code> method again to show that
 *           the array is now in ascending order</li>
 *     </ul>
 *   </li>
 * </ol>
 * 
 * @author Sean Resor
 * @version Module 16, Lab
 */
public class InterfaceLab {

    public static void main(String[] args) {

         // An array of random Doubles
         Double[] firstSet = {2.5, -15.6, 29.8, 14.9, 53.0, -3.7, 0.0} ;
         System.out.print("Unsorted: ") ;
         print(firstSet) ;
         sort(firstSet) ;
         System.out.print("Sorted:   ") ;
         print(firstSet) ;

         // An array of Doubles in reverse (descending) sorted order
         Double[] secondSet = {5.0, 4.0, 3.0, 2.0, 1.0, 0.0} ;
         System.out.println("\nUnsorted:  ") ;
         print(secondSet) ;
         sort(secondSet) ;
         System.out.println("Sorted:    ") ;
         print(secondSet) ;
         
         // An array of random ints to be sorted
         Integer[] thirdSet = {18, -24, 0, 49, 5, -6, 85, -37} ;
         System.out.println("\nUnsorted: ") ;
         print(thirdSet) ;
         sort(thirdSet) ;
         System.out.println("Sorted:   ") ;
         print(thirdSet) ;
         
         // An array of not-so-random Strings to be sorted
         String[] fourthSet = {"I", "can", "hardly", "wait", "for", "the", "break", "to", "get", "here", "after",
                               "I", "finish", "this", "semester"} ;
         System.out.println("\nUnsorted: ") ;
         print(fourthSet) ;
         sort(fourthSet) ;
         System.out.println("Sorted:   ") ;
         print(fourthSet) ;
    }

   /**
    * Sort an array of Comparable elements in place. The use of the Comparable interface
    *   allows us to use the compareTo() method. The parameter T is the types of object
    *   the method can accept, which is any data type (all wrapper classes and the String
    *   class implement Comparable by default) or class that implements the Comparable
    *   interface.
    * @param array the array of variables to be sorted (and returned)
    */
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0 ; i < array.length - 1 ; i++) {
            int smallest = i ;
            for (int j = i + 1 ; j < array.length ; j++) {
                if (array[smallest].compareTo(array[j]) > 0) {
                    smallest = j ;
                }
            }
            T temp = array[i] ;
            array[i] = array[smallest] ;
            array[smallest] = temp ;
        }
    }

   /**
    * Print an array of Object variables on a single line in their order of
    *   appearance in the array. We must change the parameter to Object[] because
    *   we want the method to be able to print the details of arrays of any Object
    *   type.
    * @param array the array of elements to print
    */
    public static void print(Object[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ") ;
        }
        System.out.println() ;
    }
}
