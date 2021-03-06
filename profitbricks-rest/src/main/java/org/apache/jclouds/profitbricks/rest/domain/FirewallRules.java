/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jclouds.profitbricks.rest.domain;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import static com.google.common.collect.ImmutableList.copyOf;
import java.util.List;
import org.jclouds.json.SerializedNames;

@AutoValue
public abstract class FirewallRules {

   public abstract String id();

   public abstract String type();

   public abstract String href();

   public abstract List<FirewallRule> items();

   @SerializedNames({"id", "type", "href", "items"})
   public static FirewallRules create(String id, String type, String href, List<FirewallRule> items) {
      return new AutoValue_FirewallRules(id, type, href, items == null ? ImmutableList.<FirewallRule>of() : copyOf(items));
   }

}
