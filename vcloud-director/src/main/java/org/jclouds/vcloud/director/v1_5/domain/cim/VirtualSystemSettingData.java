/*
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.vcloud.director.v1_5.domain.cim;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.jclouds.vcloud.director.v1_5.VCloudDirectorConstants.VCLOUD_CIM_VSSD_NS;
import static org.jclouds.vcloud.director.v1_5.VCloudDirectorConstants.VCLOUD_OVF_NS;

import java.math.BigInteger;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

/**
 * VirtualSystemSettingData defines the virtual aspects of a virtual system through a set of
 * virtualization specific properties.
 *
 * VirtualSystemSettingData is also used as the top level class of virtual system configurations.
 * Virtual system configurations model configuration information about virtual systems and their
 * components. A virtual system configuration consists of one top-level instance of class
 * VirtualSystemSettingData that aggregates a number of instances of class
 * {@link ResourceAllocationSettingData}, using association {@link ConcreteComponent).
 * <p>
 * Virtual system configurations may for example be used to reflect configurations of:
 * <ul>
 * <li>virtual systems that are defined at a virtualization platform
 * <li>virtual systems that are currently active
 * <li>input requests to create new virtual systems
 * <li>input requests to modify existing virtual systems
 * <li>snapshots of virtual systems
 * </ul>
 * 
 * @author Adrian Cole
 * @author grkvlt@apache.org
 * @see http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2.22.0/CIM_VirtualSystemSettingData.xsd
 */
@XmlType(name = "CIM_VirtualSystemSettingData_Type", namespace = VCLOUD_OVF_NS)
public class VirtualSystemSettingData {

   public static Builder builder() {
      return new Builder();
   }

   public Builder toBuilder() {
      return builder().fromVirtualSystemSettingData(this);
   }

   public static class Builder {

      private String elementName;
      private String instanceID;
      private String caption;
      private String description;
      private AutomaticRecoveryAction automaticRecoveryAction;
      private AutomaticShutdownAction automaticShutdownAction;
      private AutomaticStartupAction automaticStartupAction;
      private BigInteger automaticStartupActionDelay;
      private Long automaticStartupActionSequenceNumber;
      private String configurationDataRoot;
      private String configurationFile;
      private String configurationID;
      private Date creationTime;
      private String logDataRoot;
      private String recoveryFile;
      private String snapshotDataRoot;
      private String suspendDataRoot;
      private String swapFileDataRoot;
      private String virtualSystemIdentifier;
      private String virtualSystemType;
      private String notes;

      public Builder elementName(String elementName) {
         this.elementName = elementName;
         return this;
      }

      public Builder instanceID(String instanceID) {
         this.instanceID = instanceID;
         return this;
      }

      public Builder caption(String caption) {
         this.caption = caption;
         return this;
      }

      public Builder description(String description) {
         this.description = description;
         return this;
      }

      public Builder automaticRecoveryAction(AutomaticRecoveryAction automaticRecoveryAction) {
         this.automaticRecoveryAction = automaticRecoveryAction;
         return this;
      }

      public Builder automaticShutdownAction(AutomaticShutdownAction automaticShutdownAction) {
         this.automaticShutdownAction = automaticShutdownAction;
         return this;
      }

      public Builder automaticStartupAction(AutomaticStartupAction automaticStartupAction) {
         this.automaticStartupAction = automaticStartupAction;
         return this;
      }

      public Builder automaticStartupActionDelay(BigInteger automaticStartupActionDelay) {
         this.automaticStartupActionDelay = automaticStartupActionDelay;
         return this;
      }

      public Builder automaticStartupActionSequenceNumber(Long automaticStartupActionSequenceNumber) {
         this.automaticStartupActionSequenceNumber = automaticStartupActionSequenceNumber;
         return this;
      }

      public Builder configurationDataRoot(String configurationDataRoot) {
         this.configurationDataRoot = configurationDataRoot;
         return this;
      }

      public Builder configurationFile(String configurationFile) {
         this.configurationFile = configurationFile;
         return this;
      }

      public Builder configurationID(String configurationID) {
         this.configurationID = configurationID;
         return this;
      }

      public Builder creationTime(Date creationTime) {
         this.creationTime = creationTime;
         return this;
      }

      public Builder logDataRoot(String logDataRoot) {
         this.logDataRoot = logDataRoot;
         return this;
      }

      public Builder recoveryFile(String recoveryFile) {
         this.recoveryFile = recoveryFile;
         return this;
      }

      public Builder snapshotDataRoot(String snapshotDataRoot) {
         this.snapshotDataRoot = snapshotDataRoot;
         return this;
      }

      public Builder suspendDataRoot(String suspendDataRoot) {
         this.suspendDataRoot = suspendDataRoot;
         return this;
      }

      public Builder swapFileDataRoot(String swapFileDataRoot) {
         this.swapFileDataRoot = swapFileDataRoot;
         return this;
      }

      public Builder virtualSystemIdentifier(String virtualSystemIdentifier) {
         this.virtualSystemIdentifier = virtualSystemIdentifier;
         return this;
      }

      public Builder virtualSystemType(String virtualSystemType) {
         this.virtualSystemType = virtualSystemType;
         return this;
      }

      public Builder notes(String notes) {
         this.notes = notes;
         return this;
      }

      public VirtualSystemSettingData build() {
         return new VirtualSystemSettingData(elementName, instanceID, caption, description, automaticRecoveryAction,
                  automaticShutdownAction, automaticStartupAction, automaticStartupActionDelay,
                  automaticStartupActionSequenceNumber, configurationDataRoot, configurationFile, configurationID,
                  creationTime, logDataRoot, recoveryFile, snapshotDataRoot, suspendDataRoot, swapFileDataRoot,
                  virtualSystemIdentifier, virtualSystemType, notes);
      }

      public Builder fromVirtualSystemSettingData(VirtualSystemSettingData in) {
         return elementName(in.getElementName())
               .instanceID(in.getInstanceID())
               .caption(in.getCaption())
               .description(in.getDescription())
               .automaticRecoveryAction(in.getAutomaticRecoveryAction())
               .automaticShutdownAction(in.getAutomaticShutdownAction())
               .automaticStartupAction(in.getAutomaticStartupAction())
               .automaticStartupActionDelay(in.getAutomaticStartupActionDelay())
               .automaticStartupActionSequenceNumber(in.getAutomaticStartupActionSequenceNumber())
               .configurationDataRoot(in.getConfigurationDataRoot())
               .configurationFile(in.getConfigurationFile())
               .configurationID(in.getConfigurationID())
               .creationTime(in.getCreationTime())
               .logDataRoot(in.getLogDataRoot())
               .recoveryFile(in.getRecoveryFile())
               .snapshotDataRoot(in.getSnapshotDataRoot())
               .suspendDataRoot(in.getSuspendDataRoot())
               .swapFileDataRoot(in.getSwapFileDataRoot())
               .virtualSystemIdentifier(in.getVirtualSystemIdentifier())
               .virtualSystemType(in.getVirtualSystemType())
               .notes(in.getNotes());
      }

   }

   /**
    * Action to take for the virtual system when the software executed by the virtual system fails.
    *
    * Failures in this case means a failure that is detectable by the host platform, such as a
    * non-interuptable wait state condition.
    */
   @XmlType
   @XmlEnum(Integer.class)
   public static enum AutomaticRecoveryAction {

      @XmlEnumValue("2") NONE(2),
      @XmlEnumValue("3") RESTART(3),
      @XmlEnumValue("4") REVERT_TO_SNAPSHOT(4);

      protected final int code;

      AutomaticRecoveryAction(int code) {
         this.code = code;
      }

      public String value() {
         return Integer.toString(code);
      }

      protected final static Map<Integer, AutomaticRecoveryAction> AUTOMATIC_RECOVERY_ACTION_BY_ID = Maps.uniqueIndex(
               ImmutableSet.copyOf(AutomaticRecoveryAction.values()), new Function<AutomaticRecoveryAction, Integer>() {
                  @Override
                  public Integer apply(AutomaticRecoveryAction input) {
                     return input.code;
                  }
               });

      public static AutomaticRecoveryAction fromValue(String automaticRecoveryAction) {
         return AUTOMATIC_RECOVERY_ACTION_BY_ID.get(Integer.valueOf(checkNotNull(automaticRecoveryAction, "automaticRecoveryAction")));
      }
   }

   /**
    * Action to take for the virtual system when the host is shut down.
    */
   @XmlType
   @XmlEnum(Integer.class)
   public static enum AutomaticShutdownAction {

      @XmlEnumValue("2") TURN_OFF(2),
      @XmlEnumValue("3") SAVE_STATE(3),
      @XmlEnumValue("4") SHUTDOWN(4);

      protected final int code;

      AutomaticShutdownAction(int code) {
         this.code = code;
      }

      public String value() {
         return Integer.toString(code);
      }

      protected final static Map<Integer, AutomaticShutdownAction> AUTOMATIC_SHUTDOWN_ACTION_BY_ID = Maps.uniqueIndex(
               ImmutableSet.copyOf(AutomaticShutdownAction.values()), new Function<AutomaticShutdownAction, Integer>() {
                  @Override
                  public Integer apply(AutomaticShutdownAction input) {
                     return input.code;
                  }
               });

      public static AutomaticShutdownAction fromValue(String automaticShutdownAction) {
         return AUTOMATIC_SHUTDOWN_ACTION_BY_ID.get(Integer.valueOf(checkNotNull(automaticShutdownAction, "automaticShutdownAction")));
      }
   }

   /**
    * Action to take for the virtual system when the host is started.
    */
   @XmlType
   @XmlEnum(Integer.class)
   public static enum AutomaticStartupAction {

      @XmlEnumValue("2") NONE(2),
      @XmlEnumValue("3") RESTART_IF_PREVIOUSLY_ACTIVE(3),
      @XmlEnumValue("4") ALWAYS_STARTUP(4);

      protected final int code;

      AutomaticStartupAction(int code) {
         this.code = code;
      }

      public String value() {
         return Integer.toString(code);
      }

      protected final static Map<Integer, AutomaticStartupAction> AUTOMATIC_STARTUP_ACTION_BY_ID = Maps.uniqueIndex(
               ImmutableSet.copyOf(AutomaticStartupAction.values()), new Function<AutomaticStartupAction, Integer>() {
                  @Override
                  public Integer apply(AutomaticStartupAction input) {
                     return input.code;
                  }
               });

      public static AutomaticStartupAction fromValue(String automaticStartupAction) {
         return AUTOMATIC_STARTUP_ACTION_BY_ID.get(Integer.valueOf(checkNotNull(automaticStartupAction, "automaticStartupAction")));
      }
   }

   @XmlElement(name = "ElementName", namespace = VCLOUD_CIM_VSSD_NS)
   private String elementName;
   @XmlElement(name = "InstanceID", namespace = VCLOUD_CIM_VSSD_NS)
   private String instanceID;
   @XmlElement(name = "Caption", namespace = VCLOUD_CIM_VSSD_NS)
   private String caption;
   @XmlElement(name = "Description", namespace = VCLOUD_CIM_VSSD_NS)
   private String description;
   @XmlElement(name = "VirtualSystemIdentifier", namespace = VCLOUD_CIM_VSSD_NS)
   private String virtualSystemIdentifier;
   @XmlElement(name = "VirtualSystemType", namespace = VCLOUD_CIM_VSSD_NS)
   private String virtualSystemType;
   @XmlElement(name = "AutomaticRecoveryAction", namespace = VCLOUD_CIM_VSSD_NS)
   private AutomaticRecoveryAction automaticRecoveryAction;
   @XmlElement(name = "AutomaticShutdownAction", namespace = VCLOUD_CIM_VSSD_NS)
   private AutomaticShutdownAction automaticShutdownAction;
   @XmlElement(name = "AutomaticStartupAction", namespace = VCLOUD_CIM_VSSD_NS)
   private AutomaticStartupAction automaticStartupAction;
   @XmlElement(name = "AutomaticStartupActionDelay", namespace = VCLOUD_CIM_VSSD_NS)
   private BigInteger automaticStartupActionDelay;
   @XmlElement(name = "AutomaticStartupActionSequenceNumber", namespace = VCLOUD_CIM_VSSD_NS)
   private Long automaticStartupActionSequenceNumber;
   @XmlElement(name = "ConfigurationDataRoot", namespace = VCLOUD_CIM_VSSD_NS)
   private String configurationDataRoot;
   @XmlElement(name = "ConfigurationFile", namespace = VCLOUD_CIM_VSSD_NS)
   private String configurationFile;
   @XmlElement(name = "ConfigurationID", namespace = VCLOUD_CIM_VSSD_NS)
   private String configurationID;
   @XmlElement(name = "CreationTime", namespace = VCLOUD_CIM_VSSD_NS)
   private Date creationTime;
   @XmlElement(name = "LogDataRoot", namespace = VCLOUD_CIM_VSSD_NS)
   private String logDataRoot;
   @XmlElement(name = "RecoveryFile", namespace = VCLOUD_CIM_VSSD_NS)
   private String recoveryFile;
   @XmlElement(name = "SnapshotDataRoot", namespace = VCLOUD_CIM_VSSD_NS)
   private String snapshotDataRoot;
   @XmlElement(name = "SuspendDataRoot", namespace = VCLOUD_CIM_VSSD_NS)
   private String suspendDataRoot;
   @XmlElement(name = "SwapFileDataRoot", namespace = VCLOUD_CIM_VSSD_NS)
   private String swapFileDataRoot;
   @XmlElement(name = "Notes", namespace = VCLOUD_CIM_VSSD_NS)
   private String notes;

   private VirtualSystemSettingData(String elementName, String instanceID, String caption, String description,
            AutomaticRecoveryAction automaticRecoveryAction, AutomaticShutdownAction automaticShutdownAction,
            AutomaticStartupAction automaticStartupAction, BigInteger automaticStartupActionDelay,
            Long automaticStartupActionSequenceNumber, String configurationDataRoot, String configurationFile,
            String configurationID, Date creationTime, String logDataRoot, String recoveryFile, String snapshotDataRoot,
            String suspendDataRoot, String swapFileDataRoot, String virtualSystemIdentifier,
            String virtualSystemType, String notes) {
      this.elementName = elementName;
      this.instanceID = instanceID;
      this.caption = caption;
      this.description = description;
      this.automaticRecoveryAction = automaticRecoveryAction;
      this.automaticShutdownAction = automaticShutdownAction;
      this.automaticStartupAction = automaticStartupAction;
      this.automaticStartupActionDelay = automaticStartupActionDelay;
      this.automaticStartupActionSequenceNumber = automaticStartupActionSequenceNumber;
      this.configurationDataRoot = configurationDataRoot;
      this.configurationFile = configurationFile;
      this.configurationID = configurationID;
      this.creationTime = creationTime;
      this.logDataRoot = logDataRoot;
      this.recoveryFile = recoveryFile;
      this.snapshotDataRoot = snapshotDataRoot;
      this.suspendDataRoot = suspendDataRoot;
      this.swapFileDataRoot = swapFileDataRoot;
      this.virtualSystemIdentifier = virtualSystemIdentifier;
      this.virtualSystemType = virtualSystemType;
      this.notes = notes;
   }

   private VirtualSystemSettingData() {
      // for JAXB
   }

   /**
    * The user-friendly name for this instance of SettingData. In addition, the user-friendly name
    * can be used as an index property for a search or query. (Note: The name does not have to be
    * unique within a namespace.)
    */
   public String getElementName() {
      return elementName;
   }

   /**
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies
    * an instance of this class.
    */
   public String getInstanceID() {
      return instanceID;
   }

   /**
    * The Caption property is a short textual description (one- line string) of the object.
    */
   public String getCaption() {
      return caption;
   }

   /**
    * The Description property provides a textual description of the object.
    */
   public String getDescription() {
      return description;
   }

   /**
    * Action to take for the virtual system when the software executed by the virtual system fails.
    * Failures in this case means a failure that is detectable by the host platform, such as a
    * non-interuptable wait state condition.
    */
   public AutomaticRecoveryAction getAutomaticRecoveryAction() {
      return automaticRecoveryAction;
   }

   /**
    * Action to take for the virtual system when the host is shut down.
    */
   public AutomaticShutdownAction getAutomaticShutdownAction() {
      return automaticShutdownAction;
   }

   /**
    * Action to take for the virtual system when the host is started.
    */
   public AutomaticStartupAction getAutomaticStartupAction() {
      return automaticStartupAction;
   }

   /**
    * Delay applicable to startup action. The value shall be in the interval variant of the datetime
    * datatype.
    */
   public BigInteger getAutomaticStartupActionDelay() {
      return automaticStartupActionDelay;
   }

   /**
    * Number indicating the relative sequence of virtual system activation when the host system is
    * started. A lower number indicates earlier activation. If one or more configurations show the
    * same value, the sequence is implementation dependent. A value of 0 indicates that the sequence
    * is implementation dependent.
    */
   public Long getAutomaticStartupActionSequenceNumber() {
      return automaticStartupActionSequenceNumber;
   }

   /**
    * Filepath of a directory where information about the virtual system configuration is
    * stored.
    *
    * Format shall be String based on RFC-2079.
    */
   public String getConfigurationDataRoot() {
      return configurationDataRoot;
   }

   /**
    * Filepath of a file where information about the virtual system configuration is stored.
    *
    * A relative path appends to the value of the {@link #getConfigurationDataRoot()} property.
    * <p>
    * Format shall be String based on RFC-2079.
    */
   public String getConfigurationFile() {
      return configurationFile;
   }

   /**
    * Unique id of the virtual system configuration. Note that the ConfigurationID is different from
    * the InstanceID as it is assigned by the implementation to a virtual system or a virtual system
    * configuration. It is not a key, and the same value may occur within more than one instance.
    */
   public String getConfigurationID() {
      return configurationID;
   }

   /**
    * Time when the virtual system configuration was created.
    */
   public Date getCreationTime() {
      return creationTime;
   }

   /**
    * Filepath of a directory where log information about the virtual system is stored.
    *
    * A relative path appends to the value of the {@link #getConfigurationDataRoot()} property.
    * <p>
    * Format shall be String based on RFC-2079.
    */
   public String getLogDataRoot() {
      return logDataRoot;
   }

   /**
    * Filepath of a file where recovery relateded information of the virtual system is stored.
    *
    * Format shall be String based on RFC-2079.
    */
   public String getRecoveryFile() {
      return recoveryFile;
   }

   /**
    * Filepath of a directory where information about virtual system snapshots is stored.
    *
    * A relative path appends to the value of the {@link #getConfigurationDataRoot()} property.
    * <p>
    * Format shall be String based on RFC-2079.
    */
   public String getSnapshotDataRoot() {
      return snapshotDataRoot;
   }

   /**
    * Filepath of a directory where suspend related information about the virtual system is stored.
    *
    * A relative path appends to the value of the {@link #getConfigurationDataRoot()} property.
    * <p>
    * Format shall be String based on RFC-2079.
    */
   public String getSuspendDataRoot() {
      return suspendDataRoot;
   }

   /**
    * Filepath of a directory where swapfiles of the virtual system are stored.
    *
    * A relative path appends to the value of the {@link #getConfigurationDataRoot()} property.
    * <p>
    * Format shall be String based on RFC-2079.
    */
   public String getSwapFileDataRoot() {
      return swapFileDataRoot;
   }

   /**
    * VirtualSystemIdentifier shall reflect a unique name for the system as it is used within the
    * virtualization platform.
    *
    * Note that the VirtualSystemIdentifier is not the hostname assigned to
    * the operating system instance running within the virtual system, nor is it an IP address or
    * MAC address assigned to any of its network ports. On create requests VirtualSystemIdentifier
    * may contain implementation specific rules (like simple patterns or regular expresssion) that
    * may be interpreted by the implementation when assigning a VirtualSystemIdentifier.
    */
   public String getVirtualSystemIdentifier() {
      return virtualSystemIdentifier;
   }

   /**
    * VirtualSystemType shall reflect a particular type of virtual system.
    */
   public String getVirtualSystemType() {
      return virtualSystemType;
   }

   /**
    * End-user supplied notes that are related to the virtual system.
    */
   public String getNotes() {
      return notes;
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(elementName, instanceID, caption, description, virtualSystemIdentifier, virtualSystemType);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      VirtualSystemSettingData that = VirtualSystemSettingData.class.cast(obj);
      return equal(this.elementName, that.elementName) &&
           equal(this.instanceID, that.instanceID) &&
           equal(this.caption, that.caption) &&
           equal(this.description, that.description) &&
           equal(this.virtualSystemIdentifier, that.virtualSystemIdentifier) &&
           equal(this.virtualSystemType, that.virtualSystemType);
   }

   @Override
   public String toString() {
      return Objects.toStringHelper("")
            .add("caption", caption)
            .add("description", description)
            .add("virtualSystemIdentifier", virtualSystemIdentifier)
            .add("virtualSystemType", virtualSystemType)
            .toString();
   }

}