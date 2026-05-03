
package Dao;

import Util.DUBtil;
import entity.student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDao {
    static  DUBtil util =new DUBtil();
    static PreparedStatement ps;
    static  ResultSet rs;
    static  String sql;
    
    
  public void save(student s){
      int status=0;
  sql= "insert into student (name,email,dob,fee) values(?,?,?,?)";
        try {
            ps=util.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getDob());
            ps.setDouble(4, s.getFee());
            
            
            status =ps.executeUpdate();
            ps.close();
            util.getCon().close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
  }
   public  static  List<student> getAll(){
   
   List<student> list=new ArrayList<>();
   
   sql="select from student";
        try {
            ps=util.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                student s=new student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("dob"),
                        rs.getDouble("fee")
                                
                       );
            list.add(s);
 
            } 
            
            ps.close();rs.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
  return list;
   }
   public static  void delete(int id){
   sql="delete from student where id=?";
        try {
            ps=util.getCon().prepareStatement(sql);
            ps.setInt(id, id);
            ps.executeUpdate();
            
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
   public   void update(student s){
   
   sql="update student set name=?,eamil=?,dob=?,fee=?where id=?";
    try {
            ps=util.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getDob());
            ps.setDouble(4, s.getFee());
            ps.setInt(5, s.getId());
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
   }
    public  static  student getById(int id){
        student s=null;
    sql="select* from student where id=?";
        try {
            ps=util.getCon().prepareStatement(sql);
            ps.setInt(id, id);
            rs=ps.executeQuery();
            while (rs.next()) {                
                 s=new student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("dob"),
                        rs.getDouble("fee")
                                
                       );
            
 
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return s;
    
    }
}
