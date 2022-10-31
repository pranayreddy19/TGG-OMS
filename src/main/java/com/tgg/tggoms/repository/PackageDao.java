package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.Packages;

@Repository
public class PackageDao {
	@PersistenceContext
	private EntityManager entityManager;

	public Packages getPackage(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery(
				"select p from Packages p join OrderAllocationHeader oah on oah.allocationId=p.orderAllocationHeader join OrderHeader oh on oh.orderId=oah.orderHeader where oh.posOrderNumber in (:orderNumber)")
				.setParameter("orderNumber", orderNumber);

		return (Packages) query.getSingleResult();

	}

}
