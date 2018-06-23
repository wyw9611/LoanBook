package model;

import java.util.List;
import java.util.stream.Collectors;

public class LoanOnlyOneSpecification implements ISpecification<Member> {
	
	Book wantbook;
	public LoanOnlyOneSpecification(Book book){
		this.wantbook=book;
		
	}
	@Override
	public boolean IsSatisfiedBy(Member entity) {
		
		
		List<Loan> loan=entity.getLoans();

		

		if(loan!=null){

			for(Loan loan1:loan){

				if(wantbook.getISBN()==loan1.getBook().getISBN()){

					System.out.println("您已经借阅了此书，无法再次借阅！");

					return false;

				}

			}

		}

		System.out.println("此书可借阅！");

		return true;

	}
		// TODO Auto-generated method stub
//		model.Loan loan=member.findCurrentLoanFor(book);
//		return loan==null;
//		return entity.getLoans ( ).stream ( ).filter ( loan -> wantbook.getISBN() .equals ( loan.getBook ( ).getISBN() ) && loan.HasNotBeenReturned ( ) ).collect ( Collectors.toList ( ) ).size ( ) ==0;
//		return entity.findCurrentLoanFor(book)==null;
//		return entity.getLoans().stream().filter(loan -> book.getId ( )
//				.equals ( loan.getBook ( ).getId ( ) ) && loan.HasNotBeenReturned ( ))
//				.collect( Collectors.toList ( )).get(0) != null;
	}


