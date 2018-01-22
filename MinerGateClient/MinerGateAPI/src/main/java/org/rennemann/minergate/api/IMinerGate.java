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
package org.rennemann.minergate.api;

import java.util.List;
import java.util.Map;
import org.rennemann.minergate.api.models.ActiveMiningWorker;
import org.rennemann.minergate.api.models.BlockchainInfo;
import org.rennemann.minergate.api.models.CryptoCurrency;
import org.rennemann.minergate.api.models.LoginResponse;
import org.rennemann.minergate.api.models.MinerHashrate;
import org.rennemann.minergate.api.models.UserAffiliatesDetail;
import org.rennemann.minergate.api.models.UserInvoice;
import org.rennemann.minergate.api.models.UserMiningStat;
import org.rennemann.minergate.api.models.UserTransfer;
import org.rennemann.minergate.api.models.UserWithdrawal;

/**
 * Interface definition for the MinerGate v1.0 API.
 *
 * @host: https://api.minergate.com
 *
 * @author Travis Rennemann
 */
public interface IMinerGate {

    /**
     * Returns the list of all currencies sorted by profitability.
     *
     * @method GET
     * @path /1.0/pool/profit-rating
     *
     * @return
     */
    public List<String> getProfitCurrencyRating();

    /**
     * Returns the lists of top 10 miners for each currency.
     *
     * @method GET
     * @path /1.0/pool/top/hashrate
     *
     * @return
     */
    public MinerHashrate getTopHashratesByCurrency();

    /**
     * Returns the blockchain data of the specified currency. Returned values
     * are as follows: chain height, last block timestamp, network difficulty,
     * network hashrate, base reward.
     *
     * @method GET
     * @path /1.0/:cc/status, where :cc is the crypto currency
     *
     * @return
     */
    public BlockchainInfo getBlockchainInfo();

    /**
     * Authorizes the user and gives token for the following methods.
     *
     * @param email The user's email address
     * @param password The user's password
     * @param code The 2-step authentication token
     *
     * @return
     */
    public LoginResponse login(String email, String password, int code);

    /**
     * *********************************************************
     * The following methods required an authentication token. *
     * *********************************************************
     */
    
    /**
     * Returns the user’s balance. Requires authorization.
     *
     * @method GET
     * @path /1.0/balance
     *
     * @return
     */
    public Map<String, Double> getBalance();

    /**
     * Returns the list of user’s transfers. Requires authorization.
     *
     * @param cc The crypto currency
     * @method GET
     * @path /1.0/transfers/:cc, where :cc is the crypto currency
     *
     * @return
     */
    public List<UserTransfer> getTransfers(CryptoCurrency cc);

    /**
     * Returns the list of user’s withdrawals for all the currencies or a
     * specific currency if such parameter is set. Requires authorization.
     *
     * @param cc The crypto currency
     * @method GET
     * @path /1.0/withdrawals/:cc, where :cc is the crypto currency
     *
     * @return
     */
    public List<UserWithdrawal> getWithdrawals(CryptoCurrency cc);

    /**
     * Returns the number of user’s active workers. Requires authorization.
     *
     * @method GET
     * @path /1.0/workers
     *
     * @return
     */
    public List<Map<CryptoCurrency, ActiveMiningWorker>> getWorkers();

    /**
     * Returns the user’s mining statistics. Requires authorization.
     *
     * @method GET
     * @path /1.0/mining/stats
     *
     * @return
     */
    public List<Map<CryptoCurrency, UserMiningStat>> getMiningStats();

    /**
     * Returns the list of user’s affiliate links. Requires authorization.
     *
     * @method GET
     * @path /1.0/affiliate/links
     *
     * @return
     */
    public List<Map<String, String>> getAffiliateLinks();

    /**
     * Returns the list of user’s affiliates. Requires authorization.
     *
     * @method GET
     * @path /1.0/affiliate/childrens
     *
     * @return
     */
    public List<Map<String, UserAffiliatesDetail>> getAffiliates();

    /**
     * Returns the user’s income from affiliates. Requires authorization.
     *
     * @method GET
     * @path /1.0/affiliate/profit
     *
     * @return
     */
    public Map<String, Double> getAffiliateProfits();

    /**
     * Returns the list of user's invoices. Requires authorization.
     *
     * @method GET
     * @path /1.0/invoices
     *
     * @return
     */
    public List<UserInvoice> getInvoices();

    /**
     * Returns the specified invoice. Requires authorization.
     *
     * @param id The unique invoice identifier
     * @method GET
     * @path /1.0/invoices/:id
     *
     * @return
     */
    public UserInvoice getInvoiceById(String id);

    /**
     * Returns the user’s nickname. Requires authorization.
     *
     * @method GET
     * @path /1.0/profile/nickname
     *
     * @return
     */
    public String getNickname();

}
