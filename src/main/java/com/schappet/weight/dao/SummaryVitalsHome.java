package com.schappet.weight.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import com.schappet.weight.domain.SummaryTable;
import com.schappet.weight.domain.SummaryVitals;

/**
 * Generated by Protogen 
 * @since 04/11/2015 07:34:51 CDT
 */
@Repository("com_schappet_weight_dao_SummaryVitalsHome")
@Transactional
public class SummaryVitalsHome extends GenericDao<SummaryVitals> implements SummaryVitlasService {

	private static final Log log = LogFactory.getLog( SummaryVitalsHome.class );

	public SummaryVitalsHome() {
		setDomainName( "com.schappet.weight.domain.SummaryVitals" );
	}

	public SummaryVitals findById( Integer id ) {
		return (SummaryVitals) this.sessionFactory.getCurrentSession().get( SummaryVitals.class, id );
	}

	
	private SimpleDateFormat myFormat = new SimpleDateFormat("YYYY-MM");

	
	public SummaryVitals findByPersonIdAndDate( Integer id , Date date) {
		//vitalsDate
		     Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(SummaryVitals.class);
		     criteria.add(Restrictions.eq("personId", id));
		     criteria.add(Restrictions.eq("vitalsDate", date));
		     //criteria.addOrder(Order.desc("activityDate"));
		     criteria.setMaxResults(1);
		     return (SummaryVitals)criteria.uniqueResult();

		
	}

	@Override
	public List<SummaryVitals> latest(int personId, int count) {
	
		Calendar calendar = Calendar.getInstance(); // this would default to now
		calendar.add(Calendar.MONTH, -18) ;
		
		
	     Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(SummaryVitals.class);
	     criteria.add(Restrictions.eq("personId", personId));
	     criteria.add(Restrictions.gt("monthYear", myFormat.format(calendar.getTime())));
	     criteria.addOrder(Order.asc("monthYear"));
	     criteria.setMaxResults(count < 50 ? count : 50);
	     return criteria.list();
	     
		
	}
}