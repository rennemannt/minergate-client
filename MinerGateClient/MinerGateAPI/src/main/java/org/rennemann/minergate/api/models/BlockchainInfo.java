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
 * Blockchain information.
 *
 * @author Travis Rennemann
 */
public class BlockchainInfo {

    private String hash;
    private long height;
    private boolean orphan;
    private double timestamp;
    private long difficulty;
    private String prevBlockHash;
    private long sizeMedian;
    private long blockSize;
    private long txCumulativeSize;
    private long txCount;
    private double baseReward;
    private double penalty;
    private double reward;
    private double feeSumm;
    private double alreadyGeneratedCoins;
    private long cumulativeTxCount;
    private long rewardBlocksWindow;
    private long fullRewardMaxBlockSize;
    private double instantHashrate;

    public BlockchainInfo() {
    }

    public BlockchainInfo(String hash, long height, boolean orphan, double timestamp, long difficulty, String prevBlockHash, long sizeMedian, long blockSize, long txCumulativeSize, long txCount, double baseReward, double penalty, double reward, double feeSumm, double alreadyGeneratedCoins, long cumulativeTxCount, long rewardBlocksWindow, long fullRewardMaxBlockSize, double instantHashrate) {
        this.hash = hash;
        this.height = height;
        this.orphan = orphan;
        this.timestamp = timestamp;
        this.difficulty = difficulty;
        this.prevBlockHash = prevBlockHash;
        this.sizeMedian = sizeMedian;
        this.blockSize = blockSize;
        this.txCumulativeSize = txCumulativeSize;
        this.txCount = txCount;
        this.baseReward = baseReward;
        this.penalty = penalty;
        this.reward = reward;
        this.feeSumm = feeSumm;
        this.alreadyGeneratedCoins = alreadyGeneratedCoins;
        this.cumulativeTxCount = cumulativeTxCount;
        this.rewardBlocksWindow = rewardBlocksWindow;
        this.fullRewardMaxBlockSize = fullRewardMaxBlockSize;
        this.instantHashrate = instantHashrate;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public boolean isOrphan() {
        return orphan;
    }

    public void setOrphan(boolean orphan) {
        this.orphan = orphan;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public long getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(long difficulty) {
        this.difficulty = difficulty;
    }

    public String getPrevBlockHash() {
        return prevBlockHash;
    }

    public void setPrevBlockHash(String prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }

    public long getSizeMedian() {
        return sizeMedian;
    }

    public void setSizeMedian(long sizeMedian) {
        this.sizeMedian = sizeMedian;
    }

    public long getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(long blockSize) {
        this.blockSize = blockSize;
    }

    public long getTxCumulativeSize() {
        return txCumulativeSize;
    }

    public void setTxCumulativeSize(long txCumulativeSize) {
        this.txCumulativeSize = txCumulativeSize;
    }

    public long getTxCount() {
        return txCount;
    }

    public void setTxCount(long txCount) {
        this.txCount = txCount;
    }

    public double getBaseReward() {
        return baseReward;
    }

    public void setBaseReward(double baseReward) {
        this.baseReward = baseReward;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getFeeSumm() {
        return feeSumm;
    }

    public void setFeeSumm(double feeSumm) {
        this.feeSumm = feeSumm;
    }

    public double getAlreadyGeneratedCoins() {
        return alreadyGeneratedCoins;
    }

    public void setAlreadyGeneratedCoins(double alreadyGeneratedCoins) {
        this.alreadyGeneratedCoins = alreadyGeneratedCoins;
    }

    public long getCumulativeTxCount() {
        return cumulativeTxCount;
    }

    public void setCumulativeTxCount(long cumulativeTxCount) {
        this.cumulativeTxCount = cumulativeTxCount;
    }

    public long getRewardBlocksWindow() {
        return rewardBlocksWindow;
    }

    public void setRewardBlocksWindow(long rewardBlocksWindow) {
        this.rewardBlocksWindow = rewardBlocksWindow;
    }

    public long getFullRewardMaxBlockSize() {
        return fullRewardMaxBlockSize;
    }

    public void setFullRewardMaxBlockSize(long fullRewardMaxBlockSize) {
        this.fullRewardMaxBlockSize = fullRewardMaxBlockSize;
    }

    public double getInstantHashrate() {
        return instantHashrate;
    }

    public void setInstantHashrate(double instantHashrate) {
        this.instantHashrate = instantHashrate;
    }
}
