// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-08 08:53:58 +0200
package jnr.constants.platform.windows;
public enum OpenFlags implements jnr.constants.Constant {
O_RDONLY(0L),
O_WRONLY(1L),
O_RDWR(2L),
O_ACCMODE(3L),
// O_NONBLOCK not defined
O_APPEND(8L),
// O_SYNC not defined
// O_SHLOCK not defined
// O_EXLOCK not defined
// O_ASYNC not defined
// O_FSYNC not defined
// O_NOFOLLOW not defined
O_CREAT(256L),
O_TRUNC(512L),
O_EXCL(1024L),
// O_EVTONLY not defined
// O_DIRECTORY not defined
// O_SYMLINK not defined
O_BINARY(32768L);
// O_NOCTTY not defined
// O_TMPFILE not defined
// O_CLOEXEC not defined
private final long value;
private OpenFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 32768L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
