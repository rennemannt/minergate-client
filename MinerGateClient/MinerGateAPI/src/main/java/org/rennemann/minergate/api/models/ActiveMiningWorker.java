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
 * The miner's active worker details.
 *
 * @author Travis Rennemann
 */
public class ActiveMiningWorker {

    private int minersCount;
    private double hashrate;
    private int hashrateRank;

    /**
     * Construct.
     */
    public ActiveMiningWorker() {
    }

    /**
     * Construct.
     *
     * @param minersCount The total number of mining workers for currency
     * @param hashrate The miner's hash rate for this currency
     * @param hashrateRank The miner's hash rate rank in the mining pool
     */
    public ActiveMiningWorker(int minersCount, double hashrate, int hashrateRank) {
        this.minersCount = minersCount;
        this.hashrate = hashrate;
        this.hashrateRank = hashrateRank;
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

}
