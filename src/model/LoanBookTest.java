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
		 member1.setName("张三");
		 book1.setId("1");
		 book1.setISBN("2563871");
		 book1.setTitle("管理信息系统");
		 
		Book book2=new Book();
		book2.setId("2");
		book2.setISBN("25638881");
		book2.setTitle("网络营销");
		
		Book book3=new Book();
		book3.setId("3");
		book3.setISBN("25638881");
		book3.setTitle("网络营销");
		
		 Book book5 = new Book();
		 book5.setId("5");
		 book5.setISBN("5555555");
		 book5.setTitle("java");
		 
		 Book book4 = new Book();
		 book4.setId("4");
		 book4.setISBN("77777");
		 book4.setTitle("数据库");
		 

//		 ISpecification hasNotReachMaxSpecification = new HasNotReachMaxSpecification ( );
//		 member1.getSpecifications ( ).add ( hasNotReachMaxSpecification );
//		member1.Loan(book1); 
//		member1.Loan(book2);
//		member1.Loan(book3);
//		member1.Loan(book4);
//		System.out.println("--------------不能借同一本书----------------------");
//		 ISpecification loanOnlyOneSpecification = new LoanOnlyOneSpecification (book1 );
//		 member1.getSpecifications ( ).add ( loanOnlyOneSpecification );
		 System.out.println("------------借书测试----------------");
		 if(member1.CanLoan(book1)){

	        	member1.Loan(book1);
	        	System.out.println(LocalDateTime.now()+member1.getName()+"成功借阅"+book1.getTitle());

	        }

	        if(member1.CanLoan(book2)){

	        	member1.Loan(book2);
	        	System.out.println(LocalDateTime.now()+member1.getName()+"成功借阅"+book2.getTitle());
	        }

	        
	        System.out.println("------------借同一编码的书测试----------------");
	        if(member1.CanLoan(book3)){

	        	member1.Loan(book3);
	        	 System.out.println(LocalDateTime.now()+member1.getName()+"成功借阅"+book3.getTitle());		
	        }
	        System.out.println("------------借书最大数量测试----------------");
	        if(member1.CanLoan(book4)){

	        	member1.Loan(book4);
	        	 System.out.println(LocalDateTime.now()+member1.getName()+"成功借阅"+book4.getTitle());		
	        }
	        
	        if(member1.CanLoan(book5)){

	        	member1.Loan(book5);
	        	 System.out.println(LocalDateTime.now()+member1.getName()+"成功借阅"+book5.getTitle());		
	        }	        
	        	        System.out.println("------------还书测试----------------");
	        member1.Return(book1);
	        System.out.println(LocalDateTime.now()+member1.getName()+"成功还书"+book1.getTitle());
	 }
		 

	 
	
	
}
