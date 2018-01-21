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
 * The user's withdrawal details.
 *
 * @author Travis Rennemann
 */
public class UserWithdrawal {

    private String cc;
    private String address;
    private String transactionHash;
    private double amount;
    private double fee;
    private String paymentId;
    private String transactionId;
    private String status;
    private double created;

    /**
     * Construct.
     */
    public UserWithdrawal() {
    }

    /**
     * Construct.
     *
     * @param cc The crypto currency
     * @param address The address
     * @param transactionHash The transaction hash
     * @param amount The amount of currency withdrawn
     * @param fee The transaction fee
     * @param paymentId The payment ID
     * @param transactionId The transaction ID
     * @param status The transaction status such as finished
     * @param created The time the transaction occurred
     */
    public UserWithdrawal(String cc, String address, String transactionHash, double amount, double fee, String paymentId, String transactionId, String status, double created) {
        this.cc = cc;
        this.address = address;
        this.transactionHash = transactionHash;
        this.amount = amount;
        this.fee = fee;
        this.paymentId = paymentId;
        this.transactionId = transactionId;
        this.status = status;
        this.created = created;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCreated() {
        return created;
    }

    public void setCreated(double created) {
        this.created = created;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

}
