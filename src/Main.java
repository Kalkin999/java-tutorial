
public class Main {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 5, 9, 3, 7};
        int[] number2 = {5, 9, 8, 0, 4, 7};
        public static int binarySearch ( int number1 [], int[] number2){

            int firstIndex = 0;
            int lastIndex = arr.length - 1;

            // условие прекращения (элемент не представлен)
            while (firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;
                // если средний элемент - целевой элемент, вернуть его индекс
                if (arr[middleIndex] == elementToSearch) {
                    return middleIndex;
                }

                // если средний элемент меньше
                // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
                else if (arr[middleIndex] < elementToSearch)
                    firstIndex = middleIndex + 1;

                    // если средний элемент больше
                    // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
                else if (arr[middleIndex] > elementToSearch)
                    lastIndex = middleIndex - 1;

            }
            return -1;
        }
    }
}
