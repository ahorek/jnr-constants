// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 18:30:56 +0000
package jnr.constants.platform.dragonflybsd;
public enum RLIM implements jnr.constants.Constant {
RLIM_NLIMITS(0xcL),
RLIM_INFINITY(0x7fffffffffffffffL),
RLIM_SAVED_MAX(0x7fffffffffffffffL),
RLIM_SAVED_CUR(0x7fffffffffffffffL);
private final long value;
private RLIM(long value) { this.value = value; }
public static final long MIN_VALUE = 0xcL;
public static final long MAX_VALUE = 0x7fffffffffffffffL;

static final class StringTable {
  public static final java.util.Map<RLIM, String> descriptions = generateTable();
  public static final java.util.Map<RLIM, String> generateTable() {
    java.util.Map<RLIM, String> map = new java.util.EnumMap<RLIM, String>(RLIM.class);
  map.put(RLIM_NLIMITS, "RLIM_NLIMITS");
  map.put(RLIM_INFINITY, "RLIM_INFINITY");
  map.put(RLIM_SAVED_MAX, "RLIM_SAVED_MAX");
  map.put(RLIM_SAVED_CUR, "RLIM_SAVED_CUR");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
