// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-05-11 03:41:31 +0000
package jnr.constants.platform.aix;
public enum PosixFadvise implements jnr.constants.Constant {
POSIX_FADV_NORMAL(1L),
POSIX_FADV_SEQUENTIAL(2L),
POSIX_FADV_RANDOM(3L),
POSIX_FADV_NOREUSE(6L),
POSIX_FADV_WILLNEED(4L),
POSIX_FADV_DONTNEED(5L);
private final long value;
private PosixFadvise(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 6L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
