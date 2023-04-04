
package map_collections.mapsCollection;

public class Student {
    private int studentId;
    private int subject1score;
    private int subject2score;
    private int subject3score;
    private String studentName;
    
    public static String collegeName = "Vasavi";

    Student(int studentId, int subject1score, int subject2score, int subject3score, String studentName) {
        this.studentId = studentId;
        this.subject1score = subject1score;
        this.subject2score = subject2score;
        this.subject3score = subject3score;
        this.studentName = studentName;
    }
    
    public Student() {
        super();
    }
    public int getSubject1score() {
        return subject1score;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public static String getCollegeName() {
        return collegeName;
    }
    public void setSubject1score(int subject1score) {
        this.subject1score = subject1score;
    }
    public int getSubject2score() {
        return subject2score;
    }
    public void setSubject2score(int subject2score) {
        this.subject2score = subject2score;
    }
    public int getSubject3score() {
        return subject3score;
    }
    public void setSubject3score(int subject3score) {
        this.subject3score = subject3score;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    int calPercentage() {
        return (subject1score + subject2score + subject3score) / 3;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", subject1score=" + subject1score + ", subject2score="
                + subject2score + ", subject3score=" + subject3score + ", studentName=" + studentName
                + ", calPercentage()=" + calPercentage() + "]";
    }

    
   }