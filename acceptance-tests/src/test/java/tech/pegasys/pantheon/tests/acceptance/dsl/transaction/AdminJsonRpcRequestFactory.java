/*
 * Copyright 2019 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.pantheon.tests.acceptance.dsl.transaction;

import java.util.Collections;

import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.Response;

public class AdminJsonRpcRequestFactory {

  public static class AdminAddPeerResponse extends Response<Boolean> {}

  private final Web3jService web3jService;

  public AdminJsonRpcRequestFactory(final Web3jService web3jService) {
    this.web3jService = web3jService;
  }

  public Request<?, AdminAddPeerResponse> adminAddPeer(final String enodeAddress) {
    return new Request<>(
        "admin_addPeer",
        Collections.singletonList(enodeAddress),
        web3jService,
        AdminAddPeerResponse.class);
  }
}
