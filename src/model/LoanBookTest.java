package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Test;

public class LoanBookTest {
	@Test
	 public void main() {
		 
		
		 Book book1 = new Book();
		 Member member1 = new Member();
		 member1.setId("001");
		 member1.setName("����");
		 book1.setId("1");
		 book1.setISBN("2563871");
		 book1.setTitle("������Ϣϵͳ");
		 
		Book book2=new Book();
		book2.setId("2");
		book2.setISBN("25638881");
		book2.setTitle("����Ӫ��");
		
		Book book3=new Book();
		book3.setId("3");
		book3.setISBN("25638881");
		book3.setTitle("����Ӫ��");
		
		 Book book5 = new Book();
		 book5.setId("5");
		 book5.setISBN("5555555");
		 book5.setTitle("java");
		 
		 Book book4 = new Book();
		 book4.setId("4");
		 book4.setISBN("77777");
		 book4.setTitle("���ݿ�");
		 

//		 ISpecification hasNotReachMaxSpecification = new HasNotReachMaxSpecification ( );
//		 member1.getSpecifications ( ).add ( hasNotReachMaxSpecification );
//		member1.Loan(book1); 
//		member1.Loan(book2);
//		member1.Loan(book3);
//		member1.Loan(book4);
//		System.out.println("--------------���ܽ�ͬһ����----------------------");
//		 ISpecification loanOnlyOneSpecification = new LoanOnlyOneSpecification (book1 );
//		 member1.getSpecifications ( ).add ( loanOnlyOneSpecification );
		 System.out.println("------------�������----------------");
		 if(member1.CanLoan(book1)){

	        	member1.Loan(book1);
	        	System.out.println(LocalDateTime.now()+member1.getName()+"�ɹ�����"+book1.getTitle());

	        }

	        if(member1.CanLoan(book2)){

	        	member1.Loan(book2);
	        	System.out.println(LocalDateTime.now()+member1.getName()+"�ɹ�����"+book2.getTitle());
	        }

	        
	        System.out.println("------------��ͬһ����������----------------");
	        if(member1.CanLoan(book3)){

	        	member1.Loan(book3);
	        	 System.out.println(LocalDateTime.now()+member1.getName()+"�ɹ�����"+book3.getTitle());		
	        }
	        System.out.println("------------���������������----------------");
	        if(member1.CanLoan(book4)){

	        	member1.Loan(book4);
	        	 System.out.println(LocalDateTime.now()+member1.getName()+"�ɹ�����"+book4.getTitle());		
	        }
	        
	        if(member1.CanLoan(book5)){

	        	member1.Loan(book5);
	        	 System.out.println(LocalDateTime.now()+member1.getName()+"�ɹ�����"+book5.getTitle());		
	        }	        
	        	        System.out.println("------------�������----------------");
	        member1.Return(book1);
	        System.out.println(LocalDateTime.now()+member1.getName()+"�ɹ�����"+book1.getTitle());
	 }
		 

	 
	
	
}
