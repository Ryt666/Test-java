package by.grsu.ppotapova.payment.web.dto;

import java.sql.Timestamp;

public class TransactionDto {

	private Integer id;

	private Long number;

	private Integer bankAccountId;

	private Long bankAccountNumber;
	
	private Integer amount;
	
	private String currency;
	
	private String type;
	
	private Timestamp date;
	
	private String comment;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Integer bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Long getbankAccountNumber() {
		return bankAccountnumber;
	}

	public void setbankAccountNumber(Long bankAccountnumber) {
		this.bankAccountnumber = bankAccountnumber;
	}

}