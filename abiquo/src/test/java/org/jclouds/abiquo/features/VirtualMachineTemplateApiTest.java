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
package org.jclouds.abiquo.features;

import static org.jclouds.abiquo.domain.DomainUtils.withHeader;
import static org.jclouds.reflect.Reflection2.method;

import java.io.IOException;

import org.jclouds.Fallbacks.NullOnNotFoundOr404;
import org.jclouds.abiquo.domain.TemplateResources;
import org.jclouds.abiquo.domain.cloud.options.ConversionOptions;
import org.jclouds.abiquo.functions.ReturnTaskReferenceOrNull;
import org.jclouds.http.functions.ParseXMLWithJAXB;
import org.jclouds.http.functions.ReleasePayloadAndReturn;
import org.jclouds.reflect.Invocation;
import org.jclouds.rest.internal.GeneratedHttpRequest;
import org.testng.annotations.Test;

import com.abiquo.model.enumerator.ConversionState;
import com.abiquo.model.enumerator.DiskFormatType;
import com.abiquo.model.enumerator.HypervisorType;
import com.abiquo.model.transport.AcceptedRequestDto;
import com.abiquo.server.core.appslibrary.ConversionDto;
import com.abiquo.server.core.appslibrary.ConversionsDto;
import com.abiquo.server.core.appslibrary.VirtualMachineTemplateDto;
import com.abiquo.server.core.appslibrary.VirtualMachineTemplatePersistentDto;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.Invokable;

/**
 * Tests annotation parsing of {@code VirtualMachineTemplateApi}
 * 
 * @author Ignasi Barrera
 * @author Francesc Montserrat
 */
@Test(groups = "unit", testName = "VirtualMachineTemplateApiTest")
public class VirtualMachineTemplateApiTest extends BaseAbiquoApiTest<VirtualMachineTemplateApi> {
   /*********************** Virtual Machine Template ***********************/

   public void testGetVirtualMachineTemplate() throws SecurityException, NoSuchMethodException, IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "getVirtualMachineTemplate", Integer.class,
            Integer.class, Integer.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(method, ImmutableList.<Object> of(1, 1, 1)));

      assertRequestLineEquals(request,
            "GET http://localhost/api/admin/enterprises/1/datacenterrepositories/1/virtualmachinetemplates/1 HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "Accept: " + VirtualMachineTemplateDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, null, null, false);

      assertResponseParserClassEquals(method, request, ParseXMLWithJAXB.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, NullOnNotFoundOr404.class);

      checkFilters(request);
   }

   public void testUpdateVirtualMachineTemplate() throws SecurityException, NoSuchMethodException, IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "updateVirtualMachineTemplate",
            VirtualMachineTemplateDto.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(method,
            ImmutableList.<Object> of(TemplateResources.virtualMachineTemplatePut())));

      assertRequestLineEquals(request, "PUT http://localhost/api/admin/enterprises/1/datacenterrepositories/1/"
            + "virtualmachinetemplates/1 HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "Accept: " + VirtualMachineTemplateDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, withHeader(TemplateResources.virtualMachineTemplatePutPayload()),
            VirtualMachineTemplateDto.class, VirtualMachineTemplateDto.BASE_MEDIA_TYPE, false);

      assertResponseParserClassEquals(method, request, ParseXMLWithJAXB.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, null);

      checkFilters(request);
   }

   public void testDeleteVirtualMachineTemplate() throws SecurityException, NoSuchMethodException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "deleteVirtualMachineTemplate",
            VirtualMachineTemplateDto.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(method,
            ImmutableList.<Object> of(TemplateResources.virtualMachineTemplatePut())));

      assertRequestLineEquals(request, "DELETE http://localhost/api/admin/enterprises/1/datacenterrepositories/1/"
            + "virtualmachinetemplates/1 HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "");
      assertPayloadEquals(request, null, null, false);

      assertResponseParserClassEquals(method, request, ReleasePayloadAndReturn.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, null);

      checkFilters(request);
   }

   public void testCreatePersistentVirtualMachineTemplate() throws SecurityException, NoSuchMethodException,
         IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "createPersistentVirtualMachineTemplate",
            Integer.class, Integer.class, VirtualMachineTemplatePersistentDto.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(method,
            ImmutableList.<Object> of(1, 1, TemplateResources.persistentData())));

      assertRequestLineEquals(request,
            "POST http://localhost/api/admin/enterprises/1/datacenterrepositories/1/virtualmachinetemplates HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "Accept: " + AcceptedRequestDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, withHeader(TemplateResources.persistentPayload()),
            VirtualMachineTemplatePersistentDto.BASE_MEDIA_TYPE, false);

      assertResponseParserClassEquals(method, request, ParseXMLWithJAXB.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, null);

      checkFilters(request);
   }

   /*********************** Conversions ***********************/

   public void testRequestConversion() throws SecurityException, NoSuchMethodException, IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "requestConversion",
            VirtualMachineTemplateDto.class, DiskFormatType.class, ConversionDto.class);

      GeneratedHttpRequest request = processor.apply(Invocation.create(method, ImmutableList.<Object> of(
            TemplateResources.virtualMachineTemplatePut(), DiskFormatType.VMDK_STREAM_OPTIMIZED,
            TemplateResources.conversionPut())));

      assertRequestLineEquals(request,
            "PUT http://localhost/api/admin/enterprises/1/datacenterrepositories/1/virtualmachinetemplates/"
                  + "1/conversions/VMDK_STREAM_OPTIMIZED HTTP/1.1");

      assertNonPayloadHeadersEqual(request, "Accept: " + AcceptedRequestDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, withHeader(TemplateResources.conversionPutPlayload()),
            ConversionDto.BASE_MEDIA_TYPE, false);

      assertResponseParserClassEquals(method, request, ReturnTaskReferenceOrNull.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, null);

      checkFilters(request);
   }

   public void testListConversions() throws SecurityException, NoSuchMethodException, IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "listConversions",
            VirtualMachineTemplateDto.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(method,
            ImmutableList.<Object> of(TemplateResources.virtualMachineTemplatePut())));

      assertRequestLineEquals(request,
            "GET http://localhost/api/admin/enterprises/1/datacenterrepositories/1/virtualmachinetemplates/"
                  + "1/conversions HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "Accept: " + ConversionsDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, null, null, false);

      assertResponseParserClassEquals(method, request, ParseXMLWithJAXB.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, null);

      checkFilters(request);
   }

   public void testListConversionsWithOptions() throws SecurityException, NoSuchMethodException, IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "listConversions",
            VirtualMachineTemplateDto.class, ConversionOptions.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(
            method,
            ImmutableList.<Object> of(TemplateResources.virtualMachineTemplatePut(), ConversionOptions.builder()
                  .hypervisorType(HypervisorType.XENSERVER).conversionState(ConversionState.FINISHED).build())));

      assertRequestLineEquals(request,
            "GET http://localhost/api/admin/enterprises/1/datacenterrepositories/1/virtualmachinetemplates/"
                  + "1/conversions" + "?hypervisor=XENSERVER&state=FINISHED HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "Accept: " + ConversionsDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, null, null, false);

      assertResponseParserClassEquals(method, request, ParseXMLWithJAXB.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, null);

      checkFilters(request);
   }

   public void testGetConversion() throws SecurityException, NoSuchMethodException, IOException {
      Invokable<?, ?> method = method(VirtualMachineTemplateApi.class, "getConversion",
            VirtualMachineTemplateDto.class, DiskFormatType.class);
      GeneratedHttpRequest request = processor.apply(Invocation.create(method,
            ImmutableList.<Object> of(TemplateResources.virtualMachineTemplatePut(), DiskFormatType.RAW)));

      assertRequestLineEquals(request, "GET http://localhost/api/admin/enterprises/1/datacenterrepositories/1/"
            + "virtualmachinetemplates/1/conversions/RAW HTTP/1.1");
      assertNonPayloadHeadersEqual(request, "Accept: " + ConversionDto.BASE_MEDIA_TYPE + "\n");
      assertPayloadEquals(request, null, null, false);

      assertResponseParserClassEquals(method, request, ParseXMLWithJAXB.class);
      assertSaxResponseParserClassEquals(method, null);
      assertFallbackClassEquals(method, NullOnNotFoundOr404.class);

      checkFilters(request);
   }
}
