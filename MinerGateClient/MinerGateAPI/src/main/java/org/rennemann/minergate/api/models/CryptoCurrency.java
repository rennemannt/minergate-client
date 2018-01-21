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
 * Enumerated list of crypto currencies.
 *
 * @author Travis Rennemann
 */
public enum CryptoCurrency {
    BTC("Bitcoin"),
    LTC("Litecoin"),
    BCN("Bytecoin"),
    XMR("Monero"),
    FCN("FantomCoin"),
    QCN("QuazarCoin"),
    XDN("DigitalNote"),
    MCN("MonetaVerde"),
    DSH("Dashcoin"),
    AEON("Aeon coin"),
    INF8("Infinium-8");

    private final String name;

    private CryptoCurrency(String name) {
        this.name = name;
    }

    /**
     * Get the human readable/friendly format.
     *
     * @return The human friendly name of the enum value
     */
    public String getName() {
        return this.name;
    }
}
