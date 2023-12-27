public class ArrayMethods {
    int [] array;

    public ArrayMethods(int[] array) {
        this.array = array;
    }

    /**
     * Метод для подсчета количество четных элементов в массиве
     * @return количество четных элементов
     */
    public int countEven (){
        int count = 0;
        for (int i =0; i < array.length ; i++){
            if (array[i] % 2 == 0){
                count +=1;
              }
        }
        return count;
    }

    /**
     * Метод для вычисления разницы между наименьшим и максимальным числами массива
     * @return разница чисел
     */
    public int minMaxDiff(){
        int maxNum =array[0];
        int minNum=array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum){
                minNum = array[i];
            }
            if (array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum -minNum;
    }

    /**
     * Определяет есть ли в массиве 2 соседних элемента с нулевыми значениями
     * @return boolean
     */
    public boolean nullElements (){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == 0 && array[i+1] == 0){
                return true;
            }
        }
        return false;
    }
}
