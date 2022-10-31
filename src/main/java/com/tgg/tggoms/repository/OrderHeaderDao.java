package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.OrderHeader;

@Repository
public class OrderHeaderDao {

	@PersistenceContext
	private EntityManager entityManager;

	public OrderHeader getOrderHeader(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("from OrderHeader o where o.posOrderNumber in (:orderNumber)")
				.setParameter("orderNumber", orderNumber);

		return (OrderHeader) query.getSingleResult();

	}
}
