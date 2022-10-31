package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.exception.TggCustomException;
import com.tgg.tggoms.model.OrderHeader;

@Repository
public class OrderHeaderDao {

	@PersistenceContext
	private EntityManager entityManager;

	public OrderHeader getOrderHeader(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		OrderHeader query = null;
		try {
			query = (OrderHeader) session.createQuery("from OrderHeader o where o.posOrderNumber in (:orderNumber)")
					.setParameter("orderNumber", orderNumber)
					.getSingleResult();
		} catch (Exception e) {
			throw new TggCustomException(500,
					"No details are available for given order id", e);
		}
		return query;

	}
}
