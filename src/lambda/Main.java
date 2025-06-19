package lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Double> doubleArray = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<String> stringList = Arrays.asList("Hello", "World", "It's", "Me", "Mario");
        List<String> mixedList = Arrays.asList("", "", "it's", "me", "Mario", "");
        int factorialNumber = 5;

        System.out.println("1. Непарні числа: " + FilterOddNumbers.filterOddNumbers(intArray));

        System.out.println("2. Середнє значення: " + AvgValue.AvgValue(doubleArray));

        System.out.println("3. Відсортовані рядки в алфавітному порядку: " + SortString.sortString(stringList));

        System.out.println("4.Сума всіх парних чисел: " + SumOfAllEvenNumbers.sumOfAllEvenNumbers(intArray));

        System.out.println("5. Факторіал " + factorialNumber + ": " + Factorial.factorial(factorialNumber));

        System.out.println("6. Множення та сума всіх елементів: " + Arrays.toString(MultiplyAndSum.multiplyAndSum(intArray)));

        System.out.println("7. Квадрат кожного числа: " + SquareOfNumber.square(intArray));

        System.out.println("8. Відсортовані рядки за довжиною: " + SortStringsByLength.sortStringByLength(stringList));

        System.out.println("9. К-сть слів: " + CountWords.countWords("Hello World! It's me, Mario."));

        System.out.println("10. Перший непорожній рядок в списку: " + NonEmptyString.nonEmptyString(mixedList));

        System.out.println("11. Перевірка, чи всі слова починаються з великої: " + CheckCapitalized.CheckCapitalized(stringList));

        System.out.println("12. Друге найбільше число: " + SecondLargerNumber.secondLarger(intArray));

        System.out.println("13. Найбільше парне число: " + LargestEvenNumber.largestEvenNumber(intArray));
    }
}