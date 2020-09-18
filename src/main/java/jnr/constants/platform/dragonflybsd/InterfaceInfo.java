// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-18 23:07:54 +0000
package jnr.constants.platform.dragonflybsd;
public enum InterfaceInfo implements jnr.constants.Constant {
IFF_ALLMULTI(512L),
// IFF_802_1Q_VLAN not defined
IFF_ALTPHYS(16384L),
// IFF_AUTOMEDIA not defined
// IFF_BONDING not defined
// IFF_BRIDGE_PORT not defined
IFF_BROADCAST(2L),
// IFF_CANTCONFIG not defined
IFF_DEBUG(4L),
// IFF_DISABLE_NETPOLL not defined
// IFF_DONT_BRIDGE not defined
// IFF_DORMANT not defined
// IFF_DRV_OACTIVE not defined
// IFF_DRV_RUNNING not defined
// IFF_DYING not defined
// IFF_DYNAMIC not defined
// IFF_EBRIDGE not defined
// IFF_ECHO not defined
// IFF_ISATAP not defined
IFF_LINK0(4096L),
IFF_LINK1(8192L),
IFF_LINK2(16384L),
// IFF_LIVE_ADDR_CHANGE not defined
IFF_LOOPBACK(8L),
// IFF_LOWER_UP not defined
// IFF_MACVLAN_PORT not defined
// IFF_MASTER not defined
// IFF_MASTER_8023AD not defined
// IFF_MASTER_ALB not defined
// IFF_MASTER_ARPMON not defined
IFF_MONITOR(262144L),
IFF_MULTICAST(32768L),
IFF_NOARP(128L),
// IFF_NOTRAILERS not defined
IFF_OACTIVE(1024L),
// IFF_OVS_DATAPATH not defined
IFF_POINTOPOINT(16L),
// IFF_PORTSEL not defined
IFF_PPROMISC(131072L),
IFF_PROMISC(256L),
// IFF_RENAMING not defined
// IFF_ROUTE not defined
IFF_RUNNING(64L),
IFF_SIMPLEX(2048L),
// IFF_SLAVE not defined
// IFF_SLAVE_INACTIVE not defined
// IFF_SLAVE_NEEDARP not defined
IFF_SMART(32L),
IFF_STATICARP(524288L),
// IFF_SUPP_NOFCS not defined
// IFF_TEAM_PORT not defined
// IFF_TX_SKB_SHARING not defined
// IFF_UNICAST_FLT not defined
IFF_UP(1L),
// IFF_WAN_HDLC not defined
// IFF_XMIT_DST_RELEASE not defined
// IFF_VOLATILE not defined
IFF_CANTCHANGE(3247730L);
private final long value;
private InterfaceInfo(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 3247730L;

static final class StringTable {
  public static final java.util.Map<InterfaceInfo, String> descriptions = generateTable();
  public static final java.util.Map<InterfaceInfo, String> generateTable() {
    java.util.Map<InterfaceInfo, String> map = new java.util.EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
  map.put(IFF_ALLMULTI, "IFF_ALLMULTI");
  map.put(IFF_ALTPHYS, "IFF_ALTPHYS");
  map.put(IFF_BROADCAST, "IFF_BROADCAST");
  map.put(IFF_DEBUG, "IFF_DEBUG");
  map.put(IFF_LINK0, "IFF_LINK0");
  map.put(IFF_LINK1, "IFF_LINK1");
  map.put(IFF_LINK2, "IFF_LINK2");
  map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
  map.put(IFF_MONITOR, "IFF_MONITOR");
  map.put(IFF_MULTICAST, "IFF_MULTICAST");
  map.put(IFF_NOARP, "IFF_NOARP");
  map.put(IFF_OACTIVE, "IFF_OACTIVE");
  map.put(IFF_POINTOPOINT, "IFF_POINTOPOINT");
  map.put(IFF_PPROMISC, "IFF_PPROMISC");
  map.put(IFF_PROMISC, "IFF_PROMISC");
  map.put(IFF_RUNNING, "IFF_RUNNING");
  map.put(IFF_SIMPLEX, "IFF_SIMPLEX");
  map.put(IFF_SMART, "IFF_SMART");
  map.put(IFF_STATICARP, "IFF_STATICARP");
  map.put(IFF_UP, "IFF_UP");
  map.put(IFF_CANTCHANGE, "IFF_CANTCHANGE");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
