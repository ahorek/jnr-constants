// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-18 23:07:54 +0000
package jnr.constants.platform.dragonflybsd;
public enum INet implements jnr.constants.Constant {
INET_ADDRSTRLEN(16L);
private final long value;
private INet(long value) { this.value = value; }
public static final long MIN_VALUE = 16L;
public static final long MAX_VALUE = 16L;

static final class StringTable {
  public static final java.util.Map<INet, String> descriptions = generateTable();
  public static final java.util.Map<INet, String> generateTable() {
    java.util.Map<INet, String> map = new java.util.EnumMap<INet, String>(INet.class);
  map.put(INET_ADDRSTRLEN, "INET_ADDRSTRLEN");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
