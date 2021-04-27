/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.ftpserver.ftplet;

/**
 * One FtpRequest made by the client.
 *
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public interface FtpRequest {

    /**
     * Get the client request string.
     * @return The full request line, e.g. "MKDIR newdir"
     */
    String getRequestLine();

    /**
     * Returns the ftp request command.
     * @return The command part of the request line, e.g. "MKDIR"
     */
    String getCommand();

    /**
     * Get the ftp request argument.
     * @return The argument part of the request line, e.g. "newdir"
     */
    String getArgument();

    /**
     * Check if request contains an argument
     * 
     * @return true if an argument is available
     */
    boolean hasArgument();
    
    /**
     * Returns the timestamp (milliseconds since the epoch time) when this 
     * request was received. 
     * 
     * @return the timestamp (milliseconds since the epoch time) when this 
     * request was received.
     */
    long getReceivedTime();
}
