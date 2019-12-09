package aywon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aywon {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //Not sure
        /*String url="jdbc:mysql://localhost//online medicine and appointment system ";
        String username="root";
        String password="";
        
        String query="SELECT * FROM `doctor's information` WHERE Specialist='skin' ";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con;
        con= (Connection) DriverManager.getConnection(url ,username ,password);*/
        
        
        //Not Sure
    
        FirstFrame f1 = new FirstFrame();
        f1.setVisible(true);
        //Frame2 f2 = new Frame2();
        //f2.setVisible(true);
        //Registration f1 = new Registration();
        //f1.setVisible(true);
       // Registration r1 = new Registration();
        //r1.setVisible(true);
        Appointment a1 = new Appointment();
        a1.setVisible(true);
        //DoctorInfo df1 = new DoctorInfo();
        //df1.setVisible(true);
        //Medicine m1 = new Medicine();
        //m1.setVisible(true);
        //Unavailable  u1 = new Unavailable ();
        //u1.setVisible(true);
        //Available  a1 = new Available ();
        //a1.setVisible(true);
        //Address  ad1 = new Address ();
        //ad1.setVisible(true);
        //MedicineStatus ms1=new MedicineStatus();
        //ms1.setVisible(true);
        //AvailableTime at = new AvailableTime();
        //t.setVisible(true);
        //Database db = new Database();
        //db.openConnection();
        
    }
    
}
