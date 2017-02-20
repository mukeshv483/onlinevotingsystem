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
 * @author s
 */
public class Regvoteraction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    
    private static  String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Regsvoterbean rb=(Regsvoterbean)form;
        String age=rb.getAge1();
        String constituency=rb.getConstituencyid();
        String dob=rb.getDateofbirth();
        System.out.println("dob is"+dob);
       
        String distt=rb.getDistrict();
        String email=rb.getEmailid();
        String gender=rb.getGender();
        String phno=rb.getPhno();
        String address=rb.getVoteraddress();
        String name=rb.getVotername();
        String pass=rb.getVoterpassword();
        String uname=rb.getVoterusername();
        String voterid=rb.getVoterid1();
        
                         
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
                                                        
        
            PreparedStatement ps=con.prepareStatement("insert into votereg values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,uname );
            ps.setString(2,pass );
            ps.setString(3,name );
            ps.setString(4,address );
            ps.setString(5,dob );
             ps.setString(6,distt );
            ps.setString(7,constituency );
           
            ps.setString(8,email );
            ps.setString(9,phno );
            ps.setString(10,voterid );
          
            ps.setString(11,gender );
           
            ps.setString(12,age );
            
            int status=ps.executeUpdate();
           
         if(status>0)   
         {
          SUCCESS="success";
         }
         else{
             SUCCESS="fail";
             
         }
         
         ps=con.prepareStatement("insert into login values(?,?,?,?,?,?)");
       String role="voter";
     String username=uname;
         ps.setString(1,username );
            ps.setString(2,pass );
           ps.setString(3,role );
            ps.setString(4,"active" );
            ps.setString(5,name );
           ps.setString(6,voterid );
           
           
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

