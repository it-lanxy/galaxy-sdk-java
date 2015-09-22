/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-22")
public class CreateTopicRequest implements libthrift091.TBase<CreateTopicRequest, CreateTopicRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CreateTopicRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("CreateTopicRequest");

  private static final libthrift091.protocol.TField TOPIC_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TOPIC_ATTRIBUTE_FIELD_DESC = new libthrift091.protocol.TField("topicAttribute", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateTopicRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateTopicRequestTupleSchemeFactory());
  }

  /**
   * Topic name;
   * 
   */
  public String topicName; // required
  /**
   * TopicAttribute for the topic, partitionNumber is required;
   * 
   */
  public TopicAttribute topicAttribute; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Topic name;
     * 
     */
    TOPIC_NAME((short)1, "topicName"),
    /**
     * TopicAttribute for the topic, partitionNumber is required;
     * 
     */
    TOPIC_ATTRIBUTE((short)2, "topicAttribute");

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
        case 1: // TOPIC_NAME
          return TOPIC_NAME;
        case 2: // TOPIC_ATTRIBUTE
          return TOPIC_ATTRIBUTE;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_NAME, new libthrift091.meta_data.FieldMetaData("topicName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOPIC_ATTRIBUTE, new libthrift091.meta_data.FieldMetaData("topicAttribute", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicAttribute.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(CreateTopicRequest.class, metaDataMap);
  }

  public CreateTopicRequest() {
  }

  public CreateTopicRequest(
    String topicName,
    TopicAttribute topicAttribute)
  {
    this();
    this.topicName = topicName;
    this.topicAttribute = topicAttribute;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateTopicRequest(CreateTopicRequest other) {
    if (other.isSetTopicName()) {
      this.topicName = other.topicName;
    }
    if (other.isSetTopicAttribute()) {
      this.topicAttribute = new TopicAttribute(other.topicAttribute);
    }
  }

  public CreateTopicRequest deepCopy() {
    return new CreateTopicRequest(this);
  }

  @Override
  public void clear() {
    this.topicName = null;
    this.topicAttribute = null;
  }

  /**
   * Topic name;
   * 
   */
  public String getTopicName() {
    return this.topicName;
  }

  /**
   * Topic name;
   * 
   */
  public CreateTopicRequest setTopicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  public void unsetTopicName() {
    this.topicName = null;
  }

  /** Returns true if field topicName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicName() {
    return this.topicName != null;
  }

  public void setTopicNameIsSet(boolean value) {
    if (!value) {
      this.topicName = null;
    }
  }

  /**
   * TopicAttribute for the topic, partitionNumber is required;
   * 
   */
  public TopicAttribute getTopicAttribute() {
    return this.topicAttribute;
  }

  /**
   * TopicAttribute for the topic, partitionNumber is required;
   * 
   */
  public CreateTopicRequest setTopicAttribute(TopicAttribute topicAttribute) {
    this.topicAttribute = topicAttribute;
    return this;
  }

  public void unsetTopicAttribute() {
    this.topicAttribute = null;
  }

  /** Returns true if field topicAttribute is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAttribute() {
    return this.topicAttribute != null;
  }

  public void setTopicAttributeIsSet(boolean value) {
    if (!value) {
      this.topicAttribute = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_NAME:
      if (value == null) {
        unsetTopicName();
      } else {
        setTopicName((String)value);
      }
      break;

    case TOPIC_ATTRIBUTE:
      if (value == null) {
        unsetTopicAttribute();
      } else {
        setTopicAttribute((TopicAttribute)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_NAME:
      return getTopicName();

    case TOPIC_ATTRIBUTE:
      return getTopicAttribute();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_NAME:
      return isSetTopicName();
    case TOPIC_ATTRIBUTE:
      return isSetTopicAttribute();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateTopicRequest)
      return this.equals((CreateTopicRequest)that);
    return false;
  }

  public boolean equals(CreateTopicRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicName = true && this.isSetTopicName();
    boolean that_present_topicName = true && that.isSetTopicName();
    if (this_present_topicName || that_present_topicName) {
      if (!(this_present_topicName && that_present_topicName))
        return false;
      if (!this.topicName.equals(that.topicName))
        return false;
    }

    boolean this_present_topicAttribute = true && this.isSetTopicAttribute();
    boolean that_present_topicAttribute = true && that.isSetTopicAttribute();
    if (this_present_topicAttribute || that_present_topicAttribute) {
      if (!(this_present_topicAttribute && that_present_topicAttribute))
        return false;
      if (!this.topicAttribute.equals(that.topicAttribute))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicName = true && (isSetTopicName());
    list.add(present_topicName);
    if (present_topicName)
      list.add(topicName);

    boolean present_topicAttribute = true && (isSetTopicAttribute());
    list.add(present_topicAttribute);
    if (present_topicAttribute)
      list.add(topicAttribute);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateTopicRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicName()).compareTo(other.isSetTopicName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicName, other.topicName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicAttribute()).compareTo(other.isSetTopicAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAttribute()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAttribute, other.topicAttribute);
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
    StringBuilder sb = new StringBuilder("CreateTopicRequest(");
    boolean first = true;

    sb.append("topicName:");
    if (this.topicName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicAttribute:");
    if (this.topicAttribute == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAttribute);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicName' was not present! Struct: " + toString());
    }
    if (topicAttribute == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAttribute' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAttribute != null) {
      topicAttribute.validate();
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreateTopicRequestStandardSchemeFactory implements SchemeFactory {
    public CreateTopicRequestStandardScheme getScheme() {
      return new CreateTopicRequestStandardScheme();
    }
  }

  private static class CreateTopicRequestStandardScheme extends StandardScheme<CreateTopicRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, CreateTopicRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.topicName = iprot.readString();
              struct.setTopicNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_ATTRIBUTE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAttribute = new TopicAttribute();
              struct.topicAttribute.read(iprot);
              struct.setTopicAttributeIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, CreateTopicRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicName != null) {
        oprot.writeFieldBegin(TOPIC_NAME_FIELD_DESC);
        oprot.writeString(struct.topicName);
        oprot.writeFieldEnd();
      }
      if (struct.topicAttribute != null) {
        oprot.writeFieldBegin(TOPIC_ATTRIBUTE_FIELD_DESC);
        struct.topicAttribute.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateTopicRequestTupleSchemeFactory implements SchemeFactory {
    public CreateTopicRequestTupleScheme getScheme() {
      return new CreateTopicRequestTupleScheme();
    }
  }

  private static class CreateTopicRequestTupleScheme extends TupleScheme<CreateTopicRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, CreateTopicRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topicName);
      struct.topicAttribute.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, CreateTopicRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicName = iprot.readString();
      struct.setTopicNameIsSet(true);
      struct.topicAttribute = new TopicAttribute();
      struct.topicAttribute.read(iprot);
      struct.setTopicAttributeIsSet(true);
    }
  }

}

