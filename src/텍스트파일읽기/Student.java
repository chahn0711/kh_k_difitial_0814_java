package 텍스트파일읽기;

public class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int mat;
    public int getTotal() {
        return kor + eng + mat;    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;}

    @Override
    public int compareTo(Student o) {
        if (this.getTotal() < o.getTotal()) return 1;
        else return -1;
    }
    }