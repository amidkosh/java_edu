package list_duplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        givenListContainsDuplicates_whenRemovingDuplicatesWithJava8_thenCorrect();
    }

    private static void
    givenListContainsDuplicates_whenRemovingDuplicatesWithJava8_thenCorrect() {
        List<Integer> listWithDuplicates = Arrays.asList(1, 1, 2, 2, 3, 3);
        List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    }
}
