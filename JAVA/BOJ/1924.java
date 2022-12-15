import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] mondays = {31,28,31,30,31,30,31,31,30,31,30,31};
    String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    Scanner scanner = new Scanner(System.in);

    int month = scanner.nextInt();
    int day = scanner.nextInt();

    int daysum = 0;
    
    for (int k = 0; k < month - 1 ; k++){
      daysum += mondays[k];
    }

    daysum += day;

    String weekday = (week[daysum % 7]);
    
    System.out.println(weekday);
    
  }
}