/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author mk
 */
public class CanUpdateBean extends org.apache.struts.action.ActionForm {
 
    private String username;
    private String name;
    private String address;
    private String dob;
    private String constuency;
    private String email;
    private String phno;
    private String gender;
    private String partyname;
    private String CanDesc;

    public String getUsername() {
        return username;
    }

    public String getCanDesc() {
        return CanDesc;
    }

    public void setCanDesc(String CanDesc) {
        this.CanDesc = CanDesc;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getConstuency() {
        return constuency;
    }

    public void setConstuency(String constuency) {
        this.constuency = constuency;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPartyname() {
        return partyname;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }

   

     
    
    
}
