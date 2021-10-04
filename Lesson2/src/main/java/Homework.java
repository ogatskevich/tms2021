import static java.lang.Integer.MAX_VALUE;

public class Homework {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum(MAX_VALUE, MAX_VALUE));
        System.out.println(maximal(249, 60));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{-1, -2, -3, -4, -40, -100, -99}));
        System.out.println(calculateHypotenuse(3,4));
        }


    public static int sum (int a, int b) {

            if ((long)a+b > Integer.MAX_VALUE ||(long)a+b < Integer.MIN_VALUE){
                return (-1);
            }
        return (a+b);

    }
    public static int maximal(int a, int b) {
       // if(a>b){
          //  return (a);
         // }
        // return (b);
               return Math.max(a, b);

    }
    public static double average(int[] array) {
        double sum =0;
        for (int i : array) {
            sum = sum + i;
        }
        //System.out.println(sum);
            return (sum/array.length);
    }
    public static int max(int[] array) {
      int s = array[0];
        for (int i: array){
            if ( i > s){
              s = i;
           }
        }

        return s;
    }
       public static double calculateHypotenuse(int a, int b) {
           return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
         //return  Math.hypot (a,b);
       }

    }
