/*
 * Copyright 2018 Travis Rennemann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rennemann.minergate.api.models;

/**
 * User invoice.
 *
 * @author Travis Rennemann
 */
public class UserInvoice {

    private double amount;
    private CryptoCurrency cc;
    private String address;
    private String comment;
    private long expiredDate;
    private String invoiceId;
    private long created;
    private String status;
    private String email;
    private long finished;

    /**
     * Construct.
     */
    public UserInvoice() {
    }

    /**
     * Construct.
     *
     * @param amount
     * @param cc
     * @param address
     * @param comment
     * @param expiredDate
     * @param invoiceId
     * @param created
     * @param status
     * @param email
     * @param finished
     */
    public UserInvoice(double amount, CryptoCurrency cc, String address, String comment, long expiredDate, String invoiceId, long created, String status, String email, long finished) {
        this.amount = amount;
        this.cc = cc;
        this.address = address;
        this.comment = comment;
        this.expiredDate = expiredDate;
        this.invoiceId = invoiceId;
        this.created = created;
        this.status = status;
        this.email = email;
        this.finished = finished;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CryptoCurrency getCc() {
        return cc;
    }

    public void setCc(CryptoCurrency cc) {
        this.cc = cc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(long expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getFinished() {
        return finished;
    }

    public void setFinished(long finished) {
        this.finished = finished;
    }

}
