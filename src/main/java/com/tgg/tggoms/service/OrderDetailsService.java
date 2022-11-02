package com.tgg.tggoms.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgg.tggoms.model.OrderAllocationHeader;
import com.tgg.tggoms.model.OrderAllocationLines;
import com.tgg.tggoms.model.OrderHeader;
import com.tgg.tggoms.model.OrderLines;
import com.tgg.tggoms.model.Packages;
import com.tgg.tggoms.model.Parcel;
import com.tgg.tggoms.repository.OrderAllocationHeaderDao;
import com.tgg.tggoms.repository.OrderAllocationLinesDao;
import com.tgg.tggoms.repository.OrderHeaderDao;
import com.tgg.tggoms.repository.OrderLinesDao;
import com.tgg.tggoms.repository.PackageDao;
import com.tgg.tggoms.repository.ParcelDao;
import com.tgg.tggoms.vo.AddressVO;
import com.tgg.tggoms.vo.CustomersVO;
import com.tgg.tggoms.vo.OrderAllocationHeaderVO;
import com.tgg.tggoms.vo.OrderAllocationLinesVO;
import com.tgg.tggoms.vo.OrderHeaderVO;
import com.tgg.tggoms.vo.OrderLinesVO;
import com.tgg.tggoms.vo.PackagesVO;
import com.tgg.tggoms.vo.ParcelVO;
import com.tgg.tggoms.vo.ShipmentVO;

@Service
public class OrderDetailsService {

	@Autowired
	OrderHeaderDao orderHeaderDao;

	@Autowired
	OrderLinesDao orderLinesDao;
	
	@Autowired
	OrderAllocationHeaderDao orderAllocationHeaderDao;
	
	@Autowired
	OrderAllocationLinesDao orderAllocationLinesDao;
	
	@Autowired
	PackageDao packageDao;
	
	@Autowired
	ParcelDao parcelDao;

	public OrderHeaderVO getOrderHeader(String orderNumber) {
		OrderHeader orderHeader = orderHeaderDao.getOrderHeader(orderNumber);
		
		OrderHeaderVO orderHeaderVO = new OrderHeaderVO();
		CustomersVO customerVO = new CustomersVO();
		customerVO.setFirstName(orderHeader.getCustomerId().getFirstName());
		customerVO.setLastName(orderHeader.getCustomerId().getLastName());
		customerVO.setDisplayName(orderHeader.getCustomerId().getLastName());
		customerVO.setEmail(orderHeader.getCustomerId().getEmail());
		customerVO.setPosCustomerNbr(orderHeader.getCustomerId().getPosCustomerNbr());
		customerVO.setCustRegName(orderHeader.getCustomerId().getCustRegName());
		customerVO.setCustType(orderHeader.getCustomerId().getCustType());
		orderHeaderVO.setCustomerDetails(customerVO);
		orderHeaderVO.setDeliveryAddress(orderHeader.getDeliveryAddress());
		orderHeaderVO.setExternalOrderReference(orderHeader.getExternalOrderReference());
		orderHeaderVO.setOrderDate(orderHeader.getOrderDate());
		orderHeaderVO.setOrderLocationNbr(orderHeader.getOrderLocationNbr());
		orderHeaderVO.setOrderNumber(orderHeader.getOrderNumber());
		orderHeaderVO.setOrderSource(orderHeader.getOrderSource());
		orderHeaderVO.setOrderStatus(orderHeader.getOrderStatus());
		orderHeaderVO.setPosOrderNumber(orderHeader.getPosOrderNumber());
		Set<OrderAllocationHeaderVO> orderAllocationHeaderVOs = new HashSet<>();
		for(OrderAllocationHeader orderAllocationvo: orderHeader.getOrderAllocationHeader()) {
			OrderAllocationHeaderVO orderAllocationVO = new OrderAllocationHeaderVO();
			orderAllocationVO.setActualDeliveryDate(orderAllocationvo.getActualDeliveryDate());
			orderAllocationVO.setAllocationNumber(orderAllocationvo.getAllocationNumber());
			orderAllocationVO.setFulfilmentProvider(orderAllocationVO.getFulfilmentProvider());
			orderAllocationVO.setPickingSlaTime(orderAllocationvo.getPickingSlaTime());
			Set<OrderAllocationLinesVO> orderAllocationLinesVOs = new HashSet<>();
			for(OrderAllocationLines orderAllocationLines: orderAllocationvo.getOrderAllocationLines()) {
				OrderAllocationLinesVO orderAllocationLinesvo = new OrderAllocationLinesVO();
				orderAllocationLinesvo.setFulfilmentLineStatus(orderAllocationLines.getFulfilmentLineStatus());
				orderAllocationLinesvo.setPackedQty(orderAllocationLines.getPackedQty());
				orderAllocationLinesvo.setPickedQty(orderAllocationLines.getPickedQty());
				OrderLinesVO orderLinesVO = new OrderLinesVO();
				orderLinesVO.setLineNbr(orderAllocationLines.getOrderLines().getLineNbr());
				orderLinesVO.setLineStatus(orderAllocationLines.getOrderLines().getLineStatus());
				orderLinesVO.setProdNbr(orderAllocationLines.getOrderLines().getProdNbr());
				orderAllocationLinesvo.setOrderLines(orderLinesVO);
				orderAllocationLinesVOs.add(orderAllocationLinesvo);
			}
			orderAllocationVO.setOrderAllocationLines(orderAllocationLinesVOs);
			Set<PackagesVO> packagesvos = new HashSet<>();
			for(Packages packages: orderAllocationvo.getPackages()) {
				PackagesVO packagevo = new PackagesVO();
				packagevo.setCourier(orderNumber);
				packagevo.setJourneyId(orderNumber);
				packagevo.setPkgStatus(orderNumber);
				AddressVO addressVO = new AddressVO();
				addressVO.setAddressType(packages.getAddress().getAddressType());
				addressVO.setAddrLine1(packages.getAddress().getAddrLine1());
				addressVO.setAddrLine2(packages.getAddress().getAddrLine2());
				addressVO.setAddrLine3(packages.getAddress().getAddrLine3());
				addressVO.setCity(packages.getAddress().getCity());
				addressVO.setCountry(packages.getAddress().getCountry());
				addressVO.setDetail(packages.getAddress().getDetail());
				addressVO.setIsActive(packages.getAddress().isActive());
				addressVO.setMobileNumber(packages.getAddress().getMobileNumber());
				addressVO.setPhoneNumber(packages.getAddress().getPhoneNumber());
				addressVO.setPostCode(packages.getAddress().getPostCode());
				addressVO.setState(packages.getAddress().getState());
				packagevo.setAddress(addressVO);
				ShipmentVO shipmentvo = new ShipmentVO();
				shipmentvo.setConsignmentNumber(packages.getShipment().getConsignmentNumber());
				shipmentvo.setDespatchDate(packages.getShipment().getDespatchDate());
				shipmentvo.setDetails(packages.getShipment().getDetails());
				shipmentvo.setStatus(packages.getShipment().getStatus());
				packagevo.setShipment(shipmentvo);
//				packagevo.setShipment(null);
				Set<ParcelVO> parcelvos = new HashSet<>();
				for(Parcel parcel: packages.getParcel()) {
					ParcelVO parcelvo = new ParcelVO();
					parcelvo.setParcelDesc(parcel.getParcelDesc());
					parcelvo.setParcelSpec(parcel.getParcelSpec());
					parcelvo.setParcelStatus(parcel.getParcelStatus());
					parcelvo.setUnitOfMeasure(parcel.getUnitOfMeasure());
					parcelvo.setLineDetails(parcel.getLineDetails());
					parcelvos.add(parcelvo);
				}
				packagevo.setParcel(parcelvos);
				packagesvos.add(packagevo);
			}
			orderAllocationVO.setPackages(packagesvos);
//			Set<ShipmentVO> shipmentvos = new HashSet<>();
//			for(Shipment shipment: orderAllocationvo.getShipment()) {
//				ShipmentVO shipmentvo = new ShipmentVO();
//				shipmentvo.setConsignmentNumber(shipment.getConsignmentNumber());
//				shipmentvo.setDespatchDate(shipment.getDespatchDate());
//				shipmentvo.setDetails(shipment.getDetails());
//				shipmentvo.setStatus(shipment.getStatus());
//				shipmentvos.add(shipmentvo);
//			}
////			orderAllocationVO.setShipment(null);
//			orderAllocationVO.setShipment(shipmentvos);
			orderAllocationHeaderVOs.add(orderAllocationVO);
		}
		orderHeaderVO.setOrderAllocationHeader(orderAllocationHeaderVOs);
		Set<OrderLinesVO> orderLinesvos = new HashSet<>();
		for(OrderLines orderLines: orderHeader.getOrderLines()) {
			OrderLinesVO orderLinesVO = new OrderLinesVO();
			orderLinesVO.setLineNbr(orderLines.getLineNbr());
			orderLinesVO.setLineStatus(orderLines.getLineStatus());
			orderLinesVO.setProdNbr(orderLines.getProdNbr());
			orderLinesvos.add(orderLinesVO);
		}
		orderHeaderVO.setOrderLines(orderLinesvos);
		return orderHeaderVO;
	}

	public OrderLines getOrderLines(String orderNumber) {
		return orderLinesDao.getOrderLines(orderNumber);
	}
	
	public OrderAllocationHeader getOrderAllocationHeader(String orderNumber) {
		return orderAllocationHeaderDao.getOrderAllocationHeader(orderNumber);
	}
	
	public OrderAllocationLines getOrderOrderAllocationLines(String orderNumber) {
		return orderAllocationLinesDao.getOrderLines(orderNumber);
	}
	
	public Packages getPackages(String orderNumber) {
		return packageDao.getPackage(orderNumber);
	}
	
	public Parcel getParcel(String orderNumber) {
		return parcelDao.getParcel(orderNumber);
	}

}
