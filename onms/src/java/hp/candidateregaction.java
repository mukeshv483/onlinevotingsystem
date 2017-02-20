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
public class candidateregaction extends org.apache.struts.action.Action {

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
        
        candidateregbean lb=(candidateregbean)form;
        String user=lb.getCuser();
        String pass=lb.getCpass();
        String name=lb.getCname();
        String address=lb.getCaddress();
        String gender=lb.getCgender();
        String desc=lb.getCdescription();
         String dob=lb.getCdob();
        String phno=lb.getCphno();
        String pname=lb.getPname();
        String eid=lb.getCemailid();
        String constituencyid = lb.getConstituencyid();
               
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
                                                       
        
            PreparedStatement ps=con.prepareStatement("insert into canreg values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,user );
            ps.setString(2,pass );
            ps.setString(3,name );
            ps.setString(4,address );
            ps.setString(5,gender );
             ps.setString(6,dob );
            ps.setString(7,pname );
           System.out.println("party name is"+pname);
            ps.setString(8,constituencyid);
            ps.setString(9,phno );
            ps.setString(10,eid );
            ps.setString(11,desc );
          
            
            int status=ps.executeUpdate();
        
                
         if(status>0)   
         {
          SUCCESS="success";
         }
         else{
             SUCCESS="fail";
             
         }
         ps=con.prepareStatement("insert into login values(?,?,?,?,?,?)");
      String role="candidate"; 
     String username=user;
         ps.setString(1,username );
            ps.setString(2,pass );
           ps.setString(3,role );
            ps.setString(4,"active" );
            ps.setString(5,name );
           ps.setString(6,user );
        
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
