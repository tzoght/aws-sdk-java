/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.xray.model;

/**
 * <p>
 * The request exceeds the maximum number of requests per second.
 * </p>
 */
public class ThrottledException extends com.amazonaws.services.xray.model.AWSXRayException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ThrottledException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottledException(String message) {
        super(message);
    }

}
