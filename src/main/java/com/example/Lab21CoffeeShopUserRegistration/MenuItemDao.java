package com.example.Lab21CoffeeShopUserRegistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



@Repository
@Transactional
public class MenuItemDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<MenuItem> findAll() {
		return em.createQuery("FROM MenuItem", MenuItem.class).getResultList();
		
	}

	public void create(MenuItem menuItem) {
		// TODO Auto-generated method stub
		em.persist(menuItem);
	}
}
