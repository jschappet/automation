package com.schappet.weight.dao;

import java.util.Date;
import java.util.List;

import com.schappet.spring.GenericDaoInterface;
import com.schappet.weight.domain.SummaryTable;

/**
 * Generated by Protogen 
 * @since 04/11/2015 07:34:51 CDT
 */
public interface SummaryTableService extends GenericDaoInterface<SummaryTable> {

	public SummaryTable findById( Integer id );
	public SummaryTable findByPersonIdAndDate( Integer id, Date date );
	public List<SummaryTable> latest(int defaultPerson, int i);

}