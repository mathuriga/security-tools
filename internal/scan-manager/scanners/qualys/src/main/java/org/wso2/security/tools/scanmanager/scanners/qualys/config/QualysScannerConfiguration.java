/*
 *
 *   Copyright (c) 2019, WSO2 Inc., WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 * /
 */

package org.wso2.security.tools.scanmanager.scanners.qualys.config;

import org.wso2.security.tools.scanmanager.scanners.common.config.Configuration;
import org.wso2.security.tools.scanmanager.scanners.common.config.ScannerConfiguration;

/**
 * Qualys Specific Configuration
 */
public class QualysScannerConfiguration extends ScannerConfiguration {

    private static volatile QualysScannerConfiguration instance;
    private String reportFilePath;
    private char[] username;
    private char[] password;
    // TODO: 4/25/19 remove this 
    private long initialDelay;
    private long schedulerDelay;
    private String host;

    public static QualysScannerConfiguration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new QualysScannerConfiguration();
                }
            }
        }
        return instance;
    }

    public String getReportFilePath() {
        return reportFilePath;
    }

    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }

    public char[] getUsername() {
        return username;
    }

    public void setUsername(char[] username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public long getInitialDelay() {
        return initialDelay;
    }

    public void setInitialDelay(long initialDelay) {
        this.initialDelay = initialDelay;
    }

    public long getSchedulerDelay() {
        return schedulerDelay;
    }

    public void setSchedulerDelay(long schedulerDelay) {
        this.schedulerDelay = schedulerDelay;
    }
}