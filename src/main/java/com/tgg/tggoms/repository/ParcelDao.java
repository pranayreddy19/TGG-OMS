package com.tgg.tggoms.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tgg.tggoms.model.Parcel;

@Repository
public class ParcelDao {
	@PersistenceContext
	private EntityManager entityManager;

	public Parcel getParcel(String orderNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery(
				"select p from Parcel p join Packages pa on pa.pkgId=p.packages join OrderAllocationHeader oah on oah.allocationId=pa.orderAllocationHeader join OrderHeader oh on oh.orderId=oah.orderHeader where oh.posOrderNumber in (:orderNumber)")
				.setParameter("orderNumber", orderNumber);

		return (Parcel) query.getSingleResult();

	}

}
