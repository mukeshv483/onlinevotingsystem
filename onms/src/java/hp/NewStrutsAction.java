/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author s
 */
public class NewStrutsAction extends org.apache.struts.action.Action{
    /* forward name="success" path="" */
    private static  String SUCCESS = "success";
    HttpSession session;
    String pass;
    String role;
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
         NewStrutsActionForm bn=(NewStrutsActionForm)form;
        String username=bn.getUsername();
        
        String password=bn.getPassword();
//        System.out.println(username);
//          System.out.println(password);
        
        Class.forName("com.mysql.jdbc.Driver");
        
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
                                                        
         Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("select * from login where Username='"+username+"'");
        
        if(rs.next()){
           pass=rs.getString("password");
            role=rs.getString("role");
            }
        else{
        SUCCESS ="fail";
      //  return mapping.findForward(SUCCESS);
        }
//			String f = rs1.getString("fname");
//			String l = rs1.getString("lname");
//			String n=f+" "+l;
       
           
        System.out.println("admin role is"+role);
        if(pass.equalsIgnoreCase(password))
        {
          session=request.getSession(true);
          session.setAttribute("username",username);
          
           session.setAttribute("password", password );
           System.out.println("admin role is"+role);
        //   System.out.println(session.getAttribute("username"));
            if(role.equalsIgnoreCase("admin")){
              System.out.println("inside admin");
                SUCCESS="admin";
                 System.out.println("success value is"+SUCCESS);
                 return mapping.findForward(SUCCESS);
            }
           if(role.equalsIgnoreCase("candidate")){
           
            SUCCESS ="candidate";
           }
            if(role.equalsIgnoreCase("voter")){
            
                   SUCCESS="voter";
            }
           
            
        }
       
        else
        {
             SUCCESS ="fail";
        }
        
       st.close();
       con.close();
       
        
        return mapping.findForward(SUCCESS);
    }
    
}
