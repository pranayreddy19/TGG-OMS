package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.OrderLines;

@Repository
public class OrderLinesDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public OrderLines getOrderLines(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("select ol from OrderLines ol join OrderHeader oh on ol.orderHeader=oh.orderId where oh.posOrderNumber in (:orderNumber)")
				.setParameter("orderNumber", orderNumber);

		return (OrderLines) query.getSingleResult();

	}

}
