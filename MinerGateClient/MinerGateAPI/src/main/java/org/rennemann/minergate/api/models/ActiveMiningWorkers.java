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
 * The collection of miner's active worker details grouped by currency.
 *
 * @author Travis Rennemann
 */
public class ActiveMiningWorkers {

    private Map<CryptoCurrency, ActiveMiningWorker> workers = new HashMap<>();

    /**
     * Construct.
     */
    public ActiveMiningWorkers() {
    }

    /**
     * Construct.
     *
     * @param workers The active mining workers
     */
    public ActiveMiningWorkers(Map<CryptoCurrency, ActiveMiningWorker> workers) {
        this.workers = workers;
    }

    public Map<CryptoCurrency, ActiveMiningWorker> getWorkers() {
        return workers;
    }

    public void setWorkers(Map<CryptoCurrency, ActiveMiningWorker> workers) {
        this.workers = workers;
    }
}
