// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-18 23:50:29 +0200
package jnr.constants.platform.fake;
public enum TCPInfo implements jnr.constants.Constant {
TCPI_OPT_TIMESTAMPS(1),
TCPI_OPT_SACK(2),
TCPI_OPT_WSCALE(3),
TCPI_OPT_ECN(4),
TCPI_OPT_ECN_SEEN(5),
TCPI_OPT_SYN_DATA(6),
TCPI_OPT_TOE(7);
private final long value;
private TCPInfo(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 7L;
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
