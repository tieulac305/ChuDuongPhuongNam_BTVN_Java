package common;

public class Class{
    private String code;
    private String name;
    private String opDay;
    private int num;
    private Student [] students;
    private String teacher;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpDay() {
        return opDay;
    }

    public void setOpDay(String opDay) {
        this.opDay = opDay;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void Print() {
        System.out.println("Ma lop hoc: "+this.code);
        System.out.println("Ten lop hoc: "+this.name);
        System.out.println("Ngay mo: "+this.opDay);
        System.out.println("So luong sinh vien: "+this.num);
        System.out.println("Thong tin sinh vien: ");
        for(Student sts : this.students){
            sts.Xuat();
        }
        System.out.println("Giao vien: "+this.teacher);
    }
}