/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.kernel.config.model;

/**
 * Deployment Config bean.
 *
 * @since 5.0.0
 */
public class DeploymentConfig {

    private DeploymentModeEnum mode = DeploymentModeEnum.scheduled;

    private String repositoryLocation = "${carbon.home}/repository/deployment/server/";

    private int updateInterval = 15;

    public DeploymentModeEnum getMode() {
        return mode;
    }

    public String getRepositoryLocation() {
        return repositoryLocation;
    }

    public int getUpdateInterval() {
        return updateInterval;
    }
}
