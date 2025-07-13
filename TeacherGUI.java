//creating a class named TeacherGUI

import java.util.*;// Importing the java.util package
import java.awt.*;// Importing the java.awt package for GUI components
import javax.swing.*; // Importing the javax.swing package for GUI components
import java.awt.event.ActionEvent;// Importing ActionEvent class for event handling
import java.awt.event.ActionListener;// Importing ActionListener class for event handling
import java.awt.Color; // Importing Color class for setting colors
import java.awt.Image;// Importing Image class for handling images
import javax.swing.border.LineBorder; // Importing LineBorder class for setting borders

public class TeacherGUI{
    private ArrayList<Teacher> teacher=new ArrayList<Teacher>();//creating an Arraylist of Teacher objects
    //JFrame creates a GUI window to add other components
    //creates a frame for the GUI
    // Declaring private instance variables for GUI components
    private JFrame frame1,frame2,frame3,frame4;
    //initalize JPanel
    private JPanel welcomemainpnl,setsalarytoppnl,welcomemainpnl2,welcomepnl,lecturertoppnl,lecturermainpnl,tutortoppnl,tutormainpnl,setsalarypnl;
    //initialize JLabel
    private JLabel welcometxt,welcometxt2,welcometxt3,welcometxt4 ,welcome_label,lecturerlabel,welcomelabel,titleimage,id1,name1,address1,workingType1,employmentStatus1,workingHours1,department1,yearsOfExperience1,gradedScore1,
    id2,name2,address2,workingType2,employmentStatus2,workingHours2,salary2,specialization2,academicQualifications2,performanceIndex2,
    id3,newSalary3,newPerformanceIndex3;
    //initialize JTextField
    private JTextField idField1,nameField1,addressField1,workingTypeField1,employmentStatusField1,gradedScoreField1,yearsOfExperienceField1,departmentField1,workingHoursField1,
    idField2,nameField2,addressField2,workingTypeField2,employmentStatusField2,workingHoursField2,salaryField2,specializationField2,academicQualificationsField2,performanceIndexField2,
    idField3,newSalaryField3,newPerformanceIndexField3;
    //initialize JButton
    private JButton tutor_btn1,tutor_btn2,tutor_btn3,homebtn1,homebtn2,homebtn3,homebtn4,lecturer_btn1,lecturer_btn2,lecturer_btn3,switch_to_tutor,switch_to_lecturer,displaybtn,addlecturerbtn,addTutor,gradeAssignments,switch_to_set_salary,set_Salary_Tutor,backbtnsalary,removeTutor,displaybtn1,displaybtn2,clear1,clear2;
    public TeacherGUI(){
        ArrayList<Teacher> teacher=new ArrayList<Teacher>();//creatig arraylist of teacher
        //JFrame instances to create a GUI window to add other components 
        //creates a frame for the GUI
        JFrame frame1,frame2,frame3,frame4;
        //JPanel instances
        JPanel welcomemainpnl,setsalarytoppnl,welcomemainpnl2,welcomepnl,lecturertoppnl,lecturermainpnl,tutortoppnl,tutormainpnl,setsalarypnl;
        //JLabel instances
        JLabel welcometxt,welcometxt2,welcometxt3,welcometxt4 ,welcome_label,lecturerlabel,welcomelabel,titleimage,id1,name1,address1,workingType1,employmentStatus1,workingHours1,department1,yearsOfExperience1,gradedScore1,
        id2,name2,address2,workingType2,employmentStatus2,workingHours2,salary2,specialization2,academicQualifications2,performanceIndex2,
        id3,newSalary3,newPerformanceIndex3;
        //JTextField instances
        JTextField idField1,nameField1,addressField1,workingTypeField1,employmentStatusField1,gradedScoreField1,yearsOfExperienceField1,departmentField1,workingHoursField1,
        idField2,nameField2,addressField2,workingTypeField2,employmentStatusField2,workingHoursField2,salaryField2,specializationField2,academicQualificationsField2,performanceIndexField2,
        idField3,newSalaryField3,newPerformanceIndexField3;
        //JButton instances
        JButton tutor_btn1,tutor_btn2,tutor_btn3,homebtn1,homebtn2,homebtn3,homebtn4,lecturer_btn1,lecturer_btn2,lecturer_btn3,switch_to_tutor,switch_to_lecturer,displaybtn,addlecturerbtn,addTutor,gradeAssignments,switch_to_set_salary,set_Salary_Tutor,backbtnsalary,removeTutor,displaybtn1,displaybtn2,clear1,clear2;

        //welcome frame1
        frame1 =new JFrame();
        frame1.setSize(1600,850);//sets the size of the frame with width and height
        frame1.setTitle("Teacher GUI 23048596 Jeshmin Shrestha");// sets the title of the frame
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the frame
        frame1.setVisible(true);//sets the visiblity of the frame to true
        frame1.setBackground(Color.decode("#6f9aab") );  //set background color with hexadecimal value
        frame1.setLayout(null);//sets the layout
        //welcome top pannel in frame1
        welcomepnl=new JPanel();
        welcomepnl.setBounds(0,0,1550,100);
        welcomepnl.setBackground(Color.decode("#B1D4E0"));
        welcomepnl.setLayout(null);
        frame1.add(welcomepnl);
        //welcome main panel in frame1
        welcomemainpnl=new JPanel();
        welcomemainpnl.setBounds(680,80,800,800);
        welcomemainpnl.setBackground(Color.decode("#B1D4E0"));
        welcomemainpnl.setLayout(null);
        frame1.add(welcomemainpnl);

        //lecturer frame2
        frame2 =new JFrame();
        frame2.setSize(1600,850);//sets the x-dimension and y-dimension of th
        frame2.setTitle("Lecturer GUI 23048596 Jeshmin Shrestha");// sets the title of the frame
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(false);// makes the frame visible
        frame2.setLayout(null);//sets the layout
        //tutor frame3
        frame3 =new JFrame();
        frame3.setSize(1600,850);//sets the x-dimension and y-dimension of th
        frame3.setTitle("Tutor GUI 23048596 Jeshmin Shrestha");// sets the title of the frame
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setBackground( Color.decode("#B1D4E0") );//exit out of the frame
        frame3.setVisible(false);// makes the frame visible
        frame3.setLayout(null);//sets the layout
        //frame4 for setsalary
        frame4 =new JFrame();
        frame4.setSize(1600,850);//sets the x-dimension and y-dimension of th
        frame4.setTitle("Set Salary GUI 23048596 Jeshmin Shrestha");// sets the title of the frame
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setBackground( Color.decode("#B1D4E0") );//exit out of the frame
        frame4.setVisible(false);// makes the frame visible
        frame4.setLayout(null);;

        //lecturer mainpanel
        lecturermainpnl=new JPanel();
        lecturermainpnl.setBounds(620,80,950,800);
        lecturermainpnl.setBackground(Color.decode("#B1D4E0"));
        lecturermainpnl.setLayout(null);
        frame2.add(lecturermainpnl);
        //lecturertop panel
        lecturertoppnl=new JPanel();
        lecturertoppnl.setBounds(0,0,1550,80);
        lecturertoppnl.setBackground(Color.decode("#6f9aab"));
        lecturertoppnl.setLayout(null);
        frame2.add(lecturertoppnl);
        //tutormain panel
        tutormainpnl=new JPanel();
        tutormainpnl.setBounds(600,80,1200,800);
        tutormainpnl.setBackground(Color.decode("#B1D4E0"));
        tutormainpnl.setLayout(null);
        frame3.add(tutormainpnl);
        //tutor top panel
        tutortoppnl=new JPanel();
        tutortoppnl.setBounds(0,0,1550,80);
        tutortoppnl.setBackground(Color.decode("#6f9aab"));
        tutortoppnl.setLayout(null);
        frame3.add(tutortoppnl);
        //setsalary panel
        setsalarypnl=new JPanel();
        setsalarypnl.setBounds(400,135,700,610);
        setsalarypnl.setBackground(Color.decode("#e9e9e5"));
        setsalarypnl.setLayout(null);
        frame4.add(setsalarypnl);

        setsalarytoppnl=new JPanel();
        setsalarytoppnl.setBounds(0,0,1550,80);
        setsalarytoppnl.setBackground(Color.decode("#6f9aab"));
        setsalarytoppnl.setLayout(null);
        frame4.add(setsalarytoppnl);

        // Create ImageIcon objects for each additional image
        // Create ImageIcon objects for each image
        ImageIcon icon1 = new ImageIcon("logo2.png");
        ImageIcon icon2 = new ImageIcon("lecturer12.png");
        ImageIcon icon3 = new ImageIcon("titlepic.png");
        ImageIcon icon4 = new ImageIcon("tutor11.png");
        ImageIcon icon5 = new ImageIcon("icons.png");
        ImageIcon icon6 = new ImageIcon("demo.png");
        ImageIcon icon7 = new ImageIcon("txt.png");

        // Get the original images
        Image img1 = icon1.getImage();
        Image img2 = icon2.getImage();
        Image img3 = icon3.getImage();
        Image img4 = icon4.getImage();
        Image img5 = icon5.getImage();
        Image img6 = icon6.getImage();
        Image img7 = icon7.getImage();

        // Resize the images
        Image scaledImg1 = img1.getScaledInstance(100, 85, Image.SCALE_SMOOTH);//(width,height,imagescalesmoother)
        Image scaledImg2 = img2.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        Image scaledImg3 = img3.getScaledInstance(1550, 700, Image.SCALE_SMOOTH);
        Image scaledImg4 = img4.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        Image scaledImg5 = img5.getScaledInstance(600, 130, Image.SCALE_SMOOTH);
        Image scaledImg6 = img6.getScaledInstance(1550, 800, Image.SCALE_SMOOTH);
        Image scaledImg7 = img7.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        // Create new ImageIcons with the scaled images
        ImageIcon scaledIcon1 = new ImageIcon(scaledImg1);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImg2);
        ImageIcon scaledIcon3 = new ImageIcon(scaledImg3);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImg4);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImg5);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImg6);
        ImageIcon scaledIcon7 = new ImageIcon(scaledImg7);

        // Create JLabel objects for the resized images
        JLabel imageLabel1 = new JLabel(scaledIcon1);
        JLabel imageLabel2 = new JLabel(scaledIcon2);
        JLabel imageLabel3 = new JLabel(scaledIcon3);
        JLabel imageLabel4 = new JLabel(scaledIcon4);
        JLabel imageLabel5 = new JLabel(scaledIcon5);
        JLabel imageLabel6 = new JLabel(scaledIcon6);
        JLabel imageLabel7 = new JLabel(scaledIcon7);

        // Set the bounds for each JLabel
        imageLabel1.setBounds(0, 0, 150, 100); // Adjust the position and size as needed
        imageLabel2.setBounds(0, 80, 900, 750); // Adjust the position and size as needed
        imageLabel3.setBounds(0, 100, 1550, 700);// Adjust the position and size as needed
        imageLabel4.setBounds(0, 80, 1000, 750);// Adjust the position and size as needed
        imageLabel5.setBounds(200, 550, 600, 150);// Adjust the position and size as needed
        imageLabel6.setBounds(0, 80, 1550, 750);// Adjust the position and size as needed
        imageLabel7.setBounds(0, 10, 900, 600);// Adjust the position and size as needed
        // Add the JLabels to frame1
        welcomepnl.add(imageLabel1);
        frame2.add(imageLabel2);
        frame1.add(imageLabel3);
        frame3.add(imageLabel4);
        welcomemainpnl.add(imageLabel5);
        frame4.add(imageLabel6);
        welcomemainpnl.add(imageLabel7);

        //Text and TextField
        //id label for lecturer
        id1=new JLabel("Teacher ID:");
        id1.setBounds(40,120,100,30);
        lecturermainpnl.add(id1);
        //id label for Tutor
        id2=new JLabel("Teacher ID:");
        id2.setBounds(40,120,100,30);
        tutormainpnl.add(id2);

        //idfield for lecturer
        idField1=new JTextField();
        idField1.setBounds(170,120,250,30);
        lecturermainpnl.add(idField1);
        //idfield for Tutor
        idField2=new JTextField();
        idField2.setBounds(170,120,250,30);
        tutormainpnl.add(idField2);

        //name label for lecturer
        name1=new JLabel("Teacher Name:");
        name1.setBounds(40,170,100,30);
        lecturermainpnl.add(name1);
        //name label for Tutor
        name2=new JLabel("Teacher Name:");
        name2.setBounds(40,170,100,30);
        tutormainpnl.add(name2);

        //namefield for lecturer
        nameField1=new JTextField();
        nameField1.setBounds(170,170,250,30);
        lecturermainpnl.add(nameField1);
        //namefield for tutor
        nameField2=new JTextField();
        nameField2.setBounds(170,170,250,30);
        tutormainpnl.add(nameField2);

        //address label for lecturer
        address1=new JLabel("Teacher Address:");
        address1.setBounds(40,220,120,30);
        lecturermainpnl.add(address1);
        //address label for Tutor
        address2=new JLabel("Teacher Address:");
        address2.setBounds(40,220,120,30);
        tutormainpnl.add(address2);

        //addressfield for lecturer
        addressField1=new JTextField();
        addressField1.setBounds(170,220,250,30);
        lecturermainpnl.add(addressField1);
        //addressfield for Tutor
        addressField2=new JTextField();
        addressField2.setBounds(170,220,250,30);
        tutormainpnl.add(addressField2);

        //workingtype label for lecturer
        workingType1=new JLabel("Working Type:");
        workingType1.setBounds(40,270,100,30);
        lecturermainpnl.add(workingType1);
        //workingtype label for Tutor
        workingType2=new JLabel("Working Type:");
        workingType2.setBounds(40,270,100,30);
        tutormainpnl.add(workingType2);

        //workingtypefield for lecturer
        workingTypeField1=new JTextField();
        workingTypeField1.setBounds(170,270,250,30);
        lecturermainpnl.add( workingTypeField1);
        //workingtypefield for Tutor
        workingTypeField2=new JTextField();
        workingTypeField2.setBounds(170,270,250,30);
        tutormainpnl.add( workingTypeField2);

        //employmentstatus label for lecturer  
        employmentStatus1=new JLabel("Employment status:");
        employmentStatus1.setBounds(40,320,200,30);
        lecturermainpnl.add(employmentStatus1);

        //employmentstatus label for Tutor      
        employmentStatus2=new JLabel("Employment status:");
        employmentStatus2.setBounds(40,320,200,30);
        tutormainpnl.add(employmentStatus2);

        //employmentstatusfield for lecturer
        employmentStatusField1=new JTextField();
        employmentStatusField1.setBounds(170,320,250,30);
        lecturermainpnl.add(employmentStatusField1);
        //employmentstatusfield for tutor
        employmentStatusField2=new JTextField();
        employmentStatusField2.setBounds(170,320,250,30);
        tutormainpnl.add(employmentStatusField2);

        //department label for lecturer
        department1=new JLabel("Department:");
        department1.setBounds(500,170,150,30);
        lecturermainpnl.add( department1);
        //employmentstatusfield  for lecturer
        departmentField1=new JTextField();
        departmentField1.setBounds(650,170,250,30);
        lecturermainpnl.add(departmentField1);
        //yearsof experience label for lecturer
        yearsOfExperience1=new JLabel("Years of Experience:");
        yearsOfExperience1.setBounds(500,220,150,30);
        lecturermainpnl.add( yearsOfExperience1);
        //yearsOfExperiencefield for tutor

        yearsOfExperienceField1=new JTextField();
        yearsOfExperienceField1.setBounds(650,220,250,30);
        lecturermainpnl.add(yearsOfExperienceField1);

        //workinghours label for lecturer
        workingHours1=new JLabel("Working hours:");
        workingHours1.setBounds(500,270,100,30);
        lecturermainpnl.add( workingHours1);
        //workinghours label for Tutor
        workingHours2=new JLabel("Working hours:");
        workingHours2.setBounds(500,120,100,30);
        tutormainpnl.add(workingHours2);
        //workinghoursfield for lecturer
        workingHoursField1=new JTextField();
        workingHoursField1.setBounds(650,270,250,30);
        lecturermainpnl.add( workingHoursField1);
        //workinghoursfield for Tutor
        workingHoursField2=new JTextField();
        workingHoursField2.setBounds(670,120,250,30);
        tutormainpnl.add( workingHoursField2);

        //gradedScore for lecturer
        gradedScore1=new JLabel("Graded Score:");
        gradedScore1.setBounds(500,120,100,30);
        lecturermainpnl.add( gradedScore1);

        //gradedScorefield for lecturer
        gradedScoreField1=new JTextField();
        gradedScoreField1.setBounds(650,120,250,30);
        lecturermainpnl.add(gradedScoreField1);

        //salary label for tutor
        salary2=new JLabel("Salary:");
        salary2.setBounds(500,170,100,30);
        tutormainpnl.add( salary2);
        //salaryfield  for tutor
        salaryField2=new JTextField();
        salaryField2.setBounds(670,170,250,30);
        tutormainpnl.add(salaryField2);

        //specialization for Tutor
        specialization2=new JLabel("Specialization:");
        specialization2.setBounds(500,220,100,30);
        tutormainpnl.add( specialization2);

        //specializationfield for tutor
        specializationField2=new JTextField();
        specializationField2.setBounds(670,220,250,30);
        tutormainpnl.add(specializationField2);

        //academicQualifications for Tutor
        academicQualifications2=new JLabel("Academic Qualifications:");
        academicQualifications2.setBounds(500,270,170,30);
        tutormainpnl.add( academicQualifications2);
        //academicQualificationsfield for tutor
        academicQualificationsField2=new JTextField();
        academicQualificationsField2.setBounds(670,270,250,30);
        tutormainpnl.add(academicQualificationsField2);

        //performanceIndex for  tutor
        performanceIndex2=new JLabel("Performance Index:");
        performanceIndex2.setBounds(500,320,150,30);
        tutormainpnl.add( performanceIndex2);

        //performanceIndexfield for tutor
        performanceIndexField2=new JTextField();
        performanceIndexField2.setBounds(670,320,250,30);
        tutormainpnl.add(performanceIndexField2);

        //id label setsalary
        id3=new JLabel("Teacher ID");
        id3.setBounds(100,100,150,30);
        setsalarypnl.add(id3);
        ////id field  setsalary
        idField3=new JTextField();
        idField3.setBounds(400,100,250,30);
        setsalarypnl.add( idField3);
        //newSalary label
        newSalary3=new JLabel("New Salary");
        newSalary3.setBounds(100,150,150,30);
        setsalarypnl.add( newSalary3);

        //newSalary field
        newSalaryField3=new JTextField();
        newSalaryField3.setBounds(400,150,250,30);
        setsalarypnl.add( newSalaryField3);
        //newPerformance index label
        newPerformanceIndex3=new JLabel("Performance Index");
        newPerformanceIndex3.setBounds(100,200,150,30);
        setsalarypnl.add( newPerformanceIndex3);

        ////newPerformance index field
        newPerformanceIndexField3=new JTextField();
        newPerformanceIndexField3.setBounds(400,200,250,30);
        setsalarypnl.add( newPerformanceIndexField3);

        //lecturer button that switches the frame1 and returns to the lecturer frame2
        lecturer_btn1= new JButton("Add Lecturer");
        lecturer_btn1.setBounds(1350,25,120,30);
        welcomepnl.add(lecturer_btn1);
        //lecturer button that switches the frame2 and returns to the lecturer frame2
        lecturer_btn2= new JButton("Add Lecturer");
        lecturer_btn2.setBounds(1250,25,120,30);
        lecturertoppnl.add(lecturer_btn2);
        //lecturer button that switches the frame3 and returns to the lecturer frame2
        lecturer_btn3= new JButton("Add Lecturer");
        lecturer_btn3.setBounds(1250,25,120,30);
        tutortoppnl.add(lecturer_btn3);
        //switch to the lecturer button from frame3
        switch_to_lecturer= new JButton("Switch to Lecturer");
        switch_to_lecturer.setBounds(300,600,350,30);
        tutormainpnl.add(switch_to_lecturer);
        //Add actiionListener to the tutor button
        ActionListener actionListener=new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    try{
                        frame1.setVisible(false);
                        frame2.setVisible(true);
                        frame3.setVisible(false);
                        frame4.setVisible(false);
                    }
                    catch (NullPointerException t) {
                        JOptionPane.showMessageDialog(frame1, "not valid", "error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            };
        lecturer_btn1.addActionListener(actionListener);
        lecturer_btn2.addActionListener(actionListener);
        lecturer_btn3.addActionListener(actionListener);
        switch_to_lecturer.addActionListener(actionListener);

        //tutor button that switches the frame1 and returns to the lecturer frame2
        tutor_btn1= new JButton("Add Tutor");
        tutor_btn1.setBounds(1200,25,100,30);
        welcomepnl.add(tutor_btn1);
        //tutor button that switches the frame2 and returns to the lecturer frame2
        tutor_btn2= new JButton("Add Tutor");
        tutor_btn2.setBounds(1100,25,120,30);
        lecturertoppnl.add(tutor_btn2);
        //tutor button that switches the frame3 and returns to the lecturer frame2
        tutor_btn3= new JButton("Add Tutor");
        tutor_btn3.setBounds(1100,25,120,30);
        tutortoppnl.add(tutor_btn3);
        // switch to the tutor button from frame2
        switch_to_tutor= new JButton("Switch to Tutor");
        switch_to_tutor.setBounds(300,600,350,30);
        lecturermainpnl.add(switch_to_tutor);
        //back to tutorframe3
        backbtnsalary= new JButton("switch to Tutor");
        backbtnsalary.setBounds(200,350,350,30);
        setsalarypnl.add(backbtnsalary);
        ActionListener actionListener2=new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    try{
                        frame1.setVisible(false);
                        frame2.setVisible(false);
                        frame3.setVisible(true);
                        frame4.setVisible(false);
                    }
                    catch (NullPointerException t) {
                        JOptionPane.showMessageDialog(frame1, "not valid", "error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            };
        tutor_btn1.addActionListener(actionListener2);
        tutor_btn2.addActionListener(actionListener2);
        tutor_btn3.addActionListener(actionListener2);
        switch_to_tutor.addActionListener(actionListener2);
        backbtnsalary.addActionListener(actionListener2);

        //setsalary frame
        //set_Salary_Tutor
        switch_to_set_salary= new JButton("Set Salary of Tutor");
        switch_to_set_salary.setBounds(100,650,150,30);
        tutormainpnl.add(switch_to_set_salary);
        switch_to_set_salary.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    try{
                        frame1.setVisible(false);
                        frame2.setVisible(false);
                        frame3.setVisible(false);
                        frame4.setVisible(true);

                    }
                    catch (NullPointerException t) {
                        JOptionPane.showMessageDialog(frame2, "not valid", "error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            });
        //home button that switches the frame2 to home
        homebtn1= new JButton("Home");
        homebtn1.setBounds(1050,25,100,30);
        welcomepnl.add(homebtn1);
        //returns to the homepage /frame1  
        homebtn2= new JButton("Home");
        homebtn2.setBounds(20,20,100,30);
        lecturertoppnl.add(homebtn2);

        //home button that switches the frame3 that to home
        homebtn3= new JButton("Home");
        homebtn3.setBounds(20,20,100,30);
        tutortoppnl.add(homebtn3);
        //homebtn that switches the frame4 to home
        homebtn4= new JButton("Home");
        homebtn4.setBounds(20,20,100,30);
        setsalarytoppnl.add(homebtn4);
        ActionListener actionListener1=new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    try{
                        frame1.setVisible(true);
                        frame2.setVisible(false);
                        frame3.setVisible(false);
                    }
                    catch (NullPointerException t) {
                        JOptionPane.showMessageDialog(frame1, "not valid", "error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            };
        homebtn1.addActionListener(actionListener1);
        homebtn2.addActionListener(actionListener1);
        homebtn3.addActionListener(actionListener1);
        homebtn4.addActionListener(actionListener1);

        //addlecturerpanel button for adding lecturer
        addlecturerbtn= new JButton("Add Lecturer");
        addlecturerbtn.setBounds(100,600,150,30);
        addlecturerbtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Alert dialog box if any of the fields is empty
                    if (idField1.getText().isEmpty() || nameField1.getText().isEmpty() || addressField1.getText().isEmpty() || workingTypeField1.getText().isEmpty() || employmentStatusField1.getText().isEmpty() || departmentField1.getText().isEmpty() || yearsOfExperienceField1.getText().isEmpty() || gradedScoreField1.getText().isEmpty() || workingHoursField1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame2, "Please enter values", "Alert", JOptionPane.WARNING_MESSAGE);
                    }  else {
                        try {
                            //parse text fields values to appropraite data types
                            int id = Integer.parseInt(idField1.getText());
                            String name = nameField1.getText();
                            String address = addressField1.getText();
                            String workingType = workingTypeField1.getText();
                            String employmentStatus = employmentStatusField1.getText();
                            String department = departmentField1.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceField1.getText());
                            int workingHours = Integer.parseInt(workingHoursField1.getText());
                            int gradedScore= Integer.parseInt(gradedScoreField1.getText());
                            // Validate input length
                            //id cannot have more than 3 length
                            if (id>1000 ){
                                JOptionPane.showMessageDialog(frame2, "Input length exceeds maximum allowed length for Teacher ID is 3.", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //gradedscore cannot be more than 100
                            if(gradedScore>101 ){
                                JOptionPane.showMessageDialog(frame2, " Graded Score cannot be more than 100" , "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //years of experience cannot be less than 6
                            if(yearsOfExperience<6){
                                JOptionPane.showMessageDialog(frame2, " Years Of Experience must be greater than 5" , "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }

                            // Check if the teacher ID already exists
                            boolean idExisting = false;
                            for (Teacher t : teacher) {
                                if (t.getTeacherId() == id) {
                                    idExisting = true;
                                    JOptionPane.showMessageDialog(frame2, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                            if (!idExisting) {
                                // Create and add new lecturer if ID doesn't exist
                                Lecturer lecturer = new Lecturer(id, name, address, workingType, employmentStatus, department, yearsOfExperience, workingHours);
                                teacher.add(lecturer);
                                JOptionPane.showMessageDialog(frame2, "Lecturer added successfully.");
                            }

                        } //if invalid data type is entered in the textfield, numberformat expection gets activated
                        catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame2, "Invalid datatype", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
        lecturermainpnl.add(addlecturerbtn);

        //addTutor button for adding tutor
        addTutor= new JButton("Add Tutor");
        addTutor.setBounds(100,600,150,30);
        tutormainpnl.add(addTutor);
        addTutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // Alert dialog box if any of the fields is empty
                    if(idField2.getText().equals("")||nameField2.getText().equals("")||addressField2.getText().equals("")||workingTypeField2.getText().equals("")||employmentStatusField2.getText().equals("")||workingHoursField2.getText().equals("")||academicQualificationsField2.getText().equals("")||salaryField2.getText().equals("")||specializationField2.getText().equals("")||performanceIndexField2.getText().equals("")){
                        JOptionPane.showMessageDialog(frame2,"Please enter values","Alert",JOptionPane.WARNING_MESSAGE);  
                    }
                    else{
                        try
                        { //parse text fields values to appropraite data types
                            int id=Integer.parseInt(idField2.getText());
                            String name=nameField2.getText();
                            String address=addressField2.getText();
                            String workingType=workingTypeField2.getText();
                            String employmentStatus=employmentStatusField2.getText();
                            int workingHours= Integer.parseInt(workingHoursField2.getText());
                            double salary=Double.parseDouble(salaryField2.getText());
                            String specialization=specializationField2.getText();
                            String academicQualification=academicQualificationsField2.getText();
                            int performanceIndex=Integer.parseInt(performanceIndexField2.getText());
                            // Validate input length
                            //id cannot have more than 3 length
                            if (id>1000) {
                                JOptionPane.showMessageDialog(frame3, "Input length exceeds maximum allowed length for Teacher ID is 3 .", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //working hours cannot be more than 70
                            if (workingHours>70) {
                                JOptionPane.showMessageDialog(frame3, "Input length exceeds maximum allowed working hours of 70 .", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //performance index should be between 5 and 10
                            if(performanceIndex>10 && performanceIndex <5){
                                JOptionPane.showMessageDialog(frame3, "Performance index cannot be more than 10 .", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;

                            }

                            // Check if the teacher ID already exists
                            boolean idExisting = false;
                            for (Teacher t : teacher) {
                                if (t.getTeacherId() == id) {
                                    idExisting = true;
                                    JOptionPane.showMessageDialog(frame2, "Teacher ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                            if (!idExisting) {
                                //creating object of tutor class
                                Tutor tutor=new Tutor(id,name,address,workingType,employmentStatus,workingHours,salary,specialization,academicQualification,performanceIndex);
                                teacher.add(tutor);//upcasting the elements/objects of tutor to the arraylist of teacher
                                JOptionPane.showMessageDialog(frame2,"Tutor is added sucessfully.","successfull entry",JOptionPane.INFORMATION_MESSAGE);

                            }

                        }
                        //if invalid data type is entered in the textfield, numberformat expection gets activated
                        catch(NumberFormatException a)
                        {
                            JOptionPane.showMessageDialog(frame2,"invalid datatype .Please include id,salary,workinghours and performance index as integer","Alert",JOptionPane.WARNING_MESSAGE);  
                        }
                    }
                }
            });

        //gradeAssignments button for grading the assignemnt
        gradeAssignments = new JButton("Grade Assignment");
        gradeAssignments.setBounds(100, 640, 150, 30);
        gradeAssignments.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Alert dialog box if any of the fields is empty
                    if (idField1.getText().equals("") || gradedScoreField1.getText().equals("") || departmentField1.getText().equals("") || yearsOfExperienceField1.getText().equals("")) {
                        JOptionPane.showMessageDialog(frame2, "Please enter values id, graded score, department, years of experience", "Alert", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try {
                            //parse text fields values to appropriate data types
                            int id = Integer.parseInt(idField1.getText());
                            int gradedScore = Integer.parseInt(gradedScoreField1.getText());
                            String department = departmentField1.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceField1.getText());
                            // Validate input length
                            //id cannot have more than 3 length
                            if (id>1000) {
                                JOptionPane.showMessageDialog(frame3, "Input length exceeds maximum allowed length for Teacher ID is 3 .", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //gradedScore cannot be more than 100
                            if(gradedScore>101 ){
                                JOptionPane.showMessageDialog(frame2, " Graded Score cannot be more than 100" , "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //years of experience cannot be less than 6
                            if(yearsOfExperience<6){
                                JOptionPane.showMessageDialog(frame2, " Years Of Experience must be greater than 5" , "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }

                            boolean teacherFound = false;
                            // Search for teacher in the array list
                            for (Teacher teacher : teacher) {
                                // Checking if the teacher ID that is passed already exists and checking whether teacher object is an instance of Lecturer class
                                if (teacher.getTeacherId() == id && teacher instanceof Lecturer) {
                                    // Assigning grades based on the graded score range
                                    String grade;
                                    if (gradedScore >= 70) {
                                        grade = "A";
                                    } else if (gradedScore >= 60) {
                                        grade = "B";
                                    } else if (gradedScore >= 50) {
                                        grade = "C";
                                    } else if (gradedScore >= 40) {
                                        grade = "D";
                                    } else {
                                        grade = "E";
                                    }
                                    ((Lecturer) teacher).setGradedScore(gradedScore);
                                    ((Lecturer) teacher).gradeAssignment(gradedScore, department, yearsOfExperience); // Upcasting and calling the method passing parameters
                                    JOptionPane.showMessageDialog(frame2, "Assignment graded successfully! Grade assigned: " + grade);
                                    teacherFound = true;
                                    break; // Exit the loop once the teacher is found and graded
                                }
                            }
                            if (!teacherFound) {
                                JOptionPane.showMessageDialog(frame2, "Teacher not found or is not a Lecturer!");
                            }

                        }//if invalid datatype is entered in the textfield  numberformat exception gets tiggers
                        catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame2, "Invalid data type", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            });
        lecturermainpnl.add(gradeAssignments);

        //set salary
        set_Salary_Tutor= new JButton("Set Salary of Tutor");
        set_Salary_Tutor.setBounds(300,400,150,30);
        set_Salary_Tutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // Show the input dialog to the user
                    // Alert dialog box if any of the fields is empty
                    if (idField3.getText().equals("")||newSalaryField3.getText().equals("")||newPerformanceIndexField3.getText().equals("")){
                        JOptionPane.showMessageDialog(frame4,"Please enter values","Alert",JOptionPane.WARNING_MESSAGE);  
                    } {
                        try {
                            //parse text fields values to appropriate data types
                            int id=Integer.parseInt(idField3.getText());
                            int salary=Integer.parseInt(newSalaryField3.getText());
                            int performanceIndex=Integer.parseInt(newPerformanceIndexField3.getText());
                            boolean found=false;
                            //newslary and new performance index cannot be less than 0
                            if (Double.parseDouble(newSalaryField3.getText()) < 0 || Integer.parseInt(newPerformanceIndexField3.getText()) < 0) {
                                JOptionPane.showMessageDialog(frame2, "Please enter positive numeric values.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                            }
                            //id cannot be more than length 3
                            if (id>1000) {
                                JOptionPane.showMessageDialog(frame3, "Input length exceeds maximum allowed length for Teacher ID is 3 .", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            //performance index cannot be more than 10
                            if(performanceIndex>10){
                                JOptionPane.showMessageDialog(frame3, "Performance index cannot be more than 10 .", "Input Error", JOptionPane.WARNING_MESSAGE);
                                return;

                            }

                            for(Teacher teacher :teacher)
                            // iterating the elments of teacher arraylist
                            {
                                if (teacher instanceof Tutor && teacher.getTeacherId()==id    )
                                //checking if the teacher is the element of tutor
                                {
                                    //downcasting tutor in teacherarraylist and invokes the method
                                    ((Tutor)teacher).setSalary(salary,performanceIndex);
                                    JOptionPane.showMessageDialog(frame2,"Salary is set.","Information",JOptionPane.INFORMATION_MESSAGE);  
                                    found=true;
                                    break;
                                }

                            }
                            if(found==false){
                                JOptionPane.showMessageDialog(frame2, "Tutor with the given ID  is  not found.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        //if any of the fields are input with invalid datatype numberformat excpetion gets activated
                        catch(NumberFormatException a)
                        {
                            JOptionPane.showMessageDialog(frame2,"Please enter values","Alert",JOptionPane.WARNING_MESSAGE);  
                        }
                    }
                }
            });
        setsalarypnl.add(set_Salary_Tutor);

        //removeTutor button to remove the tutor
        removeTutor= new JButton("Remove Tutor");
        removeTutor.setBounds(300,650,150,30);
        tutormainpnl.add(removeTutor);
        removeTutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try {
                        //parse the inputs 
                        int id = Integer.parseInt(idField2.getText());
                        boolean found = false;
                        //iterate the values of teacher object
                        for (Teacher teacher :teacher) {

                            if (teacher instanceof Tutor && teacher.getTeacherId() == id) {
                                ((Tutor) teacher).removeTutor();
                                int option = JOptionPane.showConfirmDialog(frame2, "Are you sure you want to remove tutor?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                if (option == JOptionPane.YES_OPTION){
                                    // Clear the ID field
                                    idField2.setText("");
                                    nameField2.setText("");
                                    addressField2.setText("");
                                    workingTypeField2.setText("");
                                    employmentStatusField2.setText("");
                                    workingHoursField2.setText("");
                                    salaryField2.setText("");
                                    specializationField2.setText("");
                                    academicQualificationsField2.setText("");
                                    performanceIndexField2.setText("");

                                    JOptionPane.showMessageDialog(frame2, "Tutor is removed.", "Alert", JOptionPane.WARNING_MESSAGE);

                                }
                                found = true;
                                break;
                            }
                        }
                        if (found==false) {
                            JOptionPane.showMessageDialog(frame2, "Tutor with the given ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } //if the textfield is input with invalid datatype is entered  number format expection gets activated
                    catch(NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame2, "Please enter a valid teacher ID.", "Alert", JOptionPane.WARNING_MESSAGE);  
                    }
                }
            });
        //display button to display teacher's details
        displaybtn1= new JButton("Display");
        displaybtn1.setBounds(700,600,150,30);
        displaybtn2= new JButton("Display");
        displaybtn2.setBounds(700,600,150,30);

        displaybtn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Alert dialog box if any of the fields is empty
                        int id = Integer.parseInt(idField1.getText());
                        String info="";
                        String grade;
                        boolean found = false;
                        //iterating the objects of teacher 
                        for (Teacher teacher : teacher) {
                            if (teacher.getTeacherId() == id) {
                                if (teacher instanceof Lecturer)
                                {

                                    Lecturer lecturer = (Lecturer) teacher;
                                    lecturer.display();
                                    int gradedScore = lecturer.getGradedScore();

                                    StringBuilder display= new StringBuilder();
                                    display.append(display);
                                    if (gradedScore >= 70) {
                                        grade = "A";
                                    } else if (gradedScore >= 60) {
                                        grade = "B";
                                    } else if (gradedScore >= 50) {
                                        grade = "C";
                                    } else if (gradedScore >= 40) {
                                        grade = "D";
                                    } else {
                                        grade = "E";
                                    }
                                    info = "Teacher ID: " + lecturer.getTeacherId() + "\n" +
                                    "Name: " + lecturer.getTeacherName() + "\n" +
                                    "Address: " + lecturer.getAddress() + "\n" +
                                    "Workingtype: " + lecturer.getWorkingType() + "\n" +
                                    "Employment Status: " + lecturer.getEmploymentStatus() + "\n"+
                                    "Department: " + lecturer.getDepartment() + "\n"+
                                    "Working Hour: " + lecturer.getWorkingHours() + "\n" +
                                    "Years Of Experience:"+lecturer.getYearsOfExperience()+"\n";

                                    display.append(info);
                                    // Display information about the tutor
                                    //if the teacher has been graded this gets activated
                                    if (lecturer.getHasGraded()){
                                        display.append("Graded Score: "+lecturer.getGradedScore());
                                        display.append("\n Grade"+grade);
                                        display.append("\n"+"The test has been successfully graded");
                                    }
                                    else{
                                        display.append( "\n"+"The test is not graded yet");
                                    }

                                    JOptionPane.showMessageDialog(frame2, display, "Teacher Information", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    // Handle if the teacher is not a tutor
                                    JOptionPane.showMessageDialog(frame2, "Teacher with the given ID is not a Lecturer.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                found = true;
                                break;
                            }
                        }
                        if (found==false) {
                            JOptionPane.showMessageDialog(frame2, "Teacher with the given ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch(NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame2, "Please enter a valid teacher ID.", "Alert", JOptionPane.WARNING_MESSAGE);  
                    }
                }
            });
        displaybtn2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int id = Integer.parseInt(idField2.getText());
                        boolean found = false;
                        for (Teacher teacher : teacher) {
                            if (teacher.getTeacherId() == id) {
                                if (teacher instanceof Tutor) {
                                    Tutor tutor = (Tutor) teacher;
                                    // Display information about the tutor
                                    String info = "Teacher ID: " + tutor.getTeacherId() + "\n"+
                                        "Name: " + tutor.getTeacherName() + "\n"+
                                        "Address: " + tutor.getAddress() + "\n"+
                                        "Workingtype: " + tutor.getWorkingType() + "\n"+
                                        "Salary: " + tutor.getSalary() + "\n"+
                                        "Employmeentstatus: " + tutor.getEmploymentStatus() + "\n"+
                                        "Department: " + tutor.getEmploymentStatus() + "\n"+
                                        "Academic Qualification: " + tutor.getAcademicQualifications() + "\n"+
                                        "Performance Index: " + tutor.getPerformanceIndex() + "\n"+
                                        "Working Hour: " + tutor.getWorkingHours() + "\n";

                                    JOptionPane.showMessageDialog(frame3, info, "Teacher Information", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    // Handle if the teacher is not a tutor
                                    JOptionPane.showMessageDialog(frame3, "Teacher with the given ID is not a tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                found = true;
                                break;
                            }
                        }
                        if (found==false) {
                            JOptionPane.showMessageDialog(frame2, "Teacher with the given ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch(NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame2, "Please fill empty fields.", "Alert", JOptionPane.WARNING_MESSAGE);  
                    }
                }
            });
        lecturermainpnl.add(displaybtn1);
        tutormainpnl.add(displaybtn2);

        //clear button to clear the text field
        clear1= new JButton("Clear");
        clear1.setBounds(1400,25,70,30);
        clear1.setBackground(Color.decode("#6f9aab")); // Set background color
        clear1.setForeground(Color.WHITE); // Set text color
        clear1.setFont(new Font("Arial", Font.BOLD, 14));
        clear1.setBorder(new LineBorder(Color.white));
        lecturertoppnl.add(clear1);
        clear2= new JButton("Clear");
        clear2.setBounds(1400,25,70,30);
        clear2.setBackground(Color.decode("#6f9aab")); // Set background color
        clear2.setForeground(Color.WHITE); // Set text color
        clear2.setFont(new Font("Arial", Font.BOLD, 14));
        clear2.setBorder(new LineBorder(Color.white));
        lecturertoppnl.add(clear2);
        tutortoppnl.add(clear2);
        clear1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent g){
                    //confirm dialog box to confirm the clearing the text fields
                    int option = JOptionPane.showConfirmDialog(frame2, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    //if option yes is entered 
                    if (option == JOptionPane.YES_OPTION){
                        //sets all the text fields to be empty
                        nameField1.setText("");
                        idField1.setText("");
                        addressField1.setText("");
                        workingTypeField1.setText("");
                        employmentStatusField1.setText("");
                        departmentField1.setText("");
                        yearsOfExperienceField1.setText("");
                        gradedScoreField1.setText("");
                        workingHoursField1.setText("");
                    }

                }
            });
        clear2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent g){
                    //confirm dialog box to confirm the clearing the text fields
                    int option = JOptionPane.showConfirmDialog(frame2, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    //if option yes is entered 
                    if (option == JOptionPane.YES_OPTION){
                        //sets all the text fields to be empty
                        idField2.setText("");
                        nameField2.setText("");
                        addressField2.setText("");
                        workingTypeField2.setText("");
                        employmentStatusField2.setText("");
                        yearsOfExperienceField1.setText("");
                        workingHoursField2.setText("");
                        salaryField2.setText("");
                        specializationField2.setText("");
                        academicQualificationsField2.setText("");
                        performanceIndexField2.setText("");
                    }
                }
            });
        //add properties of to respective JButton
        setButtonProperties(lecturer_btn1);
        setButtonProperties(lecturer_btn2);
        setButtonProperties(lecturer_btn3);
        setButtonProperties(tutor_btn1);
        setButtonProperties(tutor_btn2);
        setButtonProperties(tutor_btn3);
        setButtonProperties(homebtn1);
        setButtonProperties(homebtn2);
        setButtonProperties(homebtn3);
        setButtonProperties(homebtn4);
        setButtonProperties(switch_to_tutor);
        setButtonProperties(switch_to_lecturer);
        setButtonProperties(addlecturerbtn);
        setButtonProperties(addTutor);
        setButtonProperties(gradeAssignments);
        setButtonProperties(switch_to_lecturer);
        setButtonProperties(switch_to_set_salary);
        setButtonProperties(set_Salary_Tutor);
        setButtonProperties(backbtnsalary);
        setButtonProperties(removeTutor);
        setButtonProperties(displaybtn1);
        setButtonProperties(displaybtn2);
        setButtonProperties(clear1);
        setButtonProperties(clear2);
        //add properties of to respective JLabel
        setLabelProperties(id1);
        setLabelProperties(id2);
        setLabelProperties(id3);
        setLabelProperties(name1);
        setLabelProperties(name2);
        setLabelProperties(address1);
        setLabelProperties(address2);
        setLabelProperties(workingType1);
        setLabelProperties(workingType2);
        setLabelProperties(employmentStatus1);
        setLabelProperties(employmentStatus2);
        setLabelProperties(workingHours1);
        setLabelProperties(workingHours2);
        setLabelProperties(department1);
        setLabelProperties(yearsOfExperience1);
        setLabelProperties(salary2);
        setLabelProperties(specialization2);
        setLabelProperties(academicQualifications2);
        setLabelProperties(performanceIndex2);
        setLabelProperties(newSalary3);
        setLabelProperties(newPerformanceIndex3);
    }
    // Method to set properties for buttons
    public static void setButtonProperties(JButton button) {
        button.setBackground(Color.decode("#6f9aab")); // Set background color
        button.setForeground(Color.WHITE); // Set text color
        button.setFont(new Font("Arial", Font.BOLD, 14)); // Set font and font size
        button.setBorder(new LineBorder(Color.white)); // Set border
    }

    public static void setLabelProperties(JLabel label) {
        label.setForeground(Color.BLACK); // Set text color
        label.setFont(new Font("Arial", Font.BOLD, 13)); // Set font and font size

    }

    public static void main(String[] args){
        new TeacherGUI();
    }
}