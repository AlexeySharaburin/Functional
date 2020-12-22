import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //нет использования состояний
        final String yourWords;
        final String stringAborigens = "sdfaljhds ksjdfhlksjd jsdhflasdj sdvjbalsc vb,nxzcmvb sdjfuw saytqwi uqwrywieu zxnbv, vajscb vbz,n nbxv ,z asbva, uiwerteuwfg avlsv aljgl VBXZL bv,ZD JDSGlw";

        System.out.println("В качестве дополнения к тексу абригенов введите своё высказывание:");
        yourWords = scanner.nextLine();

        // детерминированность
        Function<String, String[]> splitWords = string -> string.split("\\s");

        // детерминированность
        Function<String[], String[]> sort = new Function<String[], String[]>() {
            @Override
            public String[] apply(String[] strings) {
                Arrays.sort(strings);
                return strings;
            }
        };

        System.out.println("\nВаш новый словарь для общения с аборигенами:");

        // Монада
        Arrays.stream(sort.apply(sort.apply(splitWords.apply(stringAborigens + yourWords))))
                .map(w -> w + " - значение этого слова пока неизвестно!")
                .forEach(System.out::println);

    }
}
