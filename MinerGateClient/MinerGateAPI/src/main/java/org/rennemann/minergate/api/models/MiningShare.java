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
 * The mining share for a specific crypto currency.
 *
 * @author Travis Rennemann
 */
public class MiningShare {

    private long good;
    private long goodEq;
    private long bad;
    private long badEq;
    private long invalid;
    private long invalidEq;

    /**
     * Construct.
     */
    public MiningShare() {
    }

    /**
     * Construct.
     *
     * @param good The number of good shares
     * @param goodEq The good EQ
     * @param bad The bad
     * @param badEq The bad
     * @param invalid The invalid
     * @param invalidEq The invalidD
     */
    public MiningShare(long good, long goodEq, long bad, long badEq, long invalid, long invalidEq) {
        this.good = good;
        this.goodEq = goodEq;
        this.bad = bad;
        this.badEq = badEq;
        this.invalid = invalid;
        this.invalidEq = invalidEq;
    }

    public long getGood() {
        return good;
    }

    public void setGood(long good) {
        this.good = good;
    }

    public long getGoodEq() {
        return goodEq;
    }

    public void setGoodEq(long goodEq) {
        this.goodEq = goodEq;
    }

    public long getBad() {
        return bad;
    }

    public void setBad(long bad) {
        this.bad = bad;
    }

    public long getBadEq() {
        return badEq;
    }

    public void setBadEq(long badEq) {
        this.badEq = badEq;
    }

    public long getInvalid() {
        return invalid;
    }

    public void setInvalid(long invalid) {
        this.invalid = invalid;
    }

    public long getInvalidEq() {
        return invalidEq;
    }

    public void setInvalidEq(long invalidEq) {
        this.invalidEq = invalidEq;
    }

}
