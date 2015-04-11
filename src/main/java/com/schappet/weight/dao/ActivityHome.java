package com.schappet.weight.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.schappet.spring.GenericDao;
import com.schappet.weight.domain.Activity;

/**
 * Generated by Protogen 
 * @since 04/11/2015 07:34:51 CDT
 */
@Repository("com_schappet_weight_dao_ActivityHome")
@Transactional
public class ActivityHome extends GenericDao<Activity> implements ActivityService {

	private static final Log log = LogFactory.getLog( ActivityHome.class );

	public ActivityHome() {
		setDomainName( "com.schappet.weight.domain.Activity" );
	}

	public Activity findById( Integer id ) {
		return (Activity) this.sessionFactory.getCurrentSession().get( Activity.class, id );
	}

}