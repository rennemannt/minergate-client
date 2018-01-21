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
 * User login request body.
 *
 * @author Travis Rennemann
 */
public class LoginRequest {

    private String email;
    private String password;
    private int totp;

    /**
     * Construct.
     */
    public LoginRequest() {
    }

    /**
     * Construct.
     *
     * @param email User's email address
     * @param password User's password
     * @param totp 2-step authorization token, required if 2-step authorization is enabled
     */
    public LoginRequest(String email, String password, int totp) {
        this.email = email;
        this.password = password;
        this.totp = totp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotp() {
        return totp;
    }

    public void setTotp(int totp) {
        this.totp = totp;
    }
}
