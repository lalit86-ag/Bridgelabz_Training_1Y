package com.gla.level3;
public class Height {
    public static int sum(int[] arr){
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        return sum;

    }
    public static int mean(int[] arr){
        int s=sum(arr);
        int num=arr.length;

        int mean=s/num;
        return mean;
    }
    public static int shorts(int[] arr){
        int min=arr[0];
        for(int number:arr){
            if(number<min){
                min=number;
            }
        }
        return min;
    }
    public static int largre(int[] arr){
        int max=arr[0];
        for(int number:arr){
            if(number>max){
                max=number;
            }
        }
        return max;
    }

    static void main(String[] args) {
        int arr[]={151,170,168,194,177,157,189,169,163,155,155};
        System.out.println("Sum of all elements : "+sum(arr));
        System.out.println("Mean height : "+mean(arr));
        System.out.println("Shortest height : "+shorts(arr));
        System.out.println("Largest height : "+largre(arr));
    }
}
