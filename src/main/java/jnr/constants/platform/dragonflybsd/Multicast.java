// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-18 23:07:52 +0000
package jnr.constants.platform.dragonflybsd;
public enum Multicast implements jnr.constants.Constant {
;
// MCAST_JOIN_GROUP not defined
// MCAST_BLOCK_SOURCE not defined
// MCAST_UNBLOCK_SOURCE not defined
// MCAST_LEAVE_GROUP not defined
// MCAST_JOIN_SOURCE_GROUP not defined
// MCAST_LEAVE_SOURCE_GROUP not defined
// MCAST_MSFILTER not defined
// MCAST_EXCLUDE not defined
// MCAST_INCLUDE not defined
private final long value;
private Multicast(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 0L;

public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
