// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Thu Nov 13 17:05:52 +1000 2008
package com.kenai.constantine.platform.darwin;
public enum SocketOption implements com.kenai.constantine.Constant {
SO_DEBUG(0x1),
SO_ACCEPTCONN(0x2),
SO_REUSEADDR(0x4),
SO_KEEPALIVE(0x8),
SO_DONTROUTE(0x10),
SO_BROADCAST(0x20),
SO_USELOOPBACK(0x40),
SO_LINGER(0x80),
SO_OOBINLINE(0x100),
SO_REUSEPORT(0x200),
SO_TIMESTAMP(0x400),
// SO_ACCEPTFILTER not defined
SO_DONTTRUNC(0x2000),
SO_WANTMORE(0x4000),
SO_WANTOOBFLAG(0x8000),
SO_SNDBUF(0x1001),
SO_RCVBUF(0x1002),
SO_SNDLOWAT(0x1003),
SO_RCVLOWAT(0x1004),
SO_SNDTIMEO(0x1005),
SO_RCVTIMEO(0x1006),
SO_ERROR(0x1007),
SO_TYPE(0x1008),
SO_NREAD(0x1020),
SO_NKE(0x1021),
SO_NOSIGPIPE(0x1022),
SO_NOADDRERR(0x1023),
SO_NWRITE(0x1024),
SO_REUSESHAREUID(0x1025),
SO_LABEL(0x1010),
SO_PEERLABEL(0x1011);
// SO_ATTACH_FILTER not defined
// SO_BINDTODEVICE not defined
// SO_DETACH_FILTER not defined
// SO_NO_CHECK not defined
// SO_PASSCRED not defined
// SO_PEERCRED not defined
// SO_PEERNAME not defined
// SO_PRIORITY not defined
// SO_SECURITY_AUTHENTICATION not defined
// SO_SECURITY_ENCRYPTION_NETWORK not defined
// SO_SECURITY_ENCRYPTION_TRANSPORT not defined
private final int value;
private SocketOption(int value) { this.value = value; }
public static final int MIN_VALUE = 0x1;
public static final int MAX_VALUE = 0x8000;

public final int value() { return value; }
}
