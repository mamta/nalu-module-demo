/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.mamta.nalu.loginapplication.module.login.client.filter;

import com.mamta.nalu.loginapplication.module.login.client.NaluLoginApplicationContextLoginModule;
import com.github.nalukit.nalu.client.filter.AbstractFilter;
import elemental2.dom.DomGlobal;

public class LoginFilter
    extends AbstractFilter<NaluLoginApplicationContextLoginModule> {

  @Override
  public boolean filter(String route,
                        String... parms) {
    if (!"/loginShell/login".equals(route)) {
      if (!this.context.isLoggedIn()) {
        DomGlobal.window.alert("User is not logged in! Redirect to Login screen!");
        return false;
      }
    }
    return true;
  }

  @Override
  public String redirectTo() {
    return "/loginShell/login";
  }

  @Override
  public String[] parameters() {
    return new String[] {};
  }
}
