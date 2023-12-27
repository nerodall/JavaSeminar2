

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
    ArrayMethods arrayMethods = new ArrayMethods(array);

        System.out.println("Количество четных элементов - "+ arrayMethods.countEven());
        System.out.println("Разница между самым большим и маленьким числами массива - "+ arrayMethods.minMaxDiff());
        System.out.println("Встречается два соседних эелемента с нулевыми значениями - "+ arrayMethods.nullElements());

    }
}
