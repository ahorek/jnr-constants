// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 18:16:23 +0000
package jnr.constants.platform.dragonflybsd;
public enum IPProto implements jnr.constants.Constant {
IPPROTO_IP(0L),
IPPROTO_HOPOPTS(0L),
IPPROTO_ICMP(1L),
IPPROTO_IGMP(2L),
IPPROTO_IPIP(4L),
IPPROTO_TCP(6L),
IPPROTO_EGP(8L),
IPPROTO_PUP(12L),
IPPROTO_UDP(17L),
IPPROTO_IDP(22L),
IPPROTO_TP(29L),
IPPROTO_IPV6(41L),
IPPROTO_ROUTING(43L),
IPPROTO_FRAGMENT(44L),
IPPROTO_RSVP(46L),
IPPROTO_GRE(47L),
IPPROTO_ESP(50L),
IPPROTO_AH(51L),
IPPROTO_ICMPV6(58L),
IPPROTO_NONE(59L),
IPPROTO_DSTOPTS(60L),
IPPROTO_MTP(92L),
IPPROTO_ENCAP(98L),
IPPROTO_PIM(103L),
// IPPROTO_COMP not defined
// IPPROTO_SCTP not defined
IPPROTO_RAW(255L),
IPPROTO_MAX(256L);
private final long value;
private IPProto(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 256L;

static final class StringTable {
  public static final java.util.Map<IPProto, String> descriptions = generateTable();
  public static final java.util.Map<IPProto, String> generateTable() {
    java.util.Map<IPProto, String> map = new java.util.EnumMap<IPProto, String>(IPProto.class);
  map.put(IPPROTO_IP, "IPPROTO_IP");
  map.put(IPPROTO_HOPOPTS, "IPPROTO_HOPOPTS");
  map.put(IPPROTO_ICMP, "IPPROTO_ICMP");
  map.put(IPPROTO_IGMP, "IPPROTO_IGMP");
  map.put(IPPROTO_IPIP, "IPPROTO_IPIP");
  map.put(IPPROTO_TCP, "IPPROTO_TCP");
  map.put(IPPROTO_EGP, "IPPROTO_EGP");
  map.put(IPPROTO_PUP, "IPPROTO_PUP");
  map.put(IPPROTO_UDP, "IPPROTO_UDP");
  map.put(IPPROTO_IDP, "IPPROTO_IDP");
  map.put(IPPROTO_TP, "IPPROTO_TP");
  map.put(IPPROTO_IPV6, "IPPROTO_IPV6");
  map.put(IPPROTO_ROUTING, "IPPROTO_ROUTING");
  map.put(IPPROTO_FRAGMENT, "IPPROTO_FRAGMENT");
  map.put(IPPROTO_RSVP, "IPPROTO_RSVP");
  map.put(IPPROTO_GRE, "IPPROTO_GRE");
  map.put(IPPROTO_ESP, "IPPROTO_ESP");
  map.put(IPPROTO_AH, "IPPROTO_AH");
  map.put(IPPROTO_ICMPV6, "IPPROTO_ICMPV6");
  map.put(IPPROTO_NONE, "IPPROTO_NONE");
  map.put(IPPROTO_DSTOPTS, "IPPROTO_DSTOPTS");
  map.put(IPPROTO_MTP, "IPPROTO_MTP");
  map.put(IPPROTO_ENCAP, "IPPROTO_ENCAP");
  map.put(IPPROTO_PIM, "IPPROTO_PIM");
  map.put(IPPROTO_RAW, "IPPROTO_RAW");
  map.put(IPPROTO_MAX, "IPPROTO_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
