// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-06-04 17:01:00 +0000
package jnr.constants.platform.dragonflybsd;
public enum Fcntl implements jnr.constants.Constant {
FAPPEND(8L),
FREAD(1L),
FWRITE(2L),
FASYNC(64L),
FFSYNC(128L),
FNONBLOCK(4L),
FNDELAY(4L),
F_DUPFD(0L),
F_GETFD(1L),
F_SETFD(2L),
F_GETFL(3L),
F_SETFL(4L),
F_GETOWN(5L),
F_SETOWN(6L),
F_GETLK(7L),
F_SETLK(8L),
F_SETLKW(9L),
// F_CHKCLEAN not defined
// F_PREALLOCATE not defined
// F_SETSIZE not defined
// F_RDADVISE not defined
// F_RDAHEAD not defined
// F_READBOOTSTRAP not defined
// F_WRITEBOOTSTRAP not defined
// F_NOCACHE not defined
// F_LOG2PHYS not defined
// F_GETPATH not defined
// F_FULLFSYNC not defined
// F_PATHPKG_CHECK not defined
// F_FREEZE_FS not defined
// F_THAW_FS not defined
// F_GLOBAL_NOCACHE not defined
// F_ADDSIGS not defined
// F_MARKDEPENDENCY not defined
F_RDLCK(1L),
F_UNLCK(2L),
F_WRLCK(3L);
// F_ALLOCATECONTIG not defined
// F_ALLOCATEALL not defined
// F_GETPIPE_SZ not defined
// F_SETPIPE_SZ not defined
private final long value;
private Fcntl(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 128L;

static final class StringTable {
  public static final java.util.Map<Fcntl, String> descriptions = generateTable();
  public static final java.util.Map<Fcntl, String> generateTable() {
    java.util.Map<Fcntl, String> map = new java.util.EnumMap<Fcntl, String>(Fcntl.class);
  map.put(FAPPEND, "FAPPEND");
  map.put(FREAD, "FREAD");
  map.put(FWRITE, "FWRITE");
  map.put(FASYNC, "FASYNC");
  map.put(FFSYNC, "FFSYNC");
  map.put(FNONBLOCK, "FNONBLOCK");
  map.put(FNDELAY, "FNDELAY");
  map.put(F_DUPFD, "F_DUPFD");
  map.put(F_GETFD, "F_GETFD");
  map.put(F_SETFD, "F_SETFD");
  map.put(F_GETFL, "F_GETFL");
  map.put(F_SETFL, "F_SETFL");
  map.put(F_GETOWN, "F_GETOWN");
  map.put(F_SETOWN, "F_SETOWN");
  map.put(F_GETLK, "F_GETLK");
  map.put(F_SETLK, "F_SETLK");
  map.put(F_SETLKW, "F_SETLKW");
  map.put(F_RDLCK, "F_RDLCK");
  map.put(F_UNLCK, "F_UNLCK");
  map.put(F_WRLCK, "F_WRLCK");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
