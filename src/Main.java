import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {3.43, 32.2, 5.3, 34.21, 4.3, 2.3, -8.5, -3.23, 3.5, 9.3, 8.8, 8.0, 6.3, 7.32,};

        double num = 0;
        int sum = 0;
        boolean check = false;




        //дз на сообразительность
        while (!check){
            check = true;
            for (int i = 0; i < fractionalNums.length-1; i++) {
                if (fractionalNums[i]> fractionalNums[i+1]){
                    check = false;

                    num = fractionalNums[i];
                    fractionalNums[i] = fractionalNums[i+1];
                    fractionalNums[i+1] = num;

                }
            }
        }

        System.out.println(Arrays.toString(fractionalNums));
        for (double numbers:fractionalNums) {
          //основное дз
          if (numbers<0){
              check = true;

          }
          else if (numbers>0 && check) {




          }

          if (numbers>0){
              num = num + numbers;
              sum++;

          }



        }

        System.out.println(num/fractionalNums.length);


        }
    }




















