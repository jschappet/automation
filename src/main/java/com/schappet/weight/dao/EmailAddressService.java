package com.schappet.weight.dao;

import com.schappet.weight.domain.EmailAddress;

import edu.uiowa.icts.spring.GenericDaoInterface;



/**
 * Generated by Protogen 
 * @since 04/07/2015 08:12:26 CDT
 */
public interface EmailAddressService extends GenericDaoInterface<EmailAddress> {

	public EmailAddress findById( Integer id );

}