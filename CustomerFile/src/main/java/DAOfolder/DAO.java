package DAOfolder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import CustomerInfo.Customer;

//Applies JPA to allow objects to be written to database, also known as ORM (object-relational mapping)

public class DAO {

	public void addCustomer(String fname, String lname, String dayOfBirth, String yearOfBirth, String monthOfBirth,
			String homeAddress, String phoneAreaCode, String phoneNumber, String email, String canadianTaxRes,
			String usTaxRes, String otherTaxRes) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();

		Customer cust = new Customer();
		cust.setFirstName(fname);
		cust.setLastName(lname);
		cust.setDayOfBirth(dayOfBirth);
		cust.setYearOfBirth(yearOfBirth);
		cust.setMonthOfBirth(monthOfBirth);
		cust.setHomeAddress(homeAddress);
		cust.setPhoneAreaCode(phoneAreaCode);
		cust.setPhoneNumber(phoneNumber);
		cust.setEmail(email);
		cust.setCanadianTaxRes(canadianTaxRes);
		cust.setUsTaxRes(usTaxRes);
		cust.setOtherTaxRes(otherTaxRes);

		entityManager.persist(cust);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
	
	public Customer getCustomer(String primaryKey) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();	
		Customer cust = entityManager.find(Customer.class, primaryKey);
		return cust;
	}
	
	//Use to find customer by first and last name if both is provided
	//will enter this method to see if so
	
	public Customer getCustomer(String firstName, String lastName) {
		
		if(lastName.equals("")) {
			return getCustomer(firstName);
		}
		else {
			return null;
		}
		
	}
	
	//Code to search client by phone number
	public Customer getCustomerByPhoneNumber(String areaCode, String phoneNumber) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();
		String query = "SELECT c FROM Customer c WHERE c.phoneAreaCode = :AreaCode AND c.phoneNumber = :Number";


		
		TypedQuery<Customer> tq = entityManager.createQuery(query, Customer.class);
		tq.setParameter("AreaCode", areaCode);
		tq.setParameter("Number", phoneNumber);
		Customer cust = null;
		try {
			cust = tq.getSingleResult();
		}catch(NoResultException ex) {
			ex.printStackTrace();
			System.out.println("Error block executed");
			return cust;
		}finally {
			entityManager.close();
		}
		
		
		System.out.println(cust);
		return cust;
	}
	
	
	
	
	public Customer editPersonInfo(String day, String month, String year, String primaryKey) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Customer cust = entityManager.find(Customer.class, primaryKey);
		cust.setDayOfBirth(day);
		cust.setMonthOfBirth(month);
		cust.setYearOfBirth(year);	
		entityManager.persist(cust);
		entityManager.getTransaction().commit();
		
		return cust;
		
		
	}
	
	
	public Customer editHomeAddress(String homeAddress, String primaryKey) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Customer cust = entityManager.find(Customer.class, primaryKey);
		cust.setHomeAddress(homeAddress);
		
		entityManager.persist(cust);
		entityManager.getTransaction().commit();
		
		return cust;
	}
	
	public Customer editContactInfo(String areaCode, String phoneNumber, String email, String primaryKey) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Customer cust = entityManager.find(Customer.class, primaryKey);
		cust.setPhoneAreaCode(areaCode);
		cust.setPhoneNumber(phoneNumber);
		cust.setEmail(email);
		entityManager.persist(cust);
		entityManager.getTransaction().commit();
		return cust;
		
	}
	public Customer editTaxResidency(String newCanadaTax, String newUSTax, String newOtherTax, String primaryKey) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("per");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Customer cust = entityManager.find(Customer.class, primaryKey);
		cust.setCanadianTaxRes(newCanadaTax);
		cust.setUsTaxRes(newUSTax);
		cust.setOtherTaxRes(newOtherTax);
		
		entityManager.persist(cust);
		entityManager.getTransaction().commit();
		
		return cust;
	}

}
