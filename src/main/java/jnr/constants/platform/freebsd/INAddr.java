// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-19 00:15:32 +0000
package jnr.constants.platform.freebsd;
public enum INAddr implements jnr.constants.Constant {
INADDR_ANY(0L),
INADDR_BROADCAST(0xffffffffL),
INADDR_NONE(0xffffffffL),
INADDR_LOOPBACK(0x7f000001L),
INADDR_UNSPEC_GROUP(0xe0000000L),
INADDR_ALLHOSTS_GROUP(0xe0000001L),
INADDR_ALLRTRS_GROUP(0xe0000002L),
INADDR_MAX_LOCAL_GROUP(0xe00000ffL);
private final long value;
private INAddr(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 0xffffffffL;

static final class StringTable {
  public static final java.util.Map<INAddr, String> descriptions = generateTable();
  public static final java.util.Map<INAddr, String> generateTable() {
    java.util.Map<INAddr, String> map = new java.util.EnumMap<INAddr, String>(INAddr.class);
  map.put(INADDR_ANY, "INADDR_ANY");
  map.put(INADDR_BROADCAST, "INADDR_BROADCAST");
  map.put(INADDR_NONE, "INADDR_NONE");
  map.put(INADDR_LOOPBACK, "INADDR_LOOPBACK");
  map.put(INADDR_UNSPEC_GROUP, "INADDR_UNSPEC_GROUP");
  map.put(INADDR_ALLHOSTS_GROUP, "INADDR_ALLHOSTS_GROUP");
  map.put(INADDR_ALLRTRS_GROUP, "INADDR_ALLRTRS_GROUP");
  map.put(INADDR_MAX_LOCAL_GROUP, "INADDR_MAX_LOCAL_GROUP");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
