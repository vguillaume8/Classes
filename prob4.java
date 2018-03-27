public class prob4 {

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] array) {
        if( array.length < 2) {
            throw new IllegalArgumentException("You need at least 2 integers in array");
        }

        int[] productsOfAllIntsExceptAtIndex = new int[array.length];
        int productSoFar = 1;
        for (int i = 0; i < array.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar = productSoFar * array[i];
        }
        productSoFar = 1;
        for (int i = array.length; i < array.length; i-- ) {
            productsOfAllIntsExceptAtIndex[i] = productsOfAllIntsExceptAtIndex[i] * productSoFar;
            productSoFar = productSoFar * array[i];
        }
        printArray(productsOfAllIntsExceptAtIndex);
        return  productsOfAllIntsExceptAtIndex;
        
         
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
    }
        
        
        
     
 

    public static void main(String[] args) {
        int[] array1 = {2,4,6,3};
        getProductsOfAllIntsExceptAtIndex(array1);
        System.out.println();


    }
}