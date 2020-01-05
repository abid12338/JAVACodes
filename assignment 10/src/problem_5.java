class GradedActivity {
protected double score;
public void setScore(double s) {
score = s;
}

public double getScore() {
return score;
}



public char getGrade() {
char letterGrade; 

if (score >= 90)
letterGrade = 'A';
else if (score >= 80)
letterGrade = 'B';
else if (score >= 70)
letterGrade = 'C';
else if (score >= 60)
letterGrade = 'D';
else
letterGrade = 'F';

return letterGrade;
}
}

class PassFailExam extends GradedActivity {
  
}

class Essay extends GradedActivity {
  
}

class FinalExam extends GradedActivity {
  
}

class CourseGrades{
public GradedActivity[] grades;
  
public CourseGrades() {
this.grades = new GradedActivity[4];
}
public void setLab(GradedActivity obj){
grades[0] = obj;
}
public void setPassFailExam(PassFailExam obj){
grades[1] = obj;
}
public void setEssay(Essay obj){
grades[2] = obj;
}
public void setFinalExam(FinalExam obj){
grades[3] = obj;
}
  
public String toString(){
String str = "Lab Score: \t\t"            + grades[0].getScore()
           + "\t Grade: " + grades[0].getGrade()
           + "\nPass/Fail Exam Score: \t"    + grades[1].getScore()
           + "\t Grade: " + grades[1].getGrade()
                                          
           + "\nEssay Score: \t\t"        + grades[2].getScore()
           + "\t Grade: " + grades[2].getGrade()
                                          
           + "\nFinal Exam Score: \t"        + grades[3].getScore()
           + "\t Grade: " + grades[3].getGrade();
       return str;
}
}
public class problem_5{
public static void main(String[] args) {
CourseGrades obj = new CourseGrades();
GradedActivity lobj = new GradedActivity();
lobj.setScore(95);
PassFailExam pobj = new PassFailExam();
pobj.setScore(70);
Essay eobj = new Essay();
eobj.setScore(60);
FinalExam fobj = new FinalExam();
fobj.setScore(80);

obj.setLab(lobj);
obj.setPassFailExam(pobj);
obj.setEssay(eobj);
obj.setFinalExam(fobj);

System.out.println(obj);
}
  
}

