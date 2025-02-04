package dev.mark.currency_exchange_service;

import java.math.BigDecimal;

public class CurrencyExchange {
    private Long id;
    private String from;
    private String to;
    private BigDecimal convertionMultiple;
    
    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal convertionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convertionMultiple = convertionMultiple;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConvertionMultiple() {
        return convertionMultiple;
    }

    public void setConvertionMultiple(BigDecimal convertionMultiple) {
        this.convertionMultiple = convertionMultiple;
    }

    
}
