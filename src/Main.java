public class Main {
    public static void main(String[] args) {
        int[] number1 =  {1,2,5,9};
        int[] number2 = {5,9,8,0};
        for (int a : number1) {
            for (int i : number2) {
                if (a == i) {
                    System.out.println(a);
                    break;
                }
            }
        }
    }
}