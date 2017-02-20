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
public class candidateregbean extends org.apache.struts.action.ActionForm {
    
    private String cuser;
    private String cpass; 
    private String cname;
     private String caddress; 
     private String cgender;
      private String cdob;
      private String pname;
       private String constituencyid;
        private String cphno;
         private String cemailid;
         private String cdescription;
         
            
              ;

    /**
     * @return the cuser
     */
    public String getCuser() {
        return cuser;
    }

    /**
     * @param cuser the cuser to set
     */
    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    /**
     * @return the cpass
     */
    public String getCpass() {
        return cpass;
    }

    /**
     * @param cpass the cpass to set
     */
    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the caddress
     */
    public String getCaddress() {
        return caddress;
    }

    /**
     * @param caddress the caddress to set
     */
    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    /**
     * @return the cgender
     */
    public String getCgender() {
        return cgender;
    }

    /**
     * @param cgender the cgender to set
     */
    public void setCgender(String cgender) {
        this.cgender = cgender;
    }

    /**
     * @return the cdob
     */
    public String getCdob() {
        return cdob;
    }

    /**
     * @param cdob the cdob to set
     */
    public void setCdob(String cdob) {
        this.cdob = cdob;
    }

    /**
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname the pname to set
     */
    public void setPname(String pname) {
        this.pname = pname;
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
     * @return the cphno
     */
    public String getCphno() {
        return cphno;
    }

    /**
     * @param cphno the cphno to set
     */
    public void setCphno(String cphno) {
        this.cphno = cphno;
    }

    /**
     * @return the cemailid
     */
    public String getCemailid() {
        return cemailid;
    }

    /**
     * @param cemailid the cemailid to set
     */
    public void setCemailid(String cemailid) {
        this.cemailid = cemailid;
    }

    /**
     * @return the cdescription
     */
    public String getCdescription() {
        return cdescription;
    }

    /**
     * @param cdescription the cdescription to set
     */
    public void setCdescription(String cdescription) {
        this.cdescription = cdescription;
    }

     
     

}
