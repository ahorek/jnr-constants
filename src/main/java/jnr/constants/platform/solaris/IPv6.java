// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-19 01:20:55 +0200
package jnr.constants.platform.solaris;
public enum IPv6 implements jnr.constants.Constant {
IPV6_JOIN_GROUP(9L),
IPV6_LEAVE_GROUP(10L),
IPV6_MULTICAST_HOPS(7L),
IPV6_MULTICAST_IF(6L),
IPV6_MULTICAST_LOOP(8L),
IPV6_UNICAST_HOPS(5L),
IPV6_V6ONLY(39L),
IPV6_CHECKSUM(24L),
IPV6_DONTFRAG(33L),
IPV6_DSTOPTS(15L),
IPV6_HOPLIMIT(12L),
IPV6_HOPOPTS(14L),
IPV6_NEXTHOP(13L),
IPV6_PATHMTU(37L),
IPV6_PKTINFO(11L),
IPV6_RECVDSTOPTS(40L),
IPV6_RECVHOPLIMIT(19L),
IPV6_RECVHOPOPTS(20L),
IPV6_RECVPKTINFO(18L),
IPV6_RECVRTHDR(22L),
IPV6_RECVTCLASS(25L),
IPV6_RTHDR(16L),
IPV6_RTHDRDSTOPTS(17L),
IPV6_RTHDR_TYPE_0(0L),
IPV6_RECVPATHMTU(36L),
IPV6_TCLASS(38L),
IPV6_USE_MIN_MTU(32L);
private final long value;
private IPv6(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 40L;

static final class StringTable {
  public static final java.util.Map<IPv6, String> descriptions = generateTable();
  public static final java.util.Map<IPv6, String> generateTable() {
    java.util.Map<IPv6, String> map = new java.util.EnumMap<IPv6, String>(IPv6.class);
  map.put(IPV6_JOIN_GROUP, "IPV6_JOIN_GROUP");
  map.put(IPV6_LEAVE_GROUP, "IPV6_LEAVE_GROUP");
  map.put(IPV6_MULTICAST_HOPS, "IPV6_MULTICAST_HOPS");
  map.put(IPV6_MULTICAST_IF, "IPV6_MULTICAST_IF");
  map.put(IPV6_MULTICAST_LOOP, "IPV6_MULTICAST_LOOP");
  map.put(IPV6_UNICAST_HOPS, "IPV6_UNICAST_HOPS");
  map.put(IPV6_V6ONLY, "IPV6_V6ONLY");
  map.put(IPV6_CHECKSUM, "IPV6_CHECKSUM");
  map.put(IPV6_DONTFRAG, "IPV6_DONTFRAG");
  map.put(IPV6_DSTOPTS, "IPV6_DSTOPTS");
  map.put(IPV6_HOPLIMIT, "IPV6_HOPLIMIT");
  map.put(IPV6_HOPOPTS, "IPV6_HOPOPTS");
  map.put(IPV6_NEXTHOP, "IPV6_NEXTHOP");
  map.put(IPV6_PATHMTU, "IPV6_PATHMTU");
  map.put(IPV6_PKTINFO, "IPV6_PKTINFO");
  map.put(IPV6_RECVDSTOPTS, "IPV6_RECVDSTOPTS");
  map.put(IPV6_RECVHOPLIMIT, "IPV6_RECVHOPLIMIT");
  map.put(IPV6_RECVHOPOPTS, "IPV6_RECVHOPOPTS");
  map.put(IPV6_RECVPKTINFO, "IPV6_RECVPKTINFO");
  map.put(IPV6_RECVRTHDR, "IPV6_RECVRTHDR");
  map.put(IPV6_RECVTCLASS, "IPV6_RECVTCLASS");
  map.put(IPV6_RTHDR, "IPV6_RTHDR");
  map.put(IPV6_RTHDRDSTOPTS, "IPV6_RTHDRDSTOPTS");
  map.put(IPV6_RTHDR_TYPE_0, "IPV6_RTHDR_TYPE_0");
  map.put(IPV6_RECVPATHMTU, "IPV6_RECVPATHMTU");
  map.put(IPV6_TCLASS, "IPV6_TCLASS");
  map.put(IPV6_USE_MIN_MTU, "IPV6_USE_MIN_MTU");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
