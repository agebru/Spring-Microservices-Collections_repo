package com.jdbc.core;

import java.util.Arrays;

public class ProcessPaymentApp {
    public static void main(String[] args) {
       // System.out.println("Paying in Credit card! ");
        IPaymentStrategy cc=new CreditCardPayment(137888,"WellsFargo");

        double pay = cc.pay();
        System.out.println(pay);

        System.out.println();

        processPayment(new CashPayment(5,"USD",20));
        System.out.println();
        processPayment(cc);


        int[] array=new int[]{2, 3, 7, 4};
        System.out.println("Array: "+Arrays.toString(array));
        // [0,2]
        int[] sumIndices = sumedToTargetIndices(array, 9);
        System.out.println("The Indices of the Array summed to 9: "+Arrays.toString(sumIndices));


    }


    public static void processPayment(IPaymentStrategy strategy){
        System.out.println(strategy.getClass().getSimpleName());
        System.out.println(strategy.pay());
    }



    public static int[] sumedToTargetIndices(int[] arr,int target){

        int outer_loop_counter=0;
        int inner_loop_counter=0;

        int [] summedTarget=new int[2];
        int [] summedNumbers=new int[2];
       for(int i=0;i<arr.length;i++){
           outer_loop_counter++;
          for(int j=i+1;j<arr.length;j++){
              inner_loop_counter++;
              if(arr[i]+arr[j]==target){
                  summedTarget[0]=i;
                  summedTarget[1]=j;

                  summedNumbers[0]=arr[i];
                  summedNumbers[1]=arr[j];

              }
          }
       }

        System.out.println("The SummedElements of the Array are:"+Arrays.toString(summedNumbers));
        System.out.println("Outer Loop Count:"+outer_loop_counter);
        System.out.println("Inner Loop Count:"+inner_loop_counter);


        return summedTarget;
    }
}
