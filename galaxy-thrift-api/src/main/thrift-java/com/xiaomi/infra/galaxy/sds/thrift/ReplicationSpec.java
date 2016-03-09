/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 远程复制定义
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-4")
public class ReplicationSpec implements libthrift091.TBase<ReplicationSpec, ReplicationSpec._Fields>, java.io.Serializable, Cloneable, Comparable<ReplicationSpec> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ReplicationSpec");

  private static final libthrift091.protocol.TField ENABLE_REPLICATION_FIELD_DESC = new libthrift091.protocol.TField("enableReplication", libthrift091.protocol.TType.BOOL, (short)1);
  private static final libthrift091.protocol.TField THROUGHPUT_FIELD_DESC = new libthrift091.protocol.TField("throughput", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField MAX_SUBSCRIBERS_FIELD_DESC = new libthrift091.protocol.TField("maxSubscribers", libthrift091.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReplicationSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReplicationSpecTupleSchemeFactory());
  }

  /**
   * 是否做增量复制
   */
  public boolean enableReplication; // optional
  /**
   * 吞吐量配额
   */
  public ReplicationProvisionThroughput throughput; // optional
  /**
   * 订阅者的最大数量
   */
  public int maxSubscribers; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 是否做增量复制
     */
    ENABLE_REPLICATION((short)1, "enableReplication"),
    /**
     * 吞吐量配额
     */
    THROUGHPUT((short)2, "throughput"),
    /**
     * 订阅者的最大数量
     */
    MAX_SUBSCRIBERS((short)3, "maxSubscribers");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ENABLE_REPLICATION
          return ENABLE_REPLICATION;
        case 2: // THROUGHPUT
          return THROUGHPUT;
        case 3: // MAX_SUBSCRIBERS
          return MAX_SUBSCRIBERS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ENABLEREPLICATION_ISSET_ID = 0;
  private static final int __MAXSUBSCRIBERS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ENABLE_REPLICATION,_Fields.THROUGHPUT,_Fields.MAX_SUBSCRIBERS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENABLE_REPLICATION, new libthrift091.meta_data.FieldMetaData("enableReplication", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.THROUGHPUT, new libthrift091.meta_data.FieldMetaData("throughput", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, ReplicationProvisionThroughput.class)));
    tmpMap.put(_Fields.MAX_SUBSCRIBERS, new libthrift091.meta_data.FieldMetaData("maxSubscribers", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ReplicationSpec.class, metaDataMap);
  }

  public ReplicationSpec() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReplicationSpec(ReplicationSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    this.enableReplication = other.enableReplication;
    if (other.isSetThroughput()) {
      this.throughput = new ReplicationProvisionThroughput(other.throughput);
    }
    this.maxSubscribers = other.maxSubscribers;
  }

  public ReplicationSpec deepCopy() {
    return new ReplicationSpec(this);
  }

  @Override
  public void clear() {
    setEnableReplicationIsSet(false);
    this.enableReplication = false;
    this.throughput = null;
    setMaxSubscribersIsSet(false);
    this.maxSubscribers = 0;
  }

  /**
   * 是否做增量复制
   */
  public boolean isEnableReplication() {
    return this.enableReplication;
  }

  /**
   * 是否做增量复制
   */
  public ReplicationSpec setEnableReplication(boolean enableReplication) {
    this.enableReplication = enableReplication;
    setEnableReplicationIsSet(true);
    return this;
  }

  public void unsetEnableReplication() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENABLEREPLICATION_ISSET_ID);
  }

  /** Returns true if field enableReplication is set (has been assigned a value) and false otherwise */
  public boolean isSetEnableReplication() {
    return EncodingUtils.testBit(__isset_bitfield, __ENABLEREPLICATION_ISSET_ID);
  }

  public void setEnableReplicationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENABLEREPLICATION_ISSET_ID, value);
  }

  /**
   * 吞吐量配额
   */
  public ReplicationProvisionThroughput getThroughput() {
    return this.throughput;
  }

  /**
   * 吞吐量配额
   */
  public ReplicationSpec setThroughput(ReplicationProvisionThroughput throughput) {
    this.throughput = throughput;
    return this;
  }

  public void unsetThroughput() {
    this.throughput = null;
  }

  /** Returns true if field throughput is set (has been assigned a value) and false otherwise */
  public boolean isSetThroughput() {
    return this.throughput != null;
  }

  public void setThroughputIsSet(boolean value) {
    if (!value) {
      this.throughput = null;
    }
  }

  /**
   * 订阅者的最大数量
   */
  public int getMaxSubscribers() {
    return this.maxSubscribers;
  }

  /**
   * 订阅者的最大数量
   */
  public ReplicationSpec setMaxSubscribers(int maxSubscribers) {
    this.maxSubscribers = maxSubscribers;
    setMaxSubscribersIsSet(true);
    return this;
  }

  public void unsetMaxSubscribers() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXSUBSCRIBERS_ISSET_ID);
  }

  /** Returns true if field maxSubscribers is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxSubscribers() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXSUBSCRIBERS_ISSET_ID);
  }

  public void setMaxSubscribersIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXSUBSCRIBERS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENABLE_REPLICATION:
      if (value == null) {
        unsetEnableReplication();
      } else {
        setEnableReplication((Boolean)value);
      }
      break;

    case THROUGHPUT:
      if (value == null) {
        unsetThroughput();
      } else {
        setThroughput((ReplicationProvisionThroughput)value);
      }
      break;

    case MAX_SUBSCRIBERS:
      if (value == null) {
        unsetMaxSubscribers();
      } else {
        setMaxSubscribers((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENABLE_REPLICATION:
      return Boolean.valueOf(isEnableReplication());

    case THROUGHPUT:
      return getThroughput();

    case MAX_SUBSCRIBERS:
      return Integer.valueOf(getMaxSubscribers());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENABLE_REPLICATION:
      return isSetEnableReplication();
    case THROUGHPUT:
      return isSetThroughput();
    case MAX_SUBSCRIBERS:
      return isSetMaxSubscribers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReplicationSpec)
      return this.equals((ReplicationSpec)that);
    return false;
  }

  public boolean equals(ReplicationSpec that) {
    if (that == null)
      return false;

    boolean this_present_enableReplication = true && this.isSetEnableReplication();
    boolean that_present_enableReplication = true && that.isSetEnableReplication();
    if (this_present_enableReplication || that_present_enableReplication) {
      if (!(this_present_enableReplication && that_present_enableReplication))
        return false;
      if (this.enableReplication != that.enableReplication)
        return false;
    }

    boolean this_present_throughput = true && this.isSetThroughput();
    boolean that_present_throughput = true && that.isSetThroughput();
    if (this_present_throughput || that_present_throughput) {
      if (!(this_present_throughput && that_present_throughput))
        return false;
      if (!this.throughput.equals(that.throughput))
        return false;
    }

    boolean this_present_maxSubscribers = true && this.isSetMaxSubscribers();
    boolean that_present_maxSubscribers = true && that.isSetMaxSubscribers();
    if (this_present_maxSubscribers || that_present_maxSubscribers) {
      if (!(this_present_maxSubscribers && that_present_maxSubscribers))
        return false;
      if (this.maxSubscribers != that.maxSubscribers)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_enableReplication = true && (isSetEnableReplication());
    list.add(present_enableReplication);
    if (present_enableReplication)
      list.add(enableReplication);

    boolean present_throughput = true && (isSetThroughput());
    list.add(present_throughput);
    if (present_throughput)
      list.add(throughput);

    boolean present_maxSubscribers = true && (isSetMaxSubscribers());
    list.add(present_maxSubscribers);
    if (present_maxSubscribers)
      list.add(maxSubscribers);

    return list.hashCode();
  }

  @Override
  public int compareTo(ReplicationSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEnableReplication()).compareTo(other.isSetEnableReplication());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnableReplication()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.enableReplication, other.enableReplication);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThroughput()).compareTo(other.isSetThroughput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThroughput()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throughput, other.throughput);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxSubscribers()).compareTo(other.isSetMaxSubscribers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxSubscribers()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxSubscribers, other.maxSubscribers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ReplicationSpec(");
    boolean first = true;

    if (isSetEnableReplication()) {
      sb.append("enableReplication:");
      sb.append(this.enableReplication);
      first = false;
    }
    if (isSetThroughput()) {
      if (!first) sb.append(", ");
      sb.append("throughput:");
      if (this.throughput == null) {
        sb.append("null");
      } else {
        sb.append(this.throughput);
      }
      first = false;
    }
    if (isSetMaxSubscribers()) {
      if (!first) sb.append(", ");
      sb.append("maxSubscribers:");
      sb.append(this.maxSubscribers);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (throughput != null) {
      throughput.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReplicationSpecStandardSchemeFactory implements SchemeFactory {
    public ReplicationSpecStandardScheme getScheme() {
      return new ReplicationSpecStandardScheme();
    }
  }

  private static class ReplicationSpecStandardScheme extends StandardScheme<ReplicationSpec> {

    public void read(libthrift091.protocol.TProtocol iprot, ReplicationSpec struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENABLE_REPLICATION
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.enableReplication = iprot.readBool();
              struct.setEnableReplicationIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THROUGHPUT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.throughput = new ReplicationProvisionThroughput();
              struct.throughput.read(iprot);
              struct.setThroughputIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX_SUBSCRIBERS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxSubscribers = iprot.readI32();
              struct.setMaxSubscribersIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, ReplicationSpec struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetEnableReplication()) {
        oprot.writeFieldBegin(ENABLE_REPLICATION_FIELD_DESC);
        oprot.writeBool(struct.enableReplication);
        oprot.writeFieldEnd();
      }
      if (struct.throughput != null) {
        if (struct.isSetThroughput()) {
          oprot.writeFieldBegin(THROUGHPUT_FIELD_DESC);
          struct.throughput.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMaxSubscribers()) {
        oprot.writeFieldBegin(MAX_SUBSCRIBERS_FIELD_DESC);
        oprot.writeI32(struct.maxSubscribers);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReplicationSpecTupleSchemeFactory implements SchemeFactory {
    public ReplicationSpecTupleScheme getScheme() {
      return new ReplicationSpecTupleScheme();
    }
  }

  private static class ReplicationSpecTupleScheme extends TupleScheme<ReplicationSpec> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ReplicationSpec struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEnableReplication()) {
        optionals.set(0);
      }
      if (struct.isSetThroughput()) {
        optionals.set(1);
      }
      if (struct.isSetMaxSubscribers()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEnableReplication()) {
        oprot.writeBool(struct.enableReplication);
      }
      if (struct.isSetThroughput()) {
        struct.throughput.write(oprot);
      }
      if (struct.isSetMaxSubscribers()) {
        oprot.writeI32(struct.maxSubscribers);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ReplicationSpec struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.enableReplication = iprot.readBool();
        struct.setEnableReplicationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.throughput = new ReplicationProvisionThroughput();
        struct.throughput.read(iprot);
        struct.setThroughputIsSet(true);
      }
      if (incoming.get(2)) {
        struct.maxSubscribers = iprot.readI32();
        struct.setMaxSubscribersIsSet(true);
      }
    }
  }

}

