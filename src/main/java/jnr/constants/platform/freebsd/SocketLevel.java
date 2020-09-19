// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-19 00:15:35 +0000
package jnr.constants.platform.freebsd;
public enum SocketLevel implements jnr.constants.Constant {
SOL_SOCKET(65535L);
// SOL_IP not defined
// SOL_TCP not defined
// SOL_UDP not defined
// SOL_IPV6 not defined
private final long value;
private SocketLevel(long value) { this.value = value; }
public static final long MIN_VALUE = 65535L;
public static final long MAX_VALUE = 65535L;

static final class StringTable {
  public static final java.util.Map<SocketLevel, String> descriptions = generateTable();
  public static final java.util.Map<SocketLevel, String> generateTable() {
    java.util.Map<SocketLevel, String> map = new java.util.EnumMap<SocketLevel, String>(SocketLevel.class);
  map.put(SOL_SOCKET, "SOL_SOCKET");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
