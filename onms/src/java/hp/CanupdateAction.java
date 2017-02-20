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
public class CanupdateAction extends org.apache.struts.action.Action {
      private static  String SUCCESS = "success";
     @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        CanUpdateBean lb=(CanUpdateBean)form;
        String user=lb.getUsername();
       
        String name=lb.getName();
        String address=lb.getAddress();
        String gender=lb.getGender();
       
        String desc=lb.getCanDesc();
        
         System.out.println("descriptiomn is"+desc);
       
         String dob=lb.getDob();
        String phno=lb.getPhno();
        String pname=lb.getPartyname();
        String eid=lb.getEmail();
        String constituencyid = lb.getConstuency();
               
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
                                                       
        
            PreparedStatement ps=con.prepareStatement("update canreg set name=?,address=?,gender=?,dob=?,pname=?,constituency=?,phno=?,email=?,description=? where username='"+user+"'");
          //  ps.setString(1,user );
          //  ps.setString(2,pass );
            ps.setString(1,name );
            ps.setString(2,address );
            ps.setString(3,gender );
             ps.setString(4,dob );
            ps.setString(5,pname );
           
            ps.setString(6,constituencyid);
            ps.setString(7,phno );
            ps.setString(8,eid );
            ps.setString(9,desc );
          
            
            int status=ps.executeUpdate();
            System.out.println("status is"+status);
        
                
         if(status>0)   
         {
          SUCCESS="success";
         }
         else{
             SUCCESS="fail";
             
         }
         ps=con.prepareStatement("update  login set role=?,status=?,name=? where username='"+user+"'");
          String role="candidate"; 

        // ps.setString(1,username );
          
          ps.setString(1,role );
            ps.setString(2,"active" );
            ps.setString(3,name );
           
        
           int status1=ps.executeUpdate();
//         if(status1>0)   
//         {
//          SUCCESS="success";
//         }    
//         else{
//             SUCCESS="fail";
//             
//         }
//        
         
           ps.close();
           con.close();
             
        
        
        return mapping.findForward(SUCCESS);
    }
}
