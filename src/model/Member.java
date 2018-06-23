package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Member {
	
	private String Id;
	
	private String Name;
	
	private ArrayList<Loan> Loans = new ArrayList<Loan>();
	
	 private List < ISpecification < Member > > specifications = new ArrayList <> ( );
	 
		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public ArrayList<Loan> getLoans() {
			return Loans;
		}

		public void setLoans(ArrayList<Loan> loans) {
			Loans = loans;
		}
	
	public final void Return(Book book){
		model.Loan loan = findCurrentLoanFor(book);
		if(loan!=null){
			loan.MarkAsReturned();
			book.setLoanTo(null);
			System.out.println("还书成功");
		}
	}
	
	public final boolean CanLoan(Book book){
		if(book.getLoanTo()!=null){

			System.out.println("该书已借出，借书失败！");

			return false;

		}else{

			HasNotReachMaxSpecification hasReachMaxSpecification=new HasNotReachMaxSpecification();

			if( !hasReachMaxSpecification.IsSatisfiedBy(this)){

				return false;

			}

			LoanOnlyOneSpecification loanOnlyOneSpecification=new LoanOnlyOneSpecification(book);

			return loanOnlyOneSpecification.IsSatisfiedBy(this);

		}
//		ISpecification<Member> hasNotReachMax=new model.HasNotReachMaxSpecification();
//		ISpecification<Member> loanOnlyOne=new model.LoanOnlyOneSpecification(book);
//		return hasNotReachMax.IsSatisfiedBy(this)&&loanOnlyOne.IsSatisfiedBy(this)&&book.getLoanTo()==null;
//		return book.getLoanTo()==null&&validate();
		
		
	}

	public final Loan Loan(Book book){
		Loan loan = new Loan();
		if(CanLoan(book)){
			loan.setBook(book);
			loan.setMember(this);
			this.getLoans().add(loan);
			System.out.println("借书成功");
			return loan;
		}
		System.out.println("借书失败");
		return loan;
	}
	


	 public Loan findCurrentLoanFor ( Book book ) {
		 System.out.println("您所还的书id:"+book.getId()+"-ISBN:"+book.getISBN()+"-Titil:"+book.getTitle());
		 
		 return getLoans ( ).stream ( )
	                .filter ( loan -> book.getId ( ).equals ( loan.getBook ( ).getId ( ) ) && loan.HasNotBeenReturned ( ) )
	                .collect ( Collectors.toList ( ) )
	                .get ( 0 );
		 
//		 List < Loan > collect = getLoans ( ).stream ( )
//
//	                .filter ( loan -> book.getId ( ).equals ( loan.getBook ( ).getId ( ) ) && loan.HasNotBeenReturned ( ) )
//
//	                .collect ( Collectors.toList ( ) );
//
//	        if ( collect.size ( ) > 0 ) {
//
//	            return collect.get ( 0 );
//
//	        }
//
//	        return null;
	        
	    }



	
//	private boolean validate(){
//		System.out.println("-----");
//		boolean result = false;
//		for(ISpecification<Member> spec:specifications){
//			result = spec.IsSatisfiedBy(this);
//			System.out.println("满足规则");
//			if(!result)
//				System.out.println("不满足规则");
//				return false;
//		}
//		return result;
//		
//	}
//	 public List < ISpecification < Member > > getSpecifications ( ) {
//
//
//
//	        return specifications;
//
//	    }
//
//
//
//	    public void setSpecifications ( List < ISpecification < Member > > specifications ) {
//
//
//
//	        this.specifications = specifications;
//
//	    }
}
