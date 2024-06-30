import java.util.Random;

public class Dodosuko {
  public static void main(String[] args) {
    Random random = new Random();
    String[] options = {"ドド", "スコ"};
    String pattern = "ドドスコスコスコドドスコスコスコドドスコスコスコ";
    StringBuilder sequence = new StringBuilder();

    while (true) {
      String result = options[random.nextInt(options.length)];
      sequence.append(result);
      System.out.print(result);
      if (sequence.toString().equals(pattern)) {
        System.out.print("ラブ注入♡");
        break;
      } else if (!pattern.startsWith(sequence.toString())) {
        System.out.println();
        sequence.setLength(0);
      }
    }
  }
}
