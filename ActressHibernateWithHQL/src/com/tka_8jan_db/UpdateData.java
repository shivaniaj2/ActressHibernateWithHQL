package com.tka_8jan_db;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tka_8jan_entityclass.Actress;

public class UpdateData {
	public void UpdateRecord(Session session) {
		String hqlQuery="Update Actress set ADomain=:adomain where Aid=:aid";
		Query<Actress>query=session.createQuery(hqlQuery);
		query.setParameter("adomain", "Holliwood");
		query.setParameter("aid", 5);
		
		query.executeUpdate();
		System.out.println("Data is Updated Successfully.....");
		
	}

}
