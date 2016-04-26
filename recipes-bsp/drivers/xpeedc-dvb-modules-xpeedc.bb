KV = "4.1.21"
SRCDATE = "20160426"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "f676f3d163b8541b9ce15f89b760cf3d"
SRC_URI[sha256sum] = "148aa420b169e8b7cfd0d13c553597630ca29841e784eb3d34bc9a55257cd479"

COMPATIBLE_MACHINE = "xpeedc"
