/*
 *******************************************************************************
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.eclipse.microprofile.lra.client;

import javax.ws.rs.WebApplicationException;

public class IllegalLRAStateException extends WebApplicationException {
    private final String lraId;
    private final String operation;

    /**
     * Creation of LRA state exception.
     *
     * @param lraId  LRA id that is behind this exception
     * @param operation the java method that generated the exception
     * @param message  error message of this exception
     */
    public IllegalLRAStateException(String lraId, String operation, String message) {
        super(String.format("%s, lra id: %s", message, lraId));

        this.lraId = lraId;
        this.operation = operation;
    }

    public String getLraId() {
        return this.lraId;
    }

    public String getOperation() {
        return this.operation;
    }
}
