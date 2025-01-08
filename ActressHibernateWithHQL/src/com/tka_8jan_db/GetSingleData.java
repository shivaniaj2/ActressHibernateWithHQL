package com.tka_8jan_db;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tka_8jan_entityclass.Actress;

public class GetSingleData {
	public void GetSingleRecord(Session session) {
		String hqlQuery="from Actress where Aid=:aid";
		Query<Actress>query=session.createQuery(hqlQuery);
		
		query.setParameter("aid", 2);
		Actress A=query.getSingleResult();
		System.out.println(A);
		
		System.out.println("DATA IS GETSINGLE RECORD"); 
		
	}

}
