import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    
    int k = scanner.nextInt();


    ArrayList<Integer> list = new ArrayList<>();
    

    for(int num = 0; num < k; num++){
      list.add(scanner.nextInt());
    }

    Collections.sort(list);

    for(int value : list){
      sb.append(value).append('\n');
    }

    System.out.println(sb);
    
    scanner.close();
  }
}