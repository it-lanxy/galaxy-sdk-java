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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-17")
public class GetMessageRequest implements libthrift091.TBase<GetMessageRequest, GetMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetMessageRequest");

  private static final libthrift091.protocol.TField TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicTalosResourceName", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField MESSAGE_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("messageOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField MAX_GET_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("maxGetMessageNumber", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField MAX_GET_MESSAGE_BYTES_FIELD_DESC = new libthrift091.protocol.TField("maxGetMessageBytes", libthrift091.protocol.TType.I32, (short)5);
  private static final libthrift091.protocol.TField SHOW_UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("showUnHandledMessageNumber", libthrift091.protocol.TType.BOOL, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetMessageRequestTupleSchemeFactory());
  }

  /**
   * The topicTalosResourceName is in TopicInfo that returned by CreateQueue,
   * you can also get TopicInfo by describeTopic;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName topicTalosResourceName; // required
  /**
   * The partitionId for getMessage, partitionId is continuous nimber that start
   * from 0;
   * 
   */
  public int partitionId; // required
  /**
   * The offset that from which to read message, can be MessageOffset.START_OFFSET,
   * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
   * 
   */
  public long messageOffset; // required
  /**
   * The max get message number, max is 10000 (1 ~ 10000)
   * 
   */
  public int maxGetMessageNumber; // optional
  /**
   * The max get message bytes, max is 10MB (1B ~ 10MB)
   * 
   */
  public int maxGetMessageBytes; // optional
  /**
   * Whether or not set unHandlerMessageNumber in GetMessageResponse;
   * 
   */
  public boolean showUnHandledMessageNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The topicTalosResourceName is in TopicInfo that returned by CreateQueue,
     * you can also get TopicInfo by describeTopic;
     * 
     */
    TOPIC_TALOS_RESOURCE_NAME((short)1, "topicTalosResourceName"),
    /**
     * The partitionId for getMessage, partitionId is continuous nimber that start
     * from 0;
     * 
     */
    PARTITION_ID((short)2, "partitionId"),
    /**
     * The offset that from which to read message, can be MessageOffset.START_OFFSET,
     * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
     * 
     */
    MESSAGE_OFFSET((short)3, "messageOffset"),
    /**
     * The max get message number, max is 10000 (1 ~ 10000)
     * 
     */
    MAX_GET_MESSAGE_NUMBER((short)4, "maxGetMessageNumber"),
    /**
     * The max get message bytes, max is 10MB (1B ~ 10MB)
     * 
     */
    MAX_GET_MESSAGE_BYTES((short)5, "maxGetMessageBytes"),
    /**
     * Whether or not set unHandlerMessageNumber in GetMessageResponse;
     * 
     */
    SHOW_UN_HANDLED_MESSAGE_NUMBER((short)6, "showUnHandledMessageNumber");

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
        case 1: // TOPIC_TALOS_RESOURCE_NAME
          return TOPIC_TALOS_RESOURCE_NAME;
        case 2: // PARTITION_ID
          return PARTITION_ID;
        case 3: // MESSAGE_OFFSET
          return MESSAGE_OFFSET;
        case 4: // MAX_GET_MESSAGE_NUMBER
          return MAX_GET_MESSAGE_NUMBER;
        case 5: // MAX_GET_MESSAGE_BYTES
          return MAX_GET_MESSAGE_BYTES;
        case 6: // SHOW_UN_HANDLED_MESSAGE_NUMBER
          return SHOW_UN_HANDLED_MESSAGE_NUMBER;
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
  private static final int __PARTITIONID_ISSET_ID = 0;
  private static final int __MESSAGEOFFSET_ISSET_ID = 1;
  private static final int __MAXGETMESSAGENUMBER_ISSET_ID = 2;
  private static final int __MAXGETMESSAGEBYTES_ISSET_ID = 3;
  private static final int __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX_GET_MESSAGE_NUMBER,_Fields.MAX_GET_MESSAGE_BYTES,_Fields.SHOW_UN_HANDLED_MESSAGE_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_TALOS_RESOURCE_NAME, new libthrift091.meta_data.FieldMetaData("topicTalosResourceName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName.class)));
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE_OFFSET, new libthrift091.meta_data.FieldMetaData("messageOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_GET_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("maxGetMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_GET_MESSAGE_BYTES, new libthrift091.meta_data.FieldMetaData("maxGetMessageBytes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.SHOW_UN_HANDLED_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("showUnHandledMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetMessageRequest.class, metaDataMap);
  }

  public GetMessageRequest() {
    this.showUnHandledMessageNumber = true;

  }

  public GetMessageRequest(
    com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName topicTalosResourceName,
    int partitionId,
    long messageOffset)
  {
    this();
    this.topicTalosResourceName = topicTalosResourceName;
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetMessageRequest(GetMessageRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopicTalosResourceName()) {
      this.topicTalosResourceName = new com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName(other.topicTalosResourceName);
    }
    this.partitionId = other.partitionId;
    this.messageOffset = other.messageOffset;
    this.maxGetMessageNumber = other.maxGetMessageNumber;
    this.maxGetMessageBytes = other.maxGetMessageBytes;
    this.showUnHandledMessageNumber = other.showUnHandledMessageNumber;
  }

  public GetMessageRequest deepCopy() {
    return new GetMessageRequest(this);
  }

  @Override
  public void clear() {
    this.topicTalosResourceName = null;
    setPartitionIdIsSet(false);
    this.partitionId = 0;
    setMessageOffsetIsSet(false);
    this.messageOffset = 0;
    setMaxGetMessageNumberIsSet(false);
    this.maxGetMessageNumber = 0;
    setMaxGetMessageBytesIsSet(false);
    this.maxGetMessageBytes = 0;
    this.showUnHandledMessageNumber = true;

  }

  /**
   * The topicTalosResourceName is in TopicInfo that returned by CreateQueue,
   * you can also get TopicInfo by describeTopic;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName getTopicTalosResourceName() {
    return this.topicTalosResourceName;
  }

  /**
   * The topicTalosResourceName is in TopicInfo that returned by CreateQueue,
   * you can also get TopicInfo by describeTopic;
   * 
   */
  public GetMessageRequest setTopicTalosResourceName(com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName topicTalosResourceName) {
    this.topicTalosResourceName = topicTalosResourceName;
    return this;
  }

  public void unsetTopicTalosResourceName() {
    this.topicTalosResourceName = null;
  }

  /** Returns true if field topicTalosResourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicTalosResourceName() {
    return this.topicTalosResourceName != null;
  }

  public void setTopicTalosResourceNameIsSet(boolean value) {
    if (!value) {
      this.topicTalosResourceName = null;
    }
  }

  /**
   * The partitionId for getMessage, partitionId is continuous nimber that start
   * from 0;
   * 
   */
  public int getPartitionId() {
    return this.partitionId;
  }

  /**
   * The partitionId for getMessage, partitionId is continuous nimber that start
   * from 0;
   * 
   */
  public GetMessageRequest setPartitionId(int partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  /**
   * The offset that from which to read message, can be MessageOffset.START_OFFSET,
   * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
   * 
   */
  public long getMessageOffset() {
    return this.messageOffset;
  }

  /**
   * The offset that from which to read message, can be MessageOffset.START_OFFSET,
   * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
   * 
   */
  public GetMessageRequest setMessageOffset(long messageOffset) {
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
    return this;
  }

  public void unsetMessageOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  /** Returns true if field messageOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  public void setMessageOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID, value);
  }

  /**
   * The max get message number, max is 10000 (1 ~ 10000)
   * 
   */
  public int getMaxGetMessageNumber() {
    return this.maxGetMessageNumber;
  }

  /**
   * The max get message number, max is 10000 (1 ~ 10000)
   * 
   */
  public GetMessageRequest setMaxGetMessageNumber(int maxGetMessageNumber) {
    this.maxGetMessageNumber = maxGetMessageNumber;
    setMaxGetMessageNumberIsSet(true);
    return this;
  }

  public void unsetMaxGetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXGETMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field maxGetMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxGetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXGETMESSAGENUMBER_ISSET_ID);
  }

  public void setMaxGetMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXGETMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The max get message bytes, max is 10MB (1B ~ 10MB)
   * 
   */
  public int getMaxGetMessageBytes() {
    return this.maxGetMessageBytes;
  }

  /**
   * The max get message bytes, max is 10MB (1B ~ 10MB)
   * 
   */
  public GetMessageRequest setMaxGetMessageBytes(int maxGetMessageBytes) {
    this.maxGetMessageBytes = maxGetMessageBytes;
    setMaxGetMessageBytesIsSet(true);
    return this;
  }

  public void unsetMaxGetMessageBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXGETMESSAGEBYTES_ISSET_ID);
  }

  /** Returns true if field maxGetMessageBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxGetMessageBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXGETMESSAGEBYTES_ISSET_ID);
  }

  public void setMaxGetMessageBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXGETMESSAGEBYTES_ISSET_ID, value);
  }

  /**
   * Whether or not set unHandlerMessageNumber in GetMessageResponse;
   * 
   */
  public boolean isShowUnHandledMessageNumber() {
    return this.showUnHandledMessageNumber;
  }

  /**
   * Whether or not set unHandlerMessageNumber in GetMessageResponse;
   * 
   */
  public GetMessageRequest setShowUnHandledMessageNumber(boolean showUnHandledMessageNumber) {
    this.showUnHandledMessageNumber = showUnHandledMessageNumber;
    setShowUnHandledMessageNumberIsSet(true);
    return this;
  }

  public void unsetShowUnHandledMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field showUnHandledMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetShowUnHandledMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  public void setShowUnHandledMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      if (value == null) {
        unsetTopicTalosResourceName();
      } else {
        setTopicTalosResourceName((com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName)value);
      }
      break;

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Integer)value);
      }
      break;

    case MESSAGE_OFFSET:
      if (value == null) {
        unsetMessageOffset();
      } else {
        setMessageOffset((Long)value);
      }
      break;

    case MAX_GET_MESSAGE_NUMBER:
      if (value == null) {
        unsetMaxGetMessageNumber();
      } else {
        setMaxGetMessageNumber((Integer)value);
      }
      break;

    case MAX_GET_MESSAGE_BYTES:
      if (value == null) {
        unsetMaxGetMessageBytes();
      } else {
        setMaxGetMessageBytes((Integer)value);
      }
      break;

    case SHOW_UN_HANDLED_MESSAGE_NUMBER:
      if (value == null) {
        unsetShowUnHandledMessageNumber();
      } else {
        setShowUnHandledMessageNumber((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      return getTopicTalosResourceName();

    case PARTITION_ID:
      return Integer.valueOf(getPartitionId());

    case MESSAGE_OFFSET:
      return Long.valueOf(getMessageOffset());

    case MAX_GET_MESSAGE_NUMBER:
      return Integer.valueOf(getMaxGetMessageNumber());

    case MAX_GET_MESSAGE_BYTES:
      return Integer.valueOf(getMaxGetMessageBytes());

    case SHOW_UN_HANDLED_MESSAGE_NUMBER:
      return Boolean.valueOf(isShowUnHandledMessageNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      return isSetTopicTalosResourceName();
    case PARTITION_ID:
      return isSetPartitionId();
    case MESSAGE_OFFSET:
      return isSetMessageOffset();
    case MAX_GET_MESSAGE_NUMBER:
      return isSetMaxGetMessageNumber();
    case MAX_GET_MESSAGE_BYTES:
      return isSetMaxGetMessageBytes();
    case SHOW_UN_HANDLED_MESSAGE_NUMBER:
      return isSetShowUnHandledMessageNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetMessageRequest)
      return this.equals((GetMessageRequest)that);
    return false;
  }

  public boolean equals(GetMessageRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicTalosResourceName = true && this.isSetTopicTalosResourceName();
    boolean that_present_topicTalosResourceName = true && that.isSetTopicTalosResourceName();
    if (this_present_topicTalosResourceName || that_present_topicTalosResourceName) {
      if (!(this_present_topicTalosResourceName && that_present_topicTalosResourceName))
        return false;
      if (!this.topicTalosResourceName.equals(that.topicTalosResourceName))
        return false;
    }

    boolean this_present_partitionId = true;
    boolean that_present_partitionId = true;
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    boolean this_present_messageOffset = true;
    boolean that_present_messageOffset = true;
    if (this_present_messageOffset || that_present_messageOffset) {
      if (!(this_present_messageOffset && that_present_messageOffset))
        return false;
      if (this.messageOffset != that.messageOffset)
        return false;
    }

    boolean this_present_maxGetMessageNumber = true && this.isSetMaxGetMessageNumber();
    boolean that_present_maxGetMessageNumber = true && that.isSetMaxGetMessageNumber();
    if (this_present_maxGetMessageNumber || that_present_maxGetMessageNumber) {
      if (!(this_present_maxGetMessageNumber && that_present_maxGetMessageNumber))
        return false;
      if (this.maxGetMessageNumber != that.maxGetMessageNumber)
        return false;
    }

    boolean this_present_maxGetMessageBytes = true && this.isSetMaxGetMessageBytes();
    boolean that_present_maxGetMessageBytes = true && that.isSetMaxGetMessageBytes();
    if (this_present_maxGetMessageBytes || that_present_maxGetMessageBytes) {
      if (!(this_present_maxGetMessageBytes && that_present_maxGetMessageBytes))
        return false;
      if (this.maxGetMessageBytes != that.maxGetMessageBytes)
        return false;
    }

    boolean this_present_showUnHandledMessageNumber = true && this.isSetShowUnHandledMessageNumber();
    boolean that_present_showUnHandledMessageNumber = true && that.isSetShowUnHandledMessageNumber();
    if (this_present_showUnHandledMessageNumber || that_present_showUnHandledMessageNumber) {
      if (!(this_present_showUnHandledMessageNumber && that_present_showUnHandledMessageNumber))
        return false;
      if (this.showUnHandledMessageNumber != that.showUnHandledMessageNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicTalosResourceName = true && (isSetTopicTalosResourceName());
    list.add(present_topicTalosResourceName);
    if (present_topicTalosResourceName)
      list.add(topicTalosResourceName);

    boolean present_partitionId = true;
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    boolean present_messageOffset = true;
    list.add(present_messageOffset);
    if (present_messageOffset)
      list.add(messageOffset);

    boolean present_maxGetMessageNumber = true && (isSetMaxGetMessageNumber());
    list.add(present_maxGetMessageNumber);
    if (present_maxGetMessageNumber)
      list.add(maxGetMessageNumber);

    boolean present_maxGetMessageBytes = true && (isSetMaxGetMessageBytes());
    list.add(present_maxGetMessageBytes);
    if (present_maxGetMessageBytes)
      list.add(maxGetMessageBytes);

    boolean present_showUnHandledMessageNumber = true && (isSetShowUnHandledMessageNumber());
    list.add(present_showUnHandledMessageNumber);
    if (present_showUnHandledMessageNumber)
      list.add(showUnHandledMessageNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetMessageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicTalosResourceName()).compareTo(other.isSetTopicTalosResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicTalosResourceName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicTalosResourceName, other.topicTalosResourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageOffset()).compareTo(other.isSetMessageOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageOffset, other.messageOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxGetMessageNumber()).compareTo(other.isSetMaxGetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxGetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxGetMessageNumber, other.maxGetMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxGetMessageBytes()).compareTo(other.isSetMaxGetMessageBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxGetMessageBytes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxGetMessageBytes, other.maxGetMessageBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShowUnHandledMessageNumber()).compareTo(other.isSetShowUnHandledMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShowUnHandledMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.showUnHandledMessageNumber, other.showUnHandledMessageNumber);
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
    StringBuilder sb = new StringBuilder("GetMessageRequest(");
    boolean first = true;

    sb.append("topicTalosResourceName:");
    if (this.topicTalosResourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicTalosResourceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitionId:");
    sb.append(this.partitionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageOffset:");
    sb.append(this.messageOffset);
    first = false;
    if (isSetMaxGetMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("maxGetMessageNumber:");
      sb.append(this.maxGetMessageNumber);
      first = false;
    }
    if (isSetMaxGetMessageBytes()) {
      if (!first) sb.append(", ");
      sb.append("maxGetMessageBytes:");
      sb.append(this.maxGetMessageBytes);
      first = false;
    }
    if (isSetShowUnHandledMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("showUnHandledMessageNumber:");
      sb.append(this.showUnHandledMessageNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicTalosResourceName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicTalosResourceName' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'partitionId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'messageOffset' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (topicTalosResourceName != null) {
      topicTalosResourceName.validate();
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

  private static class GetMessageRequestStandardSchemeFactory implements SchemeFactory {
    public GetMessageRequestStandardScheme getScheme() {
      return new GetMessageRequestStandardScheme();
    }
  }

  private static class GetMessageRequestStandardScheme extends StandardScheme<GetMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, GetMessageRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_TALOS_RESOURCE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicTalosResourceName = new com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName();
              struct.topicTalosResourceName.read(iprot);
              struct.setTopicTalosResourceNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionId = iprot.readI32();
              struct.setPartitionIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageOffset = iprot.readI64();
              struct.setMessageOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_GET_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxGetMessageNumber = iprot.readI32();
              struct.setMaxGetMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAX_GET_MESSAGE_BYTES
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxGetMessageBytes = iprot.readI32();
              struct.setMaxGetMessageBytesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SHOW_UN_HANDLED_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.showUnHandledMessageNumber = iprot.readBool();
              struct.setShowUnHandledMessageNumberIsSet(true);
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
      if (!struct.isSetPartitionId()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'partitionId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageOffset' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, GetMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicTalosResourceName != null) {
        oprot.writeFieldBegin(TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC);
        struct.topicTalosResourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
      oprot.writeI32(struct.partitionId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MESSAGE_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.messageOffset);
      oprot.writeFieldEnd();
      if (struct.isSetMaxGetMessageNumber()) {
        oprot.writeFieldBegin(MAX_GET_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.maxGetMessageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxGetMessageBytes()) {
        oprot.writeFieldBegin(MAX_GET_MESSAGE_BYTES_FIELD_DESC);
        oprot.writeI32(struct.maxGetMessageBytes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetShowUnHandledMessageNumber()) {
        oprot.writeFieldBegin(SHOW_UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeBool(struct.showUnHandledMessageNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetMessageRequestTupleSchemeFactory implements SchemeFactory {
    public GetMessageRequestTupleScheme getScheme() {
      return new GetMessageRequestTupleScheme();
    }
  }

  private static class GetMessageRequestTupleScheme extends TupleScheme<GetMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicTalosResourceName.write(oprot);
      oprot.writeI32(struct.partitionId);
      oprot.writeI64(struct.messageOffset);
      BitSet optionals = new BitSet();
      if (struct.isSetMaxGetMessageNumber()) {
        optionals.set(0);
      }
      if (struct.isSetMaxGetMessageBytes()) {
        optionals.set(1);
      }
      if (struct.isSetShowUnHandledMessageNumber()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMaxGetMessageNumber()) {
        oprot.writeI32(struct.maxGetMessageNumber);
      }
      if (struct.isSetMaxGetMessageBytes()) {
        oprot.writeI32(struct.maxGetMessageBytes);
      }
      if (struct.isSetShowUnHandledMessageNumber()) {
        oprot.writeBool(struct.showUnHandledMessageNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicTalosResourceName = new com.xiaomi.infra.galaxy.talos.thrift.TopicTalosResourceName();
      struct.topicTalosResourceName.read(iprot);
      struct.setTopicTalosResourceNameIsSet(true);
      struct.partitionId = iprot.readI32();
      struct.setPartitionIdIsSet(true);
      struct.messageOffset = iprot.readI64();
      struct.setMessageOffsetIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.maxGetMessageNumber = iprot.readI32();
        struct.setMaxGetMessageNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxGetMessageBytes = iprot.readI32();
        struct.setMaxGetMessageBytesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.showUnHandledMessageNumber = iprot.readBool();
        struct.setShowUnHandledMessageNumberIsSet(true);
      }
    }
  }

}

