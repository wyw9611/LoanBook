package model;

import java.util.List;

public class HasNotReachMaxSpecification implements ISpecification<Member> {


	
	@Override
	public boolean IsSatisfiedBy(Member entity) {
		// TODO Auto-generated method stub
		List<Loan> loan=entity.getLoans();

		int number=0;

		

		if(loan!=null){

			for(Loan loan1:loan){

				number=number+1;

			}

		} 

		if(number<3){

			return true;

		}

		System.out.println("您借书已达3本，无法再借阅！");

		return false;
	}
	
}
