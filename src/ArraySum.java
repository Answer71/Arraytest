public class ArraySum {
    public static void main(String[] args) {
        int[] tab1 = {6, 9, 12};
        int[] tab2 = {5, 10, 15};
        ArraysUtils utils = new ArraysUtils();

        int sum = utils.sumArrays(tab1, tab2);

        System.out.println("Suma liczb w tablicach wynosi: " + sum);
    }
}
