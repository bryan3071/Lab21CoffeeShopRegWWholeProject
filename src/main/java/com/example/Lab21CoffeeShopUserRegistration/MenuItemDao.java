package com.example.Lab21CoffeeShopUserRegistration;

import java.util.List;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



//import co.grandcircus.foodsorm.entity.Food;



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
	
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		MenuItem menuItem = em.getReference(MenuItem.class, id);
		em.remove(menuItem);
}
	
	public void update(MenuItem MenuItem) {
		em.merge(MenuItem);
	}

	public Drinks findById(Long id) {
		return em.find(Drinks.class, id);
		// TODO Auto-generated method stub
		
	}
}
