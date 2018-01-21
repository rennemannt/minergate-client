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
 * The user's transfer details.
 *
 * @author Travis Rennemann
 */
public class UserTransfer {

    private String cc;
    private long amount;
    private String fromUserId;
    private String toUserId;
    private String id;
    private String state;
    private double created;

    /**
     * Construct.
     */
    public UserTransfer() {
    }

    /**
     * Construct.
     *
     * @param cc The crypto currency
     * @param amount The amount transferred
     * @param fromUserId The transaction originator's e-mail address
     * @param toUserId The transaction receiver's e-mail address
     * @param id The hash
     * @param state The state of the transaction such as finished
     * @param created When the transaction was created
     */
    public UserTransfer(String cc, long amount, String fromUserId, String toUserId, String id, String state, double created) {
        this.cc = cc;
        this.amount = amount;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.id = id;
        this.state = state;
        this.created = created;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getCreated() {
        return created;
    }

    public void setCreated(double created) {
        this.created = created;
    }

}
