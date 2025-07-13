//a new class Teacher is created 

public class Teacher{
    //assigning attributes of class Teacher
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    //Assigning the constructor with the parameters
    public Teacher( int teacherId,String teacherName,String address,
    String workingType,String employmentStatus)
    {
        this.teacherName=teacherName;
        this.teacherId=teacherId;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
    }
    //accessor method meaning getter method for each attribute
    public String getTeacherName(){
        return this.teacherName;
    }

    public int getTeacherId(){
        return this.teacherId;
    }

    public String getAddress(){
        return this.address;
    }

    public String getWorkingType(){
        return this.workingType;
    }

    public String getEmploymentStatus(){
        return this.employmentStatus;
    }

    public int getWorkingHours(){
        return this.workingHours;
    }
    //setting working_hours meaning using mutator method or setter method
    public void setWorkingHours( int workingHours){
        this.workingHours=workingHours;
    }
    //using display method to output values
    public void display()
    {
        System.out.println("TeacherID is "+ getTeacherId() +".");
        System.out.println("Name of the teacher is "+ getTeacherName()+".");
        System.out.println("Address of the teacher is  "+ getAddress()+".");
        System.out.println("Workingtype of the teacher is "+ getWorkingType()+".");
        System.out.println("Employment status  of the teacher is "+ getEmploymentStatus()+ ".");
        if(workingHours>0){
            System.out.println("Working hours of the teacher  is  "+ getWorkingHours() + ".");
        }
        else
        {
            System.out.println("Working hours  of the teacher is not assigned.");
        }

    }

}
