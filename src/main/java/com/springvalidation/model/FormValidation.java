package com.springvalidation.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by David on 2017.04.30..
 */
public class FormValidation
    {

    @NotNull(message = "decmalmax may not be null")
    @DecimalMax("25.00")
    private BigDecimal decmalmax;

    @NotNull(message = "decimalmin may not be null")
    @DecimalMin("8.00")
    private BigDecimal decimalmin;

    @AssertFalse
    private boolean assertfalse;

    @AssertTrue
    private boolean asserttrue;

    @NotNull(message = "digits may not be null")
    @Digits(integer=4, fraction=2)
    BigDecimal digits;

    @NotNull(message = "futuredate may not be null")
    @Future
    @DateTimeFormat(pattern = "dd. MM. yyyy")
    private Date futuredate;

    @NotNull(message = "sizemax may not be null")
    @Max(15)
    private int sizemax;

    @NotNull(message = "sizemin may not be null")
    @Min(7)
    private int sizemin;

    @NotNull(message = "pastdate may not be null")
    @Past
    @DateTimeFormat(pattern = "dd. MM. yyyy")
    private Date pastdate;

    @Pattern(regexp="\\d{8}-\\d{8}-\\d{8}")
    private String bankaccountnumber;

    @NotNull(message = "textcontent may not be null")
    @Size(min=2, max=240)
    private String textcontent;




        public BigDecimal getDecmalmax() {
            return decmalmax;
        }

        public void setDecmalmax(BigDecimal decmalmax) {
            this.decmalmax = decmalmax;
        }

        public BigDecimal getDecimalmin() {
            return decimalmin;
        }

        public void setDecimalmin(BigDecimal decimalmin) {
            this.decimalmin = decimalmin;
        }

        public BigDecimal getDigits() {
            return digits;
        }

        public void setDigits(BigDecimal digits) {
            this.digits = digits;
        }

        public Date getFuturedate() {
            return futuredate;
        }

        public void setFuturedate(Date futuredate) {
            this.futuredate = futuredate;
        }

        public int getSizemax() {
            return sizemax;
        }

        public void setSizemax(int sizemax) {
            this.sizemax = sizemax;
        }

        public int getSizemin() {
            return sizemin;
        }

        public void setSizemin(int sizemin) {
            this.sizemin = sizemin;
        }

        public Date getPastdate() {
            return pastdate;
        }

        public void setPastdate(Date pastdate) {
            this.pastdate = pastdate;
        }

        public String getBankaccountnumber() {
            return bankaccountnumber;
        }

        public void setBankaccountnumber(String bankaccountnumber) {
            this.bankaccountnumber = bankaccountnumber;
        }

        public String getTextcontent() {
            return textcontent;
        }

        public void setTextcontent(String textcontent) {
            this.textcontent = textcontent;
        }

        public boolean isAssertfalse() {
            return assertfalse;
        }

        public void setAssertfalse(boolean assertfalse) {
            this.assertfalse = assertfalse;
        }

        public boolean isAsserttrue() {
            return asserttrue;
        }

        public void setAsserttrue(boolean asserttrue) {
            this.asserttrue = asserttrue;
        }
    }
