KV = "3.18.24"
SRCDATE = "20151202"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "079ea1e4ced993f441113802326f8427"
SRC_URI[sha256sum] = "c79a29535e27f68e0a09572052a1d9e9686b8ade46c63b6b9c2aa1de4a9ab82b"

COMPATIBLE_MACHINE = "xpeedc"
