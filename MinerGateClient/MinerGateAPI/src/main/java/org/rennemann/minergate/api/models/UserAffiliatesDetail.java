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

import java.util.HashMap;
import java.util.Map;

/**
 * User affiliate detail.
 *
 * @author Travis Rennemann
 */
public class UserAffiliatesDetail {

    private long registered;
    private Map<String, Double> profits = new HashMap<>();
    private double lastProfit;
    private String token;

    /**
     * Construct.
     */
    public UserAffiliatesDetail() {
    }

    /**
     * Construct.
     *
     * @param registered
     * @param lastProfit
     * @param token
     */
    public UserAffiliatesDetail(long registered, double lastProfit, String token) {
        this.registered = registered;
        this.lastProfit = lastProfit;
        this.token = token;
    }

    public long getRegistered() {
        return registered;
    }

    public void setRegistered(long registered) {
        this.registered = registered;
    }

    public Map<String, Double> getProfits() {
        return profits;
    }

    public void setProfits(Map<String, Double> profits) {
        this.profits = profits;
    }

    public double getLastProfit() {
        return lastProfit;
    }

    public void setLastProfit(double lastProfit) {
        this.lastProfit = lastProfit;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
