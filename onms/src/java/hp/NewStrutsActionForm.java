/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author s
 */
public class NewStrutsActionForm extends org.apache.struts.action.ActionForm {
    
    private String username;
    private String password;

    /**
     * @return the name
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
    

    

   
}
