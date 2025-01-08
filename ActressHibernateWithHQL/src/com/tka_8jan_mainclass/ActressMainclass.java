package com.tka_8jan_mainclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka_8jan_db.DeleteData;
import com.tka_8jan_db.GetAllData;
import com.tka_8jan_db.GetSingleData;
import com.tka_8jan_db.InsertData;
import com.tka_8jan_db.UpdateData;
import com.tka_8jan_entityclass.Actress;

public class ActressMainclass {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Actress.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
        //**DATA IS InsertData	
//		InsertData I=new InsertData();
//		I.InsertRecord(ss);
//		tr.commit();
//		ss.close();
		
        //**DATA IS UPDATED DATA
//		UpdateData U=new UpdateData();
//		U.UpdateRecord(ss);
//		tr.commit();
//		ss.close();
		
        //**DATA IS DELETED
//		DeleteData D=new DeleteData();
//		D.DeleteRecord(ss);
//		tr.commit();
//		ss.close();
		
        //**DATA IS GETSINGLE RECORD
//		GetSingleData GS=new GetSingleData();
//		GS.GetSingleRecord(ss);
       
		//** DATA IS GETALL RECORD
		GetAllData GA=new GetAllData();
		GA.GetAllRecord(ss);
		
		
	}
	
	

}
