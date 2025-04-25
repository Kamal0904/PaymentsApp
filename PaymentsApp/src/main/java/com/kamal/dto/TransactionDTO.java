package com.kamal.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDTO{
    private Integer transactionId;
    private LocalDateTime transactionDateTime;
    private Integer sourceId;
    private Integer targetId;
    private String sourceType;
    private String destinationType;
    private BigDecimal transactionAmount;

    // Constructors
    public TransactionDTO() {
    }

    public TransactionDTO(Integer transactionId, LocalDateTime transactionDateTime, Integer sourceId,
                           Integer targetId, String sourceType, String destinationType, BigDecimal transactionAmount) {
        this.transactionId = transactionId;
        this.transactionDateTime = transactionDateTime;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.sourceType = sourceType;
        this.destinationType = destinationType;
        this.transactionAmount = transactionAmount;
    }

    // Getters and Setters
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

