// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-19 00:15:35 +0000
package jnr.constants.platform.freebsd;
public enum Sock implements jnr.constants.Constant {
SOCK_STREAM(1L),
SOCK_DGRAM(2L),
SOCK_RAW(3L),
SOCK_RDM(4L),
SOCK_SEQPACKET(5L),
SOCK_MAXADDRLEN(255L);
private final long value;
private Sock(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 255L;

static final class StringTable {
  public static final java.util.Map<Sock, String> descriptions = generateTable();
  public static final java.util.Map<Sock, String> generateTable() {
    java.util.Map<Sock, String> map = new java.util.EnumMap<Sock, String>(Sock.class);
  map.put(SOCK_STREAM, "SOCK_STREAM");
  map.put(SOCK_DGRAM, "SOCK_DGRAM");
  map.put(SOCK_RAW, "SOCK_RAW");
  map.put(SOCK_RDM, "SOCK_RDM");
  map.put(SOCK_SEQPACKET, "SOCK_SEQPACKET");
  map.put(SOCK_MAXADDRLEN, "SOCK_MAXADDRLEN");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
