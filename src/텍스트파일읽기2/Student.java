package 텍스트파일읽기2;

public class Student implements Comparable<Student> {
private String name;
private  int total;

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
