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

import java.util.ArrayList;
import java.util.List;

/**
 * The user's mining statistics.
 *
 * @author Travis Rennemann
 */
public class UserMiningStat {

    private double unconfirmedBalance;
    private int minersCount;
    private double hashrate;
    private int hashrateRank;
    private boolean minerOnline;
    private List<MiningShare> shares = new ArrayList<>();

    /**
     * Construct.
     */
    public UserMiningStat() {
    }

    /**
     * Construct.
     *
     * @param unconfirmedBalance
     * @param minersCount
     * @param hashrate
     * @param hashrateRank
     * @param minerOnline
     */
    public UserMiningStat(double unconfirmedBalance, int minersCount, double hashrate, int hashrateRank, boolean minerOnline) {
        this.unconfirmedBalance = unconfirmedBalance;
        this.minersCount = minersCount;
        this.hashrate = hashrate;
        this.hashrateRank = hashrateRank;
        this.minerOnline = minerOnline;
    }

    public double getUnconfirmedBalance() {
        return unconfirmedBalance;
    }

    public void setUnconfirmedBalance(double unconfirmedBalance) {
        this.unconfirmedBalance = unconfirmedBalance;
    }

    public int getMinersCount() {
        return minersCount;
    }

    public void setMinersCount(int minersCount) {
        this.minersCount = minersCount;
    }

    public double getHashrate() {
        return hashrate;
    }

    public void setHashrate(double hashrate) {
        this.hashrate = hashrate;
    }

    public int getHashrateRank() {
        return hashrateRank;
    }

    public void setHashrateRank(int hashrateRank) {
        this.hashrateRank = hashrateRank;
    }

    public boolean isMinerOnline() {
        return minerOnline;
    }

    public void setMinerOnline(boolean minerOnline) {
        this.minerOnline = minerOnline;
    }

    public List<MiningShare> getShares() {
        return shares;
    }

    public void setShares(List<MiningShare> shares) {
        this.shares = shares;
    }

}
