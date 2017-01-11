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
 * internal mutation log entry
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-12-30")
public class InternalMutationLogEntry implements libthrift091.TBase<InternalMutationLogEntry, InternalMutationLogEntry._Fields>, java.io.Serializable, Cloneable, Comparable<InternalMutationLogEntry> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("InternalMutationLogEntry");

  private static final libthrift091.protocol.TField RECORD_FIELD_DESC = new libthrift091.protocol.TField("record", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField TYPE_FIELD_DESC = new libthrift091.protocol.TField("type", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField ROW_DELETED_FIELD_DESC = new libthrift091.protocol.TField("rowDeleted", libthrift091.protocol.TType.BOOL, (short)3);
  private static final libthrift091.protocol.TField AMOUNTS_FIELD_DESC = new libthrift091.protocol.TField("amounts", libthrift091.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InternalMutationLogEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InternalMutationLogEntryTupleSchemeFactory());
  }

  /**
   * row key and items
   */
  public Map<String,ByteBuffer> record; // optional
  /**
   * mutation type
   * 
   * @see MutationType
   */
  public MutationType type; // optional
  /**
   * is row deleted or not
   */
  public boolean rowDeleted; // optional
  /**
   * increment amounts
   */
  public Map<String,ByteBuffer> amounts; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * row key and items
     */
    RECORD((short)1, "record"),
    /**
     * mutation type
     * 
     * @see MutationType
     */
    TYPE((short)2, "type"),
    /**
     * is row deleted or not
     */
    ROW_DELETED((short)3, "rowDeleted"),
    /**
     * increment amounts
     */
    AMOUNTS((short)4, "amounts");

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
        case 1: // RECORD
          return RECORD;
        case 2: // TYPE
          return TYPE;
        case 3: // ROW_DELETED
          return ROW_DELETED;
        case 4: // AMOUNTS
          return AMOUNTS;
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
  private static final int __ROWDELETED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RECORD,_Fields.TYPE,_Fields.ROW_DELETED,_Fields.AMOUNTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECORD, new libthrift091.meta_data.FieldMetaData("record", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.TYPE, new libthrift091.meta_data.FieldMetaData("type", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MutationType.class)));
    tmpMap.put(_Fields.ROW_DELETED, new libthrift091.meta_data.FieldMetaData("rowDeleted", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.AMOUNTS, new libthrift091.meta_data.FieldMetaData("amounts", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING            , true))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(InternalMutationLogEntry.class, metaDataMap);
  }

  public InternalMutationLogEntry() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InternalMutationLogEntry(InternalMutationLogEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRecord()) {
      Map<String,ByteBuffer> __this__record = new HashMap<String,ByteBuffer>(other.record);
      this.record = __this__record;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.rowDeleted = other.rowDeleted;
    if (other.isSetAmounts()) {
      Map<String,ByteBuffer> __this__amounts = new HashMap<String,ByteBuffer>(other.amounts);
      this.amounts = __this__amounts;
    }
  }

  public InternalMutationLogEntry deepCopy() {
    return new InternalMutationLogEntry(this);
  }

  @Override
  public void clear() {
    this.record = null;
    this.type = null;
    setRowDeletedIsSet(false);
    this.rowDeleted = false;
    this.amounts = null;
  }

  public int getRecordSize() {
    return (this.record == null) ? 0 : this.record.size();
  }

  public void putToRecord(String key, ByteBuffer val) {
    if (this.record == null) {
      this.record = new HashMap<String,ByteBuffer>();
    }
    this.record.put(key, val);
  }

  /**
   * row key and items
   */
  public Map<String,ByteBuffer> getRecord() {
    return this.record;
  }

  /**
   * row key and items
   */
  public InternalMutationLogEntry setRecord(Map<String,ByteBuffer> record) {
    this.record = record;
    return this;
  }

  public void unsetRecord() {
    this.record = null;
  }

  /** Returns true if field record is set (has been assigned a value) and false otherwise */
  public boolean isSetRecord() {
    return this.record != null;
  }

  public void setRecordIsSet(boolean value) {
    if (!value) {
      this.record = null;
    }
  }

  /**
   * mutation type
   * 
   * @see MutationType
   */
  public MutationType getType() {
    return this.type;
  }

  /**
   * mutation type
   * 
   * @see MutationType
   */
  public InternalMutationLogEntry setType(MutationType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * is row deleted or not
   */
  public boolean isRowDeleted() {
    return this.rowDeleted;
  }

  /**
   * is row deleted or not
   */
  public InternalMutationLogEntry setRowDeleted(boolean rowDeleted) {
    this.rowDeleted = rowDeleted;
    setRowDeletedIsSet(true);
    return this;
  }

  public void unsetRowDeleted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWDELETED_ISSET_ID);
  }

  /** Returns true if field rowDeleted is set (has been assigned a value) and false otherwise */
  public boolean isSetRowDeleted() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWDELETED_ISSET_ID);
  }

  public void setRowDeletedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWDELETED_ISSET_ID, value);
  }

  public int getAmountsSize() {
    return (this.amounts == null) ? 0 : this.amounts.size();
  }

  public void putToAmounts(String key, ByteBuffer val) {
    if (this.amounts == null) {
      this.amounts = new HashMap<String,ByteBuffer>();
    }
    this.amounts.put(key, val);
  }

  /**
   * increment amounts
   */
  public Map<String,ByteBuffer> getAmounts() {
    return this.amounts;
  }

  /**
   * increment amounts
   */
  public InternalMutationLogEntry setAmounts(Map<String,ByteBuffer> amounts) {
    this.amounts = amounts;
    return this;
  }

  public void unsetAmounts() {
    this.amounts = null;
  }

  /** Returns true if field amounts is set (has been assigned a value) and false otherwise */
  public boolean isSetAmounts() {
    return this.amounts != null;
  }

  public void setAmountsIsSet(boolean value) {
    if (!value) {
      this.amounts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECORD:
      if (value == null) {
        unsetRecord();
      } else {
        setRecord((Map<String,ByteBuffer>)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((MutationType)value);
      }
      break;

    case ROW_DELETED:
      if (value == null) {
        unsetRowDeleted();
      } else {
        setRowDeleted((Boolean)value);
      }
      break;

    case AMOUNTS:
      if (value == null) {
        unsetAmounts();
      } else {
        setAmounts((Map<String,ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECORD:
      return getRecord();

    case TYPE:
      return getType();

    case ROW_DELETED:
      return Boolean.valueOf(isRowDeleted());

    case AMOUNTS:
      return getAmounts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECORD:
      return isSetRecord();
    case TYPE:
      return isSetType();
    case ROW_DELETED:
      return isSetRowDeleted();
    case AMOUNTS:
      return isSetAmounts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InternalMutationLogEntry)
      return this.equals((InternalMutationLogEntry)that);
    return false;
  }

  public boolean equals(InternalMutationLogEntry that) {
    if (that == null)
      return false;

    boolean this_present_record = true && this.isSetRecord();
    boolean that_present_record = true && that.isSetRecord();
    if (this_present_record || that_present_record) {
      if (!(this_present_record && that_present_record))
        return false;
      if (!this.record.equals(that.record))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_rowDeleted = true && this.isSetRowDeleted();
    boolean that_present_rowDeleted = true && that.isSetRowDeleted();
    if (this_present_rowDeleted || that_present_rowDeleted) {
      if (!(this_present_rowDeleted && that_present_rowDeleted))
        return false;
      if (this.rowDeleted != that.rowDeleted)
        return false;
    }

    boolean this_present_amounts = true && this.isSetAmounts();
    boolean that_present_amounts = true && that.isSetAmounts();
    if (this_present_amounts || that_present_amounts) {
      if (!(this_present_amounts && that_present_amounts))
        return false;
      if (!this.amounts.equals(that.amounts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_record = true && (isSetRecord());
    list.add(present_record);
    if (present_record)
      list.add(record);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_rowDeleted = true && (isSetRowDeleted());
    list.add(present_rowDeleted);
    if (present_rowDeleted)
      list.add(rowDeleted);

    boolean present_amounts = true && (isSetAmounts());
    list.add(present_amounts);
    if (present_amounts)
      list.add(amounts);

    return list.hashCode();
  }

  @Override
  public int compareTo(InternalMutationLogEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRecord()).compareTo(other.isSetRecord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecord()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.record, other.record);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowDeleted()).compareTo(other.isSetRowDeleted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowDeleted()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rowDeleted, other.rowDeleted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmounts()).compareTo(other.isSetAmounts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmounts()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.amounts, other.amounts);
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
    StringBuilder sb = new StringBuilder("InternalMutationLogEntry(");
    boolean first = true;

    if (isSetRecord()) {
      sb.append("record:");
      if (this.record == null) {
        sb.append("null");
      } else {
        sb.append(this.record);
      }
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetRowDeleted()) {
      if (!first) sb.append(", ");
      sb.append("rowDeleted:");
      sb.append(this.rowDeleted);
      first = false;
    }
    if (isSetAmounts()) {
      if (!first) sb.append(", ");
      sb.append("amounts:");
      if (this.amounts == null) {
        sb.append("null");
      } else {
        sb.append(this.amounts);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InternalMutationLogEntryStandardSchemeFactory implements SchemeFactory {
    public InternalMutationLogEntryStandardScheme getScheme() {
      return new InternalMutationLogEntryStandardScheme();
    }
  }

  private static class InternalMutationLogEntryStandardScheme extends StandardScheme<InternalMutationLogEntry> {

    public void read(libthrift091.protocol.TProtocol iprot, InternalMutationLogEntry struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECORD
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map374 = iprot.readMapBegin();
                struct.record = new HashMap<String,ByteBuffer>(2*_map374.size);
                String _key375;
                ByteBuffer _val376;
                for (int _i377 = 0; _i377 < _map374.size; ++_i377)
                {
                  _key375 = iprot.readString();
                  _val376 = iprot.readBinary();
                  struct.record.put(_key375, _val376);
                }
                iprot.readMapEnd();
              }
              struct.setRecordIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.type = com.xiaomi.infra.galaxy.sds.thrift.MutationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROW_DELETED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.rowDeleted = iprot.readBool();
              struct.setRowDeletedIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AMOUNTS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map378 = iprot.readMapBegin();
                struct.amounts = new HashMap<String,ByteBuffer>(2*_map378.size);
                String _key379;
                ByteBuffer _val380;
                for (int _i381 = 0; _i381 < _map378.size; ++_i381)
                {
                  _key379 = iprot.readString();
                  _val380 = iprot.readBinary();
                  struct.amounts.put(_key379, _val380);
                }
                iprot.readMapEnd();
              }
              struct.setAmountsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, InternalMutationLogEntry struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.record != null) {
        if (struct.isSetRecord()) {
          oprot.writeFieldBegin(RECORD_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.record.size()));
            for (Map.Entry<String, ByteBuffer> _iter382 : struct.record.entrySet())
            {
              oprot.writeString(_iter382.getKey());
              oprot.writeBinary(_iter382.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRowDeleted()) {
        oprot.writeFieldBegin(ROW_DELETED_FIELD_DESC);
        oprot.writeBool(struct.rowDeleted);
        oprot.writeFieldEnd();
      }
      if (struct.amounts != null) {
        if (struct.isSetAmounts()) {
          oprot.writeFieldBegin(AMOUNTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.amounts.size()));
            for (Map.Entry<String, ByteBuffer> _iter383 : struct.amounts.entrySet())
            {
              oprot.writeString(_iter383.getKey());
              oprot.writeBinary(_iter383.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InternalMutationLogEntryTupleSchemeFactory implements SchemeFactory {
    public InternalMutationLogEntryTupleScheme getScheme() {
      return new InternalMutationLogEntryTupleScheme();
    }
  }

  private static class InternalMutationLogEntryTupleScheme extends TupleScheme<InternalMutationLogEntry> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, InternalMutationLogEntry struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRecord()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetRowDeleted()) {
        optionals.set(2);
      }
      if (struct.isSetAmounts()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRecord()) {
        {
          oprot.writeI32(struct.record.size());
          for (Map.Entry<String, ByteBuffer> _iter384 : struct.record.entrySet())
          {
            oprot.writeString(_iter384.getKey());
            oprot.writeBinary(_iter384.getValue());
          }
        }
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetRowDeleted()) {
        oprot.writeBool(struct.rowDeleted);
      }
      if (struct.isSetAmounts()) {
        {
          oprot.writeI32(struct.amounts.size());
          for (Map.Entry<String, ByteBuffer> _iter385 : struct.amounts.entrySet())
          {
            oprot.writeString(_iter385.getKey());
            oprot.writeBinary(_iter385.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, InternalMutationLogEntry struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map386 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.record = new HashMap<String,ByteBuffer>(2*_map386.size);
          String _key387;
          ByteBuffer _val388;
          for (int _i389 = 0; _i389 < _map386.size; ++_i389)
          {
            _key387 = iprot.readString();
            _val388 = iprot.readBinary();
            struct.record.put(_key387, _val388);
          }
        }
        struct.setRecordIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = com.xiaomi.infra.galaxy.sds.thrift.MutationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rowDeleted = iprot.readBool();
        struct.setRowDeletedIsSet(true);
      }
      if (incoming.get(3)) {
        {
          libthrift091.protocol.TMap _map390 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.amounts = new HashMap<String,ByteBuffer>(2*_map390.size);
          String _key391;
          ByteBuffer _val392;
          for (int _i393 = 0; _i393 < _map390.size; ++_i393)
          {
            _key391 = iprot.readString();
            _val392 = iprot.readBinary();
            struct.amounts.put(_key391, _val392);
          }
        }
        struct.setAmountsIsSet(true);
      }
    }
  }

}

