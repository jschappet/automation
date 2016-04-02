package com.schappet.weight.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Table;
import javax.persistence.Table;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/** 
 * Generated by Protogen - www.icts.uiowa.edu/protogen 
 * @since 04/07/2015 08:12:26 AM CDT
 */
@Entity( name = "com_schappet_weight_domain_emailAddress" )
@Table( name = "email_address", schema = "weight" )
public class EmailAddress { 

	private static final Log log = LogFactory.getLog(EmailAddress.class);

        private Integer emailId;
        private String address;
        private String password;

        public String toString() {
        	return this.address;
        }

    /*****emailId*****/
    @javax.persistence.SequenceGenerator(  name="gen",  sequenceName="weight.seqnum",allocationSize=1)
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO,generator="gen")
    @Column(name = "email_id", unique = true, nullable = false)
    public Integer getEmailId(){
        return emailId;
    }

    public void setEmailId(Integer emailId){
        this.emailId = emailId;
    }

    /*****address*****/
    @Column(name = "address")
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    /*****password*****/
    @Column(name = "password")
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
