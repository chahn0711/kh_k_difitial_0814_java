package 텍스트파일읽기;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class ScoreMain {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기/학생성적표");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3])));
        }
        for(Student e : treeSet) {
            System.out.println(e.name + " : " + e.getTotal());}
    }
}