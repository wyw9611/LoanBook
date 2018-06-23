package model;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member){
		Loan loan=new Loan();
		loan.setBook(book);
		loan.setMember(member);
		loan.setLoanDate(java.time.LocalDateTime.now());
		loan.setReturnDate(java.time.LocalDateTime.now().plusDays(10));
		return loan;
	}

}
