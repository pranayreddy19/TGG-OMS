package com.tgg.tggoms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.OrderHeader;

@Repository
public class DatabaseRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List getOrderHeader(String orderNumber) {
		
		
		Session session = entityManager.unwrap(Session.class);
		List password = null;
//		String sqlStr = "select CAST(oh.delivery_address as text), oh.order_date, pos_order_number from oms.order_header oh where oh.pos_order_number in (:orderNumber)";
		String sqlStr = "select * from oms.parcel p join oms.package pa on pa.pkg_id=p.pkg_id join oms.order_allocation_header oah on oah.allocation_id=pa.allocation_id join oms.order_header oh on oh.order_id=oah.order_id where oh.pos_order_number in (:orderNumber)";
		try {
			Query query = session.createSQLQuery(sqlStr)
							.setParameter("orderNumber", orderNumber);
			password =  query.getResultList();
			System.out.println("@@@@@@@@@@@@@@@@@@@@"+password.size());
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return password;
		
		
		
		
		
		
		
//			entityManager.unwrap(Session.class); 
//			TypedQuery<OrderHeader> query = entityManager.createQuery("from order_header oh where oh.pos_order_number in (:orderNumber)", OrderHeader.class)
//					.setParameter("orderNumber", orderNumber);
//		 return query.getResultList();
		}
	
	
}
