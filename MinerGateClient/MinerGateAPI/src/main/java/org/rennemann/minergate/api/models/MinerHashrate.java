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
 * The miner hash rate.
 *
 * @author Travis Rennemann
 */
public class MinerHashrate {

    private double hashrate;
    private String nickname;

    /**
     * Construct.
     */
    public MinerHashrate() {
    }

    /**
     * Construct.
     *
     * @param hashrate The miner's hash rate
     * @param nickname The miner's nickname
     */
    public MinerHashrate(double hashrate, String nickname) {
        this.hashrate = hashrate;
        this.nickname = nickname;
    }

    /**
     * Get the miner's hash rate.
     *
     * @return
     */
    public double getHashrate() {
        return hashrate;
    }

    /**
     * Set the miner's hash rate.
     *
     * @param hashrate The miner's hash rate
     */
    public void setHashrate(double hashrate) {
        this.hashrate = hashrate;
    }

    /**
     * Get the miner's nickname.
     *
     * @return
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Set the miner's nickname.
     *
     * @param nickname The nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
