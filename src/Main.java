import java.util.Scanner;

class Array<T> {
    T[] array;
    int size;

    Array(int size){
        this.size = size;
        array = (T[])new Object[size];
    }

    public void set(int i, T value){
        array[i] = value;
    }

    public T get(int i){
        T value = array[i];
        return value;
    }

    public Integer getSize() {
        return size;
    }
}

public class Main {
    static void arrayCrIter(Array<Integer> a) {
        int min = -20;
        int max = 20;
        for (int i = 0; i < a.getSize(); i++) {
            a.set(i, (int) (Math.random() * (max - min)) + min);
        }
    }

    static void printIter(Array<Integer> a) {
        for (int i = 0; i < a.getSize(); i++) {
            System.out.printf("%d  ", a.get(i));
        }
        System.out.println();
    }

    static void taskIter(Array<Integer> a){
        int temp = 0;
        for (int i = 0; i < a.getSize(); i++) {
            for (int j = 1; j < a.getSize() - i; j++) {
                if(a.get(j - 1) < a.get(j)){
                    temp = a.get(j - 1);
                    a.set(j - 1, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість елементів: "); int size = scan.nextInt();

        Array<Integer> arr = new Array<>(size);
        arrayCrIter(arr);
        printIter(arr);
        taskIter(arr);
        printIter(arr);
    }
}