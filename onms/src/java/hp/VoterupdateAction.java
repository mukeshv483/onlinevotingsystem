/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author mk
 */
public class VoterupdateAction extends org.apache.struts.action.Action {
     private static  String SUCCESS = "success";
     
     @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        VoterinfoupdateForm rb=(VoterinfoupdateForm)form;
        String age=rb.getAge();
        String constituency=rb.getConstuency();
         System.out.println("getConsituency"+constituency);
        String dob=rb.getDob();
        System.out.println("dob is"+dob);
       
        String distt=rb.getDistt();
        String email=rb.getEmail();
        String gender=rb.getGender();
        String phno=rb.getPhno();
        String address=rb.getAddress();
        String name=rb.getName();
         System.out.println("username is "+name);
        String uname=rb.getUsername();
        String voterid=rb.getVoterid();
        
                         
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
                                                        
        
            PreparedStatement ps=con.prepareStatement("update votereg set name=?,address=?,dob=?,distt=?,consituency=?,email=?,phno=?,voterid=?,gender=?,age=? where username='"+uname+"'");
            //ps.setString(1,uname );
            //ps.setString(2,pass );
            ps.setString(1,name );
            ps.setString(2,address );
            ps.setString(3,dob );
             ps.setString(4,distt );
            ps.setString(5,constituency );
           
            ps.setString(6,email );
            ps.setString(7,phno );
            ps.setString(8,voterid );
          
            ps.setString(9,gender );
           
            ps.setString(10,age );
            
            int status=ps.executeUpdate();
           
         if(status>0)   
         {
          SUCCESS="success";
         }
         else{
             SUCCESS="fail";
             
         }
         
         ps=con.prepareStatement("update  login set role=?,status=?,name=?,voterid=? where username='"+uname+"'");
       String role="voter";
     String username=uname;
     //    ps.setString(1,username );
           // ps.setString(2,pass );
           ps.setString(1,role );
            ps.setString(2,"active" );
            ps.setString(3,name );
           ps.setString(4,voterid );
           
           
            int status1=ps.executeUpdate();
         if(status1>0)   
         {
          SUCCESS="success";
         }
         else{
             SUCCESS="fail";
             
         }
           ps.close();
           con.close();
          return mapping.findForward(SUCCESS); 
         }
    
    
}
