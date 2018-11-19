/**
 * Copyright 2015 The original authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
**/

package io.ap4k.examples.openshift;

import org.junit.jupiter.api.Test;
import io.fabric8.kubernetes.client.utils.Serialization;
import io.fabric8.kubernetes.api.model.KubernetesList;
import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OpenshiftExampleTest {

  @Test
  public void shouldContainDeploymentConfig() {
    KubernetesList list = Serialization.unmarshal(OpenshiftExampleTest.class.getClassLoader().getResourceAsStream("META-INF/ap4k/openshift.yml"));
    assertNotNull(list);
    assertEquals(1, list.getItems().size());
    assertEquals("DeploymentConfig", list.getItems().get(0).getKind());
  }
}
