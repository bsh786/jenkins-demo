import java.util.List;

public class Main {

    public static void main(String[] args) {

       System.out.println("Hello world");

      if(getResult(getListOne(), getListTwo())) {
          System.out.println("Matching words: ");
          getListOne().stream()
                  .filter(word -> getListTwo().contains(word))
                  .forEach(System.out::println);
      }

       
    }

    private static List<String> getListOne() {
        return List.of("Cookie", "Blue","Sugar", "Bread");
    }

    private static List<String> getListTwo() {
        return List.of("Brown", "White" ,"Blue");
    }

    private static List<Integer> getNumberListOne() {
        return List.of(17, 21, 95);
    }

    private static List<Integer> getNumberListTwo() {
        return List.of(91, 43, 22);
    }

    private static Boolean getResult(List<String> listOne,
                List<String> listTwo) {
         return listOne.stream()
                 .anyMatch(listTwo::contains);
    }
}
