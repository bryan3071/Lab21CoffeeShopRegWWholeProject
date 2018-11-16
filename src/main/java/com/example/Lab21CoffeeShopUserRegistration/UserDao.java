package com.example.Lab21CoffeeShopUserRegistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAll() {
		// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
		// When creating a a query specify the type of the results: Food.class
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM User", User.class).getResultList();
	}
	
	public User findById(Long id) {
		return em.find(User.class, id);
	}
	
	public void update(User user) {
		em.merge(user);
	}
	
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		User user = em.getReference(User.class, id);
		em.remove(user);
	}
	
	public void create(User user) {
		em.persist(user);
	}
	
}
