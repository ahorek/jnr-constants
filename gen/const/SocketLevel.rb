require_relative '../../gen/ConstGenerator'
def gen_socketlevel_java(options)
  ConstGenerator.new 'platform.socketlevel', options do |cg|
    cg.include "sys/socket.h"
    cg.include "netinet/ip.h"
    cg.include "netinet/tcp.h"
    cg.include "netinet/udp.h"
    %w[
      SOL_SOCKET
      SOL_IP
      SOL_TCP
      SOL_UDP
      SOL_IPV6
    ].each {|c| cg.const c}
  end
end
