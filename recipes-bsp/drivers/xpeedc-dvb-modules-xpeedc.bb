KV = "4.1.21"
SRCDATE = "20160601"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "800c66f4e65631fc6e653d31a6d83e06"
SRC_URI[sha256sum] = "eba96687e1c5edb25172632ea1126fb16be035ac7ba7358ef8fdd9a3cb5ab2fa"

COMPATIBLE_MACHINE = "xpeedc"
