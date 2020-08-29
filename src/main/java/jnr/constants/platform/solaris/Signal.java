// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-08-29 20:54:32 +0200
package jnr.constants.platform.solaris;
public enum Signal implements jnr.constants.Constant {
SIGHUP(1L),
SIGINT(2L),
SIGQUIT(3L),
SIGILL(4L),
SIGTRAP(5L),
SIGABRT(6L),
SIGIOT(6L),
SIGBUS(10L),
SIGFPE(8L),
SIGKILL(9L),
SIGUSR1(16L),
SIGSEGV(11L),
SIGUSR2(17L),
SIGPIPE(13L),
SIGALRM(14L),
SIGTERM(15L),
// SIGSTKFLT not defined
SIGCLD(18L),
SIGCHLD(18L),
SIGCONT(25L),
SIGSTOP(23L),
SIGTSTP(24L),
SIGTTIN(26L),
SIGTTOU(27L),
SIGURG(21L),
SIGXCPU(30L),
SIGXFSZ(31L),
SIGVTALRM(28L),
SIGPROF(29L),
SIGWINCH(20L),
SIGPOLL(22L),
SIGIO(22L),
SIGPWR(19L),
SIGSYS(12L),
// SIGUNUSED not defined
SIGRTMIN(41L),
SIGRTMAX(72L),
NSIG(73L);
private final long value;
private Signal(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 73L;

static final class StringTable {
  public static final java.util.Map<Signal, String> descriptions = generateTable();
  public static final java.util.Map<Signal, String> generateTable() {
    java.util.Map<Signal, String> map = new java.util.EnumMap<Signal, String>(Signal.class);
  map.put(SIGHUP, "SIGHUP");
  map.put(SIGINT, "SIGINT");
  map.put(SIGQUIT, "SIGQUIT");
  map.put(SIGILL, "SIGILL");
  map.put(SIGTRAP, "SIGTRAP");
  map.put(SIGABRT, "SIGABRT");
  map.put(SIGIOT, "SIGIOT");
  map.put(SIGBUS, "SIGBUS");
  map.put(SIGFPE, "SIGFPE");
  map.put(SIGKILL, "SIGKILL");
  map.put(SIGUSR1, "SIGUSR1");
  map.put(SIGSEGV, "SIGSEGV");
  map.put(SIGUSR2, "SIGUSR2");
  map.put(SIGPIPE, "SIGPIPE");
  map.put(SIGALRM, "SIGALRM");
  map.put(SIGTERM, "SIGTERM");
  map.put(SIGCLD, "SIGCLD");
  map.put(SIGCHLD, "SIGCHLD");
  map.put(SIGCONT, "SIGCONT");
  map.put(SIGSTOP, "SIGSTOP");
  map.put(SIGTSTP, "SIGTSTP");
  map.put(SIGTTIN, "SIGTTIN");
  map.put(SIGTTOU, "SIGTTOU");
  map.put(SIGURG, "SIGURG");
  map.put(SIGXCPU, "SIGXCPU");
  map.put(SIGXFSZ, "SIGXFSZ");
  map.put(SIGVTALRM, "SIGVTALRM");
  map.put(SIGPROF, "SIGPROF");
  map.put(SIGWINCH, "SIGWINCH");
  map.put(SIGPOLL, "SIGPOLL");
  map.put(SIGIO, "SIGIO");
  map.put(SIGPWR, "SIGPWR");
  map.put(SIGSYS, "SIGSYS");
  map.put(SIGRTMIN, "SIGRTMIN");
  map.put(SIGRTMAX, "SIGRTMAX");
  map.put(NSIG, "NSIG");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
