import java.util.ArrayList;


public class Grades {
    protected String subject;
    protected Integer grade;

    public Grades(String subject, Integer grade) {
        this.subject = subject;
        this.grade = grade;
    }


    public ArrayList<Grades> grades = new ArrayList<Grades>();

    public void addSubject(String subject) {

        String s = subject;
        Integer a = 0;
        Grades grade = new Grades(s, a);

        grades.add(grade);
    }

    public void dropSubject(String subject) {
        String s = subject;
        for(Grades grade : grades){
            if(grade.getSubject().equals(s)){
                grades.remove(s);
            }
        }
    }
    public String getSubject(){
        return subject;
    }
    public Integer getGrade(){
        return grade;
    }
    public void getGrades(){
        for(Grades grade : grades){
            String asd= grade.getSubject()+" "+getGrade();
            System.out.println(asd);
        }
    }
}
class Exam extends Grades{

    public Exam(String subject, Integer grade) {
        super(subject, grade);
    }
    public void registGradeToSubject(String subject, Integer grade){
        for(Grades gradee : grades){
            int i=0;
            i++;
            if(gradee.getSubject().equals(subject)){
                int x = grade;
                Exam exam = new Exam(subject,x);
                grades.set(i,exam);

            }
        }
    }
}

