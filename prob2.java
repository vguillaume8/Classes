public class prob2 {

    static String letters = "DBCC";
    static String[] array = letters.split("");

    public static void main(String[] args)  {
        //System.out.println(array[3]);
        boolean found = false;
        for(int i = 0; found == false; i++) {
            String temp = array[i];

            for(int j=++i; j<array.length; j++) {
                if(array[j] == temp) {
                    found = true;
                    System.out.println("The letter: " + temp + " repeats");
                }
            }
        }
    }
}