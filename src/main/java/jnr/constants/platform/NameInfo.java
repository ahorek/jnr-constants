// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-08 09:14:55 +0200
package jnr.constants.platform;
public enum NameInfo implements jnr.constants.Constant {
NI_MAXHOST,
NI_MAXSERV,
NI_NOFQDN,
NI_NUMERICHOST,
NI_NAMEREQD,
NI_NUMERICSERV,
NI_DGRAM,
NI_WITHSCOPEID,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<NameInfo> resolver = 
ConstantResolver.getResolver(NameInfo.class, 20000, 29999);
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static NameInfo valueOf(long value) { 
    return resolver.valueOf(value);
}
}
