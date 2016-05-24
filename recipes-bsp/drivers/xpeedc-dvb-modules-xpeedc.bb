KV = "4.1.21"
SRCDATE = "20160524"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "ae62741e35966e1a7c99afeab96fe19a"
SRC_URI[sha256sum] = "ed1da17b5a8be1cc94d285c515d26824844479b30c2912071d2894f8c6f9f126"

COMPATIBLE_MACHINE = "xpeedc"
