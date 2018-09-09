// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-08 09:15:06 +0200
package jnr.constants.platform.fake;
public enum RLIMIT implements jnr.constants.Constant {
RLIMIT_AS(1),
RLIMIT_CORE(2),
RLIMIT_CPU(3),
RLIMIT_DATA(4),
RLIMIT_FSIZE(5),
RLIMIT_LOCKS(6),
RLIMIT_MEMLOCK(7),
RLIMIT_MSGQUEUE(8),
RLIMIT_NICE(9),
RLIMIT_NLIMITS(10),
RLIMIT_NOFILE(11),
RLIMIT_NPROC(12),
RLIMIT_OFILE(13),
RLIMIT_RSS(14),
RLIMIT_RTPRIO(15),
RLIMIT_RTTIME(16),
RLIMIT_SIGPENDING(17),
RLIMIT_STACK(18);
private final long value;
private RLIMIT(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 18L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
