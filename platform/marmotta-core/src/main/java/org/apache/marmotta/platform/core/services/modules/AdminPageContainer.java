/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.marmotta.platform.core.services.modules;

import java.util.List;

/**
 * ...
 * <p/>
 * Author: Thomas Kurz (tkurz@apache.org)
 */
public class AdminPageContainer implements Comparable<AdminPageContainer> {

    private int number = 0;
    private String name;
    private List<String> modules;

    public AdminPageContainer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AdminPageContainer adminPageContainer) {
        if(number != adminPageContainer.number) return ((Integer)number).compareTo(adminPageContainer.number);
        return name.compareTo(adminPageContainer.name);
    }

    public boolean equals(String s) {
        return name.equals(s);
    }

    public void addModule(String module) {
        modules.add(module);
    }

    public void setNumber(int number) {
        this.number = number;
    }

}