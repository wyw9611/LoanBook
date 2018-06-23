package model;

public class Loan {
	
	private String Id;

    private java.time.LocalDateTime LoanDate;
    
    private java.time.LocalDateTime DateForReturn;
    
    private java.time.LocalDateTime ReturnDate;
    
    private Book book;
    
    private Member member;
    
    public Boolean HasNotBeenReturned(){
    	return ReturnDate==null;
    }
    
    public void MarkAsReturned(){
    	ReturnDate=java.time.LocalDateTime.now();
    }

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public java.time.LocalDateTime getLoanDate() {
		return LoanDate;
	}

	public void setLoanDate(java.time.LocalDateTime loanDate) {
		LoanDate = loanDate;
	}

	public java.time.LocalDateTime getDateForReturn() {
		return DateForReturn;
	}

	public void setDateForReturn(java.time.LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}

	public java.time.LocalDateTime getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(java.time.LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
