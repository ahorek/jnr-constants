// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 18:30:57 +0000
package jnr.constants.platform.dragonflybsd;
public enum RLIMIT implements jnr.constants.Constant {
RLIMIT_AS(10L),
RLIMIT_CORE(4L),
RLIMIT_CPU(0L),
RLIMIT_DATA(2L),
RLIMIT_FSIZE(1L),
// RLIMIT_LOCKS not defined
RLIMIT_MEMLOCK(6L),
// RLIMIT_MSGQUEUE not defined
// RLIMIT_NICE not defined
// RLIMIT_NLIMITS not defined
RLIMIT_NOFILE(8L),
RLIMIT_NPROC(7L),
// RLIMIT_OFILE not defined
RLIMIT_RSS(5L),
// RLIMIT_RTPRIO not defined
// RLIMIT_RTTIME not defined
// RLIMIT_SIGPENDING not defined
RLIMIT_STACK(3L);
private final long value;
private RLIMIT(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 10L;

static final class StringTable {
  public static final java.util.Map<RLIMIT, String> descriptions = generateTable();
  public static final java.util.Map<RLIMIT, String> generateTable() {
    java.util.Map<RLIMIT, String> map = new java.util.EnumMap<RLIMIT, String>(RLIMIT.class);
  map.put(RLIMIT_AS, "RLIMIT_AS");
  map.put(RLIMIT_CORE, "RLIMIT_CORE");
  map.put(RLIMIT_CPU, "RLIMIT_CPU");
  map.put(RLIMIT_DATA, "RLIMIT_DATA");
  map.put(RLIMIT_FSIZE, "RLIMIT_FSIZE");
  map.put(RLIMIT_MEMLOCK, "RLIMIT_MEMLOCK");
  map.put(RLIMIT_NOFILE, "RLIMIT_NOFILE");
  map.put(RLIMIT_NPROC, "RLIMIT_NPROC");
  map.put(RLIMIT_RSS, "RLIMIT_RSS");
  map.put(RLIMIT_STACK, "RLIMIT_STACK");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
