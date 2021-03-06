/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-3-7")
public class QueryPermissionRequest implements libthrift091.TBase<QueryPermissionRequest, QueryPermissionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<QueryPermissionRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryPermissionRequest");

  private static final libthrift091.protocol.TField RESOURCE_ID_FIELD_DESC = new libthrift091.protocol.TField("resourceId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryPermissionRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryPermissionRequestTupleSchemeFactory());
  }

  public String resourceId; // required
  /**
   * if developerId is null , then query the permission of the reuqester
   * else query the permission of the developerId
   * 
   */
  public String developerId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    RESOURCE_ID((short)1, "resourceId"),
    /**
     * if developerId is null , then query the permission of the reuqester
     * else query the permission of the developerId
     * 
     */
    DEVELOPER_ID((short)2, "developerId");

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
        case 1: // RESOURCE_ID
          return RESOURCE_ID;
        case 2: // DEVELOPER_ID
          return DEVELOPER_ID;
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
  private static final _Fields optionals[] = {_Fields.DEVELOPER_ID};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_ID, new libthrift091.meta_data.FieldMetaData("resourceId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryPermissionRequest.class, metaDataMap);
  }

  public QueryPermissionRequest() {
  }

  public QueryPermissionRequest(
    String resourceId)
  {
    this();
    this.resourceId = resourceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryPermissionRequest(QueryPermissionRequest other) {
    if (other.isSetResourceId()) {
      this.resourceId = other.resourceId;
    }
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
  }

  public QueryPermissionRequest deepCopy() {
    return new QueryPermissionRequest(this);
  }

  @Override
  public void clear() {
    this.resourceId = null;
    this.developerId = null;
  }

  public String getResourceId() {
    return this.resourceId;
  }

  public QueryPermissionRequest setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public void unsetResourceId() {
    this.resourceId = null;
  }

  /** Returns true if field resourceId is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceId() {
    return this.resourceId != null;
  }

  public void setResourceIdIsSet(boolean value) {
    if (!value) {
      this.resourceId = null;
    }
  }

  /**
   * if developerId is null , then query the permission of the reuqester
   * else query the permission of the developerId
   * 
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * if developerId is null , then query the permission of the reuqester
   * else query the permission of the developerId
   * 
   */
  public QueryPermissionRequest setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_ID:
      if (value == null) {
        unsetResourceId();
      } else {
        setResourceId((String)value);
      }
      break;

    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_ID:
      return getResourceId();

    case DEVELOPER_ID:
      return getDeveloperId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_ID:
      return isSetResourceId();
    case DEVELOPER_ID:
      return isSetDeveloperId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryPermissionRequest)
      return this.equals((QueryPermissionRequest)that);
    return false;
  }

  public boolean equals(QueryPermissionRequest that) {
    if (that == null)
      return false;

    boolean this_present_resourceId = true && this.isSetResourceId();
    boolean that_present_resourceId = true && that.isSetResourceId();
    if (this_present_resourceId || that_present_resourceId) {
      if (!(this_present_resourceId && that_present_resourceId))
        return false;
      if (!this.resourceId.equals(that.resourceId))
        return false;
    }

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceId = true && (isSetResourceId());
    list.add(present_resourceId);
    if (present_resourceId)
      list.add(resourceId);

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryPermissionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceId()).compareTo(other.isSetResourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.resourceId, other.resourceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
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
    StringBuilder sb = new StringBuilder("QueryPermissionRequest(");
    boolean first = true;

    sb.append("resourceId:");
    if (this.resourceId == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceId);
    }
    first = false;
    if (isSetDeveloperId()) {
      if (!first) sb.append(", ");
      sb.append("developerId:");
      if (this.developerId == null) {
        sb.append("null");
      } else {
        sb.append(this.developerId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (resourceId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'resourceId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class QueryPermissionRequestStandardSchemeFactory implements SchemeFactory {
    public QueryPermissionRequestStandardScheme getScheme() {
      return new QueryPermissionRequestStandardScheme();
    }
  }

  private static class QueryPermissionRequestStandardScheme extends StandardScheme<QueryPermissionRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryPermissionRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.resourceId = iprot.readString();
              struct.setResourceIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueryPermissionRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceId != null) {
        oprot.writeFieldBegin(RESOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.resourceId);
        oprot.writeFieldEnd();
      }
      if (struct.developerId != null) {
        if (struct.isSetDeveloperId()) {
          oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
          oprot.writeString(struct.developerId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryPermissionRequestTupleSchemeFactory implements SchemeFactory {
    public QueryPermissionRequestTupleScheme getScheme() {
      return new QueryPermissionRequestTupleScheme();
    }
  }

  private static class QueryPermissionRequestTupleScheme extends TupleScheme<QueryPermissionRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.resourceId);
      BitSet optionals = new BitSet();
      if (struct.isSetDeveloperId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDeveloperId()) {
        oprot.writeString(struct.developerId);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.resourceId = iprot.readString();
      struct.setResourceIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.developerId = iprot.readString();
        struct.setDeveloperIdIsSet(true);
      }
    }
  }

}

