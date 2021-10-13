public class Main {
    public static void main(String[] args) {
        System.out.println("");System.out.println("Первая задача");
        repeat("mice", 5);
        System.out.println("");System.out.println("");System.out.println("Вторая задача");
        differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21});
        System.out.println("");System.out.println("Третья задача");
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println("");System.out.println("Четвертая задача");
        cumulativeSum(new int[]{1, 2, 3});
        System.out.println("");System.out.println("Пятая задача");
        System.out.println(getDecimalPlaces("430.200055"));
        System.out.println("");System.out.println("Шестая задача");
        System.out.println(Fibonacci(7));
        System.out.println("");System.out.println("Седьмая задача");
        System.out.println(isValid("55534"));
        System.out.println("");System.out.println("Восьмая задача");
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println("");System.out.println("Девятая задача");
        System.out.print(isPrefix("automation", "auto-")+" ");
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println("");System.out.println("Десятая задача");
        System.out.println(boxSeq(13));
    }
    //1 задача Создайте функцию, которая повторяет каждый символ в строке n раз.
    public static void repeat(String line, int num) {
        for (int i = 0; i < line.length(); i++) {
            char str = line.charAt(i);
            for (int j = 0; j < num; j++) {
                System.out.print(str);
            }
        }
    }
    // 2 задача Создайте функцию, которая принимает массив и
    //возвращает разницу между самыми большими и самыми маленькими числами.
    public static void differenceMaxMin(int[] dMaxMin){
        int Min=dMaxMin[0];
        int Max=dMaxMin[0];
        for(int i=0;i<dMaxMin.length;i++){
            if (Min>dMaxMin[i])Min=dMaxMin[i];
            if (Max<dMaxMin[i])Max=dMaxMin[i];
        }
        System.out.println(Max-Min);
    }
    //3 задача Создайте функцию, которая принимает массив в качестве аргумента и возвращает true или false
    //в зависимости от того, является ли среднее значение всех элементов массива целым числом или нет.
    public static boolean isAvgWhole(int[] iAW) {
        int Sum = 0;
        for (int i = 0; i < iAW.length; i++) Sum = Sum + iAW[i];
        return (Sum % iAW.length) == 0;
    }
    //4 задача Создайте метод, который берет массив целых чисел и возвращает массив,
    //в котором каждое целое число является суммой самого себя + всех предыдущих чисел в массиве.
    public static int[] cumulativeSum(int[] cumSum) {
        int A[] = new int[cumSum.length];
        A[0] = cumSum[0];
        for (int i = 1; i < cumSum.length; i++) A[i] = cumSum[i] + A[i - 1];
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        return A;
    }
    //5 задача Создайте функцию, которая возвращает число десятичных знаков, которое имеет число (заданное в виде строки).
    //Любые нули после десятичной точки отсчитываются в сторону количества десятичных знаков.
    public static int getDecimalPlaces(String line) {
        String[] separation = String.valueOf(line).split("\\.");   //separation - разделение
        int i = separation[1].length();
        return i;
    }
    //6 Создайте функцию, которая при заданном числе возвращает соответствующее число Фибоначчи
    public static int Fibonacci(int fibon) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        for (int i = 2; i <= fibon; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }
    //7 задача Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку, напишите функцию, чтобы определить,
    //является ли вход действительным почтовым индексом. Действительный почтовый индекс выглядит следующим образом:
    public static boolean isValid(String line) {
        return (line.chars().allMatch(Character::isDigit) && line.length() == 5);
    }
    //8 задача Пара строк образует странную пару, если оба из следующих условий истинны:
    //– Первая буква 1-й строки = последняя буква 2-й строки.
    //– Последняя буква 1-й строки = первая буква 2-й строки
    //– Создайте функцию, которая возвращает true
    //если пара строк представляет собой странную пару, и false в противном случае.
    public static boolean isStrangePair(String line1, String line2) {
        char[] strArr1 = line1.toCharArray();
        char[] strArr2 = line2.toCharArray();
        return strArr1[0]==strArr2[strArr2.length-1]&&strArr2[0]==strArr1[strArr1.length-1];
    }
    // 9 задача префикс
    public static boolean isPrefix(String line,String prefix){
        char[] strArr1 = line.toCharArray();
        char[] strArr2 = prefix.toCharArray();
        int i=0;
        while (strArr2[i] != '-') {
            if(strArr2[i]==strArr1[i]){
                i++;
            }
            else break;
        }
        return i==strArr2.length-1;
    }
    //9 задача суффикс
    public static boolean isSuffix(String line,String suffix){
        char[] strArr1 = line.toCharArray();
        char[] strArr2 = suffix.toCharArray();
        int i=strArr1.length-1;
        int ii=strArr2.length-1;
        while (strArr2[ii] != ' ') {
            if(strArr2[ii]==strArr1[i]){
                i--;
                ii--;
            }
            else break;
        }
        return ii==0;
    }
    //10 задача
    public static int boxSeq(int num){
        if (num%2==0){}
        else num=num+2;
        return num;
    }

}