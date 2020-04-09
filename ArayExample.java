import java.util.Random;
import java.util.Scanner;

public class ArayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang");
        for (int i = 0; i< 100; i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArayExample arayExample = new ArayExample();
        Integer[] arr = arayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui long nhap chi so cua mot so phan tu bat ky: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co chi so 5" + x + "la " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang");
        }
    }
}
