// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-08 09:15:05 +0200
package jnr.constants.platform.fake;
public enum Locale implements jnr.constants.Constant {
LC_CTYPE(0),
LC_NUMERIC(1),
LC_TIME(2),
LC_COLLATE(3),
LC_MONETARY(4),
LC_MESSAGES(5),
LC_ALL(6),
LC_PAPER(7),
LC_NAME(8),
LC_ADDRESS(9),
LC_TELEPHONE(10),
LC_MEASUREMENT(11),
LC_IDENTIFICATION(12);
private final long value;
private Locale(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 12L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
