// a class is created
public class Lecturer extends Teacher{
    //assigning the attributes of  class Lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //assigning a construct with 8 parameters along with a setter working_hour parameter
    public Lecturer( int teacherId,String teacherName,String address,
    String workingType,String employmentStatus,String department,int yearsOfExperience, int workingHours)
    {
        /*using super keyword to call a constructor which has parameter meaning
        (userdefined constructor)*/
        super(teacherId,teacherName, address,workingType,employmentStatus);
        // calling the setter method from the superclass Teacher, it is already declared in the constructor
        super.setWorkingHours(workingHours);
        //assigning parameter
        this.department= department;
        this.yearsOfExperience=yearsOfExperience;
        this.gradedScore=0;
        this.hasGraded=false;
    }
    // using accessor method or getter method
    public String getDepartment()
    {
        return this.department;
    }

    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }

    public int getGradedScore()
    {
        return this.gradedScore;
    }

    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    //using mutator method or setter method
    public void setGradedScore(int gradedScore){
        this.gradedScore=gradedScore;

    }
    //creating method named gradeAsignment
    public void gradeAssignment( int gradedScore,String department,
    int yearsOfExperience)
    {
        if(!hasGraded){
            if(yearsOfExperience>=5 && this.department.equals(department))
            {
                if(gradedScore >=70)
                {
                    System.out.println("You have scored Grade A.");
                }
                else if(gradedScore >=60 )
                {
                    System.out.println("You have scored Grade B");
                }
                else if(gradedScore>=50)
                {
                    System.out.println("You have scored Grade C");
                }
                else if(gradedScore>=40)
                {
                    System.out.println("You have scored Grade D");
                }
                else
                {
                    System.out.println("You have scored Grade E");
                }
                this.hasGraded=true;//Now the grade has been set to true
            }
            else
            {
                /*grade is invalid because of unmatched conditions of experience
                and department*/
                System.out.println("Invalid grade.");
            }
        }
        else
        // this if and else is used to avoiding regrading of assignments
        {
            System.out.println("Grade has already been assignment.") ;
        }

    }
    //@overriding method meaning same method name
    public void display(){
        //calling or invoking the  method display() from superclass
        super.display();
        System.out.println("Department is "+ getDepartment());
        System.out.println("YearsOfExperience is "+ getYearsOfExperience());
        if(hasGraded)
        {
            System.out.println("hasGraded is "+ getHasGraded());
        }
        else
        {
            System.out.println("Score is not graded yet.");
        }
    }
}