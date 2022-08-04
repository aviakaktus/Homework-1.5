public class Main {
    public static void main(String[] args) {
//Домашка 1.5 Массивы
        //Задача 1
        int arr1[] = new int [3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2]=3;

        double arr2[] = {1.57, 7.654, 9.986};

        char xyz [] = new char [3];
        xyz [0] = 'x';
        xyz [1] = 'y';
        xyz [2] = 'z';

        //Задача 2
        for (int i=0; i< arr1.length; i++){
            if (i< (arr1.length-1)){
                System.out.print (arr1[i]+", ");
            } else {
                System.out.println (arr1[i]+" ");}
        }

        for (int i=0; i< arr2.length; i++){
            if (i< (arr2.length-1)){
                System.out.print (arr2[i]+", ");
            } else {
                System.out.println (arr2[i]+" ");}
        }

        for (int i=0; i< xyz.length; i++){
            if (i< (xyz.length-1)){
                System.out.print (xyz[i]+", ");
            } else {
                System.out.println (xyz[i]+" ");}
        }
        System.out.println (" ");
        // Задача 3
        for (int i=arr1.length-1; i>=0; i--){
            if (i>0){
                System.out.print (arr1[i]+", ");
            } else {
                System.out.println (arr1[i]+" ");}
        }

        for (int i=arr2.length-1; i>=0; i--){
            if (i>0){
                System.out.print (arr2[i]+", ");
            } else {
                System.out.println (arr2[i]+" ");}
        }

        for (int i=xyz.length-1; i>=0; i--){
            if (i>0){
                System.out.print (xyz[i]+", ");
            } else {
                System.out.println (xyz[i]+" ");}
        }
        System.out.println (" ");

        //Задача 4
        for (int i=0; i< arr1.length; i++){
            if (i< (arr1.length-1)){
                if (arr1[i]%2==1){
                    System.out.print ((arr1[i]+1)+", ");
                }else{
                    System.out.print (arr1[i]+", "); }
            } else {
                if (arr1[i]%2==1){
                    System.out.print ((arr1[i]+1)+" ");
                }else{
                    System.out.println (arr1[i]+" ");}
            }
        }
    }
}