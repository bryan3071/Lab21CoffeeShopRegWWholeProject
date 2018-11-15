package com.example.Lab21CoffeeShopUserRegistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CartItemDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<CartItem> findAll() {
		return em.createQuery("FROM CartItem", CartItem.class).getResultList();
		
	}
	
	public void create(CartItem cartItem) {
		// TODO Auto-generated method stub
		em.persist(cartItem);
	}

}
