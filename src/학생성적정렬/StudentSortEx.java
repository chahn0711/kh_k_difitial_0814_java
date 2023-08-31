package 학생성적정렬;
import java.util.TreeSet;

// 미리 입력 받아놓고 시작
// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름순 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("장원영", 77));
        info.add(new StudentInfo("이서", 88));
        info.add(new StudentInfo("레이", 45));
        info.add(new StudentInfo("가을", 79));
        for(StudentInfo e : info) {
            System.out.print(e.name + " ");
        }
    }
}
class StudentInfo implements Comparable<StudentInfo> {
    String name;
    int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if (this.score < o.score) return 1; // 내림차순 정렬
        else {
            return this.name.compareTo(o.name); // 사전순 정렬
        }
    }
}