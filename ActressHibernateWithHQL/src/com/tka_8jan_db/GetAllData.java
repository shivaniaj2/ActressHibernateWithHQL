package com.tka_8jan_db;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tka_8jan_entityclass.Actress;

public class GetAllData {
	public void GetAllRecord(Session session) {
		String hqlQuery="from Actress";
		Query<Actress>query=session.createQuery(hqlQuery,Actress.class);
		List<Actress>list=query.getResultList();
		
		for(Actress actress:list) {
			System.out.println(actress);
		}
		
	}

}
