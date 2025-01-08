package com.tka_8jan_db;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tka_8jan_entityclass.Actress;

public class DeleteData {
	public void DeleteRecord(Session session) {
	String hqlQuery="Delete from Actress where Aid=:aid";
	Query<Actress>query=session.createQuery(hqlQuery);
	query.setParameter("aid",3 );
	query.executeUpdate();
	System.out.println("Data is Deleted Successfully.....");
	}
}
