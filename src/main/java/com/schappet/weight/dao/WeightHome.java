package com.schappet.weight.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.schappet.spring.GenericDao;
import com.schappet.weight.domain.Weight;

/**
 * Generated by Protogen 
 * @since 04/07/2015 08:12:26 CDT
 */
@Repository("com_schappet_weight_dao_WeightHome")
@Transactional
public class WeightHome extends GenericDao<Weight> implements WeightService {

	private static final Log log = LogFactory.getLog( WeightHome.class );

	public WeightHome() {
		setDomainName( "com.schappet.weight.domain.Weight" );
	}

	public Weight findById( Integer id ) {
		return (Weight) this.sessionFactory.getCurrentSession().get( Weight.class, id );
	}

	public Weight latest(int personId) {
		
	     Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Weight.class);
	        criteria.add(Restrictions.eq("personId", personId));
	        criteria.addOrder(Order.desc("weightInDate"));
	        criteria.setMaxResults(1);
	        return (Weight) criteria.uniqueResult();
		 
	}

	@Override
	public List<Weight> latest(int personId, int count) {
	     Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Weight.class);
	     criteria.add(Restrictions.eq("personId", personId));
	     criteria.addOrder(Order.desc("weightInDate"));
	     criteria.setMaxResults(count < 50 ? count : 50);
	     return criteria.list();
		 
	}

	@Override
	public List<Weight> between(int personId, Date start, Date end) {
		  Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Weight.class);
		  criteria.add(Restrictions.eq("personId", personId));
		  criteria.add(Restrictions.between("weightInDate", start, end));

		  criteria.addOrder(Order.desc("weightInDate"));
		// TODO Auto-generated method stub
		return criteria.list();
	}

}