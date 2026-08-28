import java.util.HashMap;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        boolean[] visited=new boolean[5];
        int a[]={23,21,45,45,34};
    for(int i=0;i<a.length;i++)
    {
    if (visited[i])
        continue;

    int count = 1;

    for (int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) {
            count++;
            visited[j] = true;
        }
    }

    System.out.println(a[i] + " -> " + count);
}
}
}
