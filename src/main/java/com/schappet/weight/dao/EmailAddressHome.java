package com.schappet.weight.dao;

import com.schappet.spring.*;
import com.schappet.weight.domain.*;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Generated by Protogen 
 * @since 04/07/2015 08:12:26 CDT
 */
@Repository("com_schappet_weight_dao_EmailAddressHome")
@Transactional
public class EmailAddressHome extends GenericDao<EmailAddress> implements EmailAddressService {

	private static final Log log = LogFactory.getLog( EmailAddressHome.class );

	public EmailAddressHome() {
		setDomainName( "com.schappet.weight.domain.EmailAddress" );
	}

	public EmailAddress findById( Integer id ) {
		return (EmailAddress) this.sessionFactory.getCurrentSession().get( EmailAddress.class, id );
	}

}