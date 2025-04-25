package com.kamal.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_details")
public class TransactionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "transaction_date_time")
    private LocalDateTime transactionDateTime;

    @Column(name = "source_id")
    private Integer sourceId;

    @Column(name = "target_id")
    private Integer targetId;

    @Column(name = "source_type")
    private String sourceType;

    @Column(name = "destination_type")
    private String destinationType;

    @Column(name = "transaction_amount", precision = 10, scale = 2)
    private BigDecimal transactionAmount;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getTargetId() {
		return targetId;
	}

	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getDestinationType() {
		return destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

}
