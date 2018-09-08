// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-08 09:15:05 +0200
package jnr.constants.platform.fake;
public enum ProtocolFamily implements jnr.constants.Constant {
PF_UNSPEC(1),
PF_LOCAL(2),
PF_UNIX(3),
PF_INET(4),
PF_IMPLINK(5),
PF_PUP(6),
PF_CHAOS(7),
PF_NS(8),
PF_ISO(9),
PF_OSI(10),
PF_ECMA(11),
PF_DATAKIT(12),
PF_CCITT(13),
PF_SNA(14),
PF_DECnet(15),
PF_DLI(16),
PF_LAT(17),
PF_HYLINK(18),
PF_APPLETALK(19),
PF_ROUTE(20),
PF_LINK(21),
PF_XTP(22),
PF_COIP(23),
PF_CNT(24),
PF_SIP(25),
PF_IPX(26),
PF_RTIP(27),
PF_PIP(28),
PF_NDRV(29),
PF_ISDN(30),
PF_KEY(31),
PF_INET6(32),
PF_NATM(33),
PF_SYSTEM(34),
PF_NETBIOS(35),
PF_PPP(36),
PF_ATM(37),
PF_NETGRAPH(38),
PF_MAX(39);
private final long value;
private ProtocolFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 39L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
