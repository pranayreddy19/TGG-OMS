package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.OrderAllocationHeader;

@Repository
public class OrderAllocationHeaderDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public OrderAllocationHeader getOrderAllocationHeader(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery(
				"select oah from OrderAllocationHeader oah join OrderHeader oh on oah.orderHeader=oh.orderId where oh.posOrderNumber in (:orderNumber)")
				.setParameter("orderNumber", orderNumber);

		return (OrderAllocationHeader) query.getSingleResult();

	}

}
