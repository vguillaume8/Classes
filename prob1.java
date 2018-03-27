import java.util.Arrays;

public class prob1 {

    static int[] array1 = {7,2,3,1};
    
    public static void main(String[] args){
        int sum = 8;
        boolean found = false;
        for(int i =0; found == false; i++){
            int diff = sum - array1[i];
            //System.out.println(diff);
                for(int j = 0; j< array1.length; j++){

                    if(array1[j] == diff){
                        int temp = array1[i];
                        int temp2 = array1[j];
                         found = true;
                    System.out.println("There is a sum, the pairs are: " + temp + " and: " + temp2 );
                   
                    

                    }
                     else {
                        System.out.println("Sorry, there aren't any pairs");
                        found = true;
                    }
                }
        

        }
    }

}