// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 01:10:23 +0200
package jnr.constants.platform.windows;
public enum InterfaceInfo implements jnr.constants.Constant {
IFF_BROADCAST(2L),
// IFF_802_1Q_VLAN not defined
// IFF_ALLMULTI not defined
// IFF_ALTPHYS not defined
// IFF_AUTOMEDIA not defined
// IFF_BONDING not defined
// IFF_BRIDGE_PORT not defined
// IFF_CANTCONFIG not defined
// IFF_DEBUG not defined
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
// IFF_LINK0 not defined
// IFF_LINK1 not defined
// IFF_LINK2 not defined
// IFF_LIVE_ADDR_CHANGE not defined
IFF_LOOPBACK(4L),
// IFF_LOWER_UP not defined
// IFF_MACVLAN_PORT not defined
// IFF_MASTER not defined
// IFF_MASTER_8023AD not defined
// IFF_MASTER_ALB not defined
// IFF_MASTER_ARPMON not defined
// IFF_MONITOR not defined
IFF_MULTICAST(16L),
// IFF_NOARP not defined
// IFF_NOTRAILERS not defined
// IFF_OACTIVE not defined
// IFF_OVS_DATAPATH not defined
// IFF_POINTOPOINT not defined
// IFF_PORTSEL not defined
// IFF_PPROMISC not defined
// IFF_PROMISC not defined
// IFF_RENAMING not defined
// IFF_ROUTE not defined
// IFF_RUNNING not defined
// IFF_SIMPLEX not defined
// IFF_SLAVE not defined
// IFF_SLAVE_INACTIVE not defined
// IFF_SLAVE_NEEDARP not defined
// IFF_SMART not defined
// IFF_STATICARP not defined
// IFF_SUPP_NOFCS not defined
// IFF_TEAM_PORT not defined
// IFF_TX_SKB_SHARING not defined
// IFF_UNICAST_FLT not defined
IFF_UP(1L);
// IFF_WAN_HDLC not defined
// IFF_XMIT_DST_RELEASE not defined
// IFF_VOLATILE not defined
// IFF_CANTCHANGE not defined
private final long value;
private InterfaceInfo(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 16L;

static final class StringTable {
  public static final java.util.Map<InterfaceInfo, String> descriptions = generateTable();
  public static final java.util.Map<InterfaceInfo, String> generateTable() {
    java.util.Map<InterfaceInfo, String> map = new java.util.EnumMap<InterfaceInfo, String>(InterfaceInfo.class);
  map.put(IFF_BROADCAST, "IFF_BROADCAST");
  map.put(IFF_LOOPBACK, "IFF_LOOPBACK");
  map.put(IFF_MULTICAST, "IFF_MULTICAST");
  map.put(IFF_UP, "IFF_UP");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}