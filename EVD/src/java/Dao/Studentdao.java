
package Dao;

import Studentpackage.Student;
import Util.DUBtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Studentdao{
  static  DUBtil util= new DUBtil();
  static  PreparedStatement ps;
  static  ResultSet rs;
  static  String sql;
  
  public static int save(Student s){
      int status=0;
  
  sql="insert into student(name,email,dob,fee) values(?,?,?,?)";
      try {
          ps=util.getCon().prepareStatement(sql);
          ps.setString(1, s.getName());
          ps.setString(1, s.getEmail());
          ps.setString(1, s.getDob());
          ps.setString(1, s.getFee());
          
          status=ps.executeUpdate();
          ps.close();
          util.getCon().close();
        
          
      } catch (SQLException ex) {
          Logger.getLogger(Studentdao.class.getName()).log(Level.SEVERE, null, ex);
      }
  
      return status;
  }
  
  public static List<Student> getAll(){
   List<Student>list=new ArrayList<>();
   sql="select *from student";
      try {
          ps=util.getCon().prepareStatement(sql);
          rs=ps.executeQuery();
          while (rs.next()) {              
              Student s=new Student(
                      rs.getInt("id"),
                      sql, 
                      sql, 
                      sql, sql);
          }
      } catch (SQLException ex) {
          Logger.getLogger(Studentdao.class.getName()).log(Level.SEVERE, null, ex);
      }
   
     }
}
