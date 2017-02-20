/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author mk
 */
public class VoterinfoupdateForm extends org.apache.struts.action.ActionForm {
    
     private String username;
    private String age;
    private String name;
    private String address;
    private String dob;
    private String distt;
    private String constuency;
    private String email;
    private String phno;
    private String gender;
    private String voterid;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getConstuency() {
        return constuency;
    }

    public void setConstuency(String constuency) {
        this.constuency = constuency;
    }

    

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDistt() {
        return distt;
    }

    public void setDistt(String distt) {
        this.distt = distt;
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

    public String getVoterid() {
        return voterid;
    }

    public void setVoterid(String voterid) {
        this.voterid = voterid;
    }
    
    
    
    
}
