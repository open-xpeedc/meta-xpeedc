KV = "3.18.24"
SRCDATE = "20151109"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "ca92a1a87ff6d3b4a26c96f11773afb4"
SRC_URI[sha256sum] = "c749eee28d535612ab64f144faf3c367988026d59a640f01b34291b978267e7d"

COMPATIBLE_MACHINE = "xpeedc"
