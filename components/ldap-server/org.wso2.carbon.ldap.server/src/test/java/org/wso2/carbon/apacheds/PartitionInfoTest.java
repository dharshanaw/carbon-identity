/*
 *
 * Copyright (c) 2005, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
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

package org.wso2.carbon.apacheds;

import junit.framework.TestCase;

public class PartitionInfoTest extends TestCase {

    public void testPreferredDomainComponent () {
        PartitionInfo info = new PartitionInfo("example", "example.com", "dc=example,dc=com", null);
        assertEquals("example", info.getPreferredDomainComponent());
    }

}
