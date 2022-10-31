package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.OrderAllocationLines;

@Repository
public class OrderAllocationLinesDao {
	@PersistenceContext
	private EntityManager entityManager;

	public OrderAllocationLines getOrderLines(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery(
				"select oal from OrderAllocationLines oal join OrderAllocationHeader oah on oah.allocationId=oal.orderAllocationHeader join OrderHeader oh on oh.orderId=oah.orderHeader where oh.posOrderNumber in (:orderNumber)")
				.setParameter("orderNumber", orderNumber);

		return (OrderAllocationLines) query.getSingleResult();

	}

}
