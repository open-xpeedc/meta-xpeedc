KV = "4.1.21"
SRCDATE = "20160408"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "c5c976fc9707b45296b2b25644460636"
SRC_URI[sha256sum] = "460b6b8d1e915e5b4cacbd6f0662c24b856193e233a4db5eb4573527c133c46b"

COMPATIBLE_MACHINE = "xpeedc"
