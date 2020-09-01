// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 19:09:56 +0200
package jnr.constants.platform.linux;
public enum SocketMessage implements jnr.constants.Constant {
MSG_DONTWAIT(0x40L),
MSG_OOB(0x1L),
MSG_PEEK(0x2L),
MSG_DONTROUTE(0x4L),
MSG_EOR(0x80L),
MSG_TRUNC(0x20L),
MSG_CTRUNC(0x8L),
MSG_WAITALL(0x100L),
MSG_PROXY(0x10L),
MSG_FIN(0x200L),
MSG_SYN(0x400L),
MSG_CONFIRM(0x800L),
MSG_RST(0x1000L),
MSG_ERRQUEUE(0x2000L),
MSG_NOSIGNAL(0x4000L),
MSG_MORE(0x8000L),
MSG_FASTOPEN(0x20000000L);
// MSG_EOF not defined
// MSG_FLUSH not defined
// MSG_HOLD not defined
// MSG_SEND not defined
// MSG_HAVEMORE not defined
// MSG_RCVMORE not defined
// MSG_COMPAT not defined
private final long value;
private SocketMessage(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x20000000L;

static final class StringTable {
  public static final java.util.Map<SocketMessage, String> descriptions = generateTable();
  public static final java.util.Map<SocketMessage, String> generateTable() {
    java.util.Map<SocketMessage, String> map = new java.util.EnumMap<SocketMessage, String>(SocketMessage.class);
  map.put(MSG_DONTWAIT, "MSG_DONTWAIT");
  map.put(MSG_OOB, "MSG_OOB");
  map.put(MSG_PEEK, "MSG_PEEK");
  map.put(MSG_DONTROUTE, "MSG_DONTROUTE");
  map.put(MSG_EOR, "MSG_EOR");
  map.put(MSG_TRUNC, "MSG_TRUNC");
  map.put(MSG_CTRUNC, "MSG_CTRUNC");
  map.put(MSG_WAITALL, "MSG_WAITALL");
  map.put(MSG_PROXY, "MSG_PROXY");
  map.put(MSG_FIN, "MSG_FIN");
  map.put(MSG_SYN, "MSG_SYN");
  map.put(MSG_CONFIRM, "MSG_CONFIRM");
  map.put(MSG_RST, "MSG_RST");
  map.put(MSG_ERRQUEUE, "MSG_ERRQUEUE");
  map.put(MSG_NOSIGNAL, "MSG_NOSIGNAL");
  map.put(MSG_MORE, "MSG_MORE");
  map.put(MSG_FASTOPEN, "MSG_FASTOPEN");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
