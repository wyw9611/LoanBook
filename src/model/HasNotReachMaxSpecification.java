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

		System.out.println("�������Ѵ�3�����޷��ٽ��ģ�");

		return false;
	}
	
}
