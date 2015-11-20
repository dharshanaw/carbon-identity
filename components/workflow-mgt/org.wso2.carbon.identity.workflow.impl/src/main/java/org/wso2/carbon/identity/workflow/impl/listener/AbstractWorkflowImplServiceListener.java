/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.workflow.impl.listener;

import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.core.model.IdentityEventListener;
import org.wso2.carbon.identity.core.util.IdentityCoreConstants;
import org.wso2.carbon.identity.core.util.IdentityUtil;
import org.wso2.carbon.identity.workflow.impl.WorkflowImplException;
import org.wso2.carbon.identity.workflow.impl.bean.BPSProfile;
import org.wso2.carbon.identity.workflow.mgt.bean.Workflow;
import org.wso2.carbon.identity.workflow.mgt.bean.WorkflowRequest;

public abstract class AbstractWorkflowImplServiceListener implements WorkflowImplServiceListener {

    /**
     * Trigger before adding new BPS profile
     *
     * @param bpsProfileDTO
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPreAddBPSProfile(BPSProfile bpsProfileDTO, int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger after adding new BPS profile
     *
     * @param bpsProfileDTO
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPostAddBPSProfile(BPSProfile bpsProfileDTO, int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger before listing BPS profiles
     *
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPreListBPSProfiles(int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger after listing BPS profiles
     *
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPostListBPSProfiles(int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger before removing a BPS profile
     *
     * @param profileName
     * @throws WorkflowImplException
     */
    @Override
    public void doPreRemoveBPSProfile(String profileName) throws WorkflowImplException {

    }

    /**
     * Trigger after removing a BPS profile
     *
     * @param profileName
     * @throws WorkflowImplException
     */
    @Override
    public void doPostRemoveBPSProfile(String profileName) throws WorkflowImplException {

    }

    /**
     * Trigger before retrieving a BPS profile
     *
     * @param profileName
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPreGetBPSProfile(String profileName, int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger after retrieving a BPS profile
     *
     * @param profileName
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPostGetBPSProfile(String profileName, int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger before updating a BPS profile
     *
     * @param bpsProfileDTO
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPreUpdateBPSProfile(BPSProfile bpsProfileDTO, int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger after updating a BPS profile
     *
     * @param bpsProfileDTO
     * @param tenantId
     * @throws WorkflowImplException
     */
    @Override
    public void doPostUpdateBPSProfile(BPSProfile bpsProfileDTO, int tenantId) throws WorkflowImplException {

    }

    /**
     * Trigger before deleting a human task
     *
     * @param workflowRequest
     * @throws WorkflowImplException
     */
    @Override
    public void doPreDeleteHumanTask(WorkflowRequest workflowRequest) throws WorkflowImplException {

    }

    /**
     * Trigger after deleting a human task
     *
     * @param workflowRequest
     * @throws WorkflowImplException
     */
    @Override
    public void doPostDeleteHumanTask(WorkflowRequest workflowRequest) throws WorkflowImplException {

    }

    /**
     * Trigger before deleting a BPS package
     *
     * @param workflow
     * @throws WorkflowImplException
     */
    @Override
    public void doPreRemoveBPSPackage(Workflow workflow) throws WorkflowImplException {

    }

    /**
     * Trigger after deleting a BPS package
     *
     * @param workflow
     * @throws WorkflowImplException
     */
    @Override
    public void doPostRemoveBPSPackage(Workflow workflow) throws WorkflowImplException {

    }

    public boolean isEnable() {
        IdentityEventListener workflowImplListener = IdentityUtil.readEventListenerProperty
                (WorkflowImplServiceListener.class.getName(), this.getClass().getName());

        if (workflowImplListener == null) {
            return true;
        }

        if (StringUtils.isNotBlank(workflowImplListener.getEnable())) {
            return Boolean.parseBoolean(workflowImplListener.getEnable());
        } else {
            return true;
        }
    }

    public int getOrderId() {
        IdentityEventListener workflowImplListener = IdentityUtil.readEventListenerProperty
                (WorkflowImplServiceListener.class.getName(), this.getClass().getName());
        if (workflowImplListener == null) {
            return IdentityCoreConstants.EVENT_LISTENER_ORDER_ID;
        }
        return workflowImplListener.getOrder();
    }

}
