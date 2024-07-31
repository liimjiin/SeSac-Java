package java_0730.com.example.model;

// 데이터 전송을 위한 객체를 단순 저장, DB에서 읽어온 데이터를 저장, 화면에서 입력받은 데이터를 저장
public class PatientVO {
    private int number;    // 환자번호
    private String code;    // 진료코드
    private int days;        // 입원일수
    private int age;         // 나이
    private String dept;   // 진찰부서
    private int operFee;  // 진찰비
    private int hospitalFee;   // 입원비
    private int money;   // 진료비

    public PatientVO() {
    }

    public PatientVO(int number, String code, int days, int age) {
        this.number = number;
        this.code = code;
        this.days = days;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%3d\t  %10s\t\t%,5d\t\t%,10d\t%,10d",
                number, dept, operFee, hospitalFee, money);
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getOperFee() {
        return operFee;
    }

    public void setOperFee(int operFee) {
        this.operFee = operFee;
    }

    public int getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(int hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public int getDays() {
        return days;
    }

    public int getAge() {
        return age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setAge(int age) {
        this.age = age;
    }
}