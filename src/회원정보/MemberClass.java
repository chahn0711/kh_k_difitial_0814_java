package 회원정보;

public class MemberClass {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo(); // 참조변수
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();
    }
}
