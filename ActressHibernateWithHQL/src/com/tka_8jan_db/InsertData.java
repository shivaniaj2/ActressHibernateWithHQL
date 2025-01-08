package com.tka_8jan_db;

import org.hibernate.Session;
import org.hibernate.query.MutationQuery;

public class InsertData {
	public void InsertRecord(Session session) {
		String hqlQuery="insert into Actress(Aid,Aname,Aage,ADomain)values(:aid,:aname,:aage,:adomain)";
		MutationQuery query=session.createMutationQuery(hqlQuery);
		query.setParameter("aid",5 );
		query.setParameter("aname","Alia bhat");
		query.setParameter("aage", 37);
		query.setParameter("adomain", "Bolliwood");
		
		query.executeUpdate();
		System.out.println("Data is Inserted Successfully...."); 
		
		
		
	}
	

}
