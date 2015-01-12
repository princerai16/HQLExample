package com.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.dto.Book;

public class MyMain {
	public static void main(String args[]){
		
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tra = session.beginTransaction();

//		Book book=new Book("1","Java","Abc","Def",600);
//		session.save(book);
		
		//Book b=(Book) session.get(Book.class,"123");
		
//		Query query = session.createQuery("from com.dto.Book");
//		List <Book>bookList=query.list();
//		
//		for(Book book:bookList){
//			System.out.println("********************************");
//			System.out.println("Code : "+book.getCode());
//			System.out.println("Title : "+book.getTitle());
//			System.out.println("Author : "+book.getAuthor());
//			System.out.println("Publisher : "+book.getPublisher());
//			System.out.println("Price : "+book.getPrice());
//		}
		
//		Query query = session.createQuery("from com.dto.Book where title=? and price=?");
//		query.setString(0,"Java");
//		query.setInteger(1,600);
//		List <Book>bookList=query.list();
//		
//		for(Book book:bookList){
//			System.out.println("********************************");
//			System.out.println("Code : "+book.getCode());
//			System.out.println("Title : "+book.getTitle());
//			System.out.println("Author : "+book.getAuthor());
//			System.out.println("Publisher : "+book.getPublisher());
//			System.out.println("Price : "+book.getPrice());
//		}
		
//		Query query = session.createQuery("select code,title from com.dto.Book");
//		List <Object[]>list=query.list();
//		
//		for(Object obj[]:list){
//			System.out.println("******************************");
//			
//			System.out.println("Code : "+obj[0]);
//			System.out.println("Title : "+obj[1]);
//		}
//		
		
//		Criteria criteria = session.createCriteria(Book.class);
//		List <Book>list=criteria.list();
//		
//		for(Book b:list){
//			
//			System.out.println("******************************");
//			System.out.println("Code : "+b.getCode());
//			System.out.println("Title : "+b.getTitle());
//			System.out.println("Author : "+b.getAuthor());
//			System.out.println("Publisher : "+b.getPublisher());
//			System.out.println("Price : "+b.getPrice());
//			
//		}
		
//		
//		Criteria criteria = session.createCriteria(Book.class);
//		criteria.add(Restrictions.eq("code", "1"));
//		criteria.add(Restrictions.eq("title", "Java"));
//		
//		List <Book>list=criteria.list();
//		
//		for(Book b:list){
//			
//			System.out.println("******************************");
//			System.out.println("Code : "+b.getCode());
//			System.out.println("Title : "+b.getTitle());
//			System.out.println("Author : "+b.getAuthor());
//			System.out.println("Publisher : "+b.getPublisher());
//			System.out.println("Price : "+b.getPrice());
//			
//		}
		
//		Criteria criteria = session.createCriteria(Book.class);
//		ProjectionList projectionList=Projections.projectionList();
//		projectionList.add(Projections.property("code"));
//		projectionList.add(Projections.property("title"));
//		criteria.setProjection(projectionList);
//		
//		
//		List <Object[]>list=criteria.list();
//		
//		for(Object obj[]:list){
//			
//			System.out.println("******************************");
//			System.out.println("Code : "+obj[0]);
//			System.out.println("Title : "+obj[1]);
//			
//		}
		
		
		Criteria criteria = session.createCriteria(Book.class);
		Disjunction d= Restrictions.disjunction();
		
		criteria.add(d.add(Restrictions.eq("code", "1")));
		criteria.add(d.add(Restrictions.eq("author", "abc")));
		
		List <Book>list=criteria.list();
		
		for(Book b:list){
			
			System.out.println("******************************");
			System.out.println("Code : "+b.getCode());
			System.out.println("Title : "+b.getTitle());
			System.out.println("Author : "+b.getAuthor());
		}
		
		
		tra.commit();
		session.close();
	}
}
