/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author s
 */
public class Regsvoterbean extends org.apache.struts.action.ActionForm {
    
      private String voterusername;
    private String voterpassword;
    private String votername;
    private String voteraddress;
    private String dateofbirth;
    private String district;
    private String constituencyid;
    private String emailid;
    private String phno;
    private String gender;
    private String age1;
    private String voterid1;

    /**
     * @return the voterusername
     */
    public String getVoterusername() {
        return voterusername;
    }

    /**
     * @param voterusername the voterusername to set
     */
    public void setVoterusername(String voterusername) {
        this.voterusername = voterusername;
    }

    /**
     * @return the voterpassword
     */
    public String getVoterpassword() {
        return voterpassword;
    }

    /**
     * @param voterpassword the voterpassword to set
     */
    public void setVoterpassword(String voterpassword) {
        this.voterpassword = voterpassword;
    }

    /**
     * @return the votername
     */
    public String getVotername() {
        return votername;
    }

    /**
     * @param votername the votername to set
     */
    public void setVotername(String votername) {
        this.votername = votername;
    }

    /**
     * @return the voteraddress
     */
    public String getVoteraddress() {
        return voteraddress;
    }

    /**
     * @param voteraddress the voteraddress to set
     */
    public void setVoteraddress(String voteraddress) {
        this.voteraddress = voteraddress;
    }

    /**
     * @return the dateofbirth
     */
    public String getDateofbirth() {
        return dateofbirth;
    }

    /**
     * @param dateofbirth the dateofbirth to set
     */
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the constituencyid
     */
    public String getConstituencyid() {
        return constituencyid;
    }

    /**
     * @param constituencyid the constituencyid to set
     */
    public void setConstituencyid(String constituencyid) {
        this.constituencyid = constituencyid;
    }

    /**
     * @return the emailid
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * @param emailid the emailid to set
     */
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    /**
     * @return the phno
     */
    public String getPhno() {
        return phno;
    }

    /**
     * @param phno the phno to set
     */
    public void setPhno(String phno) {
        this.phno = phno;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age1
     */
    public String getAge1() {
        return age1;
    }

    /**
     * @param age1 the age1 to set
     */
    public void setAge1(String age1) {
        this.age1 = age1;
    }

    /**
     * @return the voterid1
     */
    public String getVoterid1() {
        return voterid1;
    }

    /**
     * @param voterid1 the voterid1 to set
     */
    public void setVoterid1(String voterid1) {
        this.voterid1 = voterid1;
    }

}
