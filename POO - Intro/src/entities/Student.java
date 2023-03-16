package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        double f = this.grade1 + this.grade2 + this.grade3;
        return f;
    }
    public double missingPoints(){
        if(finalGrade() < 60.00){
            return 60.0 - finalGrade();
        }
        else{
           return 0.0;
        }

    }

}
