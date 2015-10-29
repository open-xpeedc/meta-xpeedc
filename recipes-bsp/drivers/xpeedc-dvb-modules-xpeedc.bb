KV = "3.18.18"
SRCDATE = "20151021"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "f25aa72e8dd86a24529a76f6b6ca7c43"
SRC_URI[sha256sum] = "1cea3ab924ff343d9b14b227542cba0e59b0c31836f40dfeea94af3f218b0b05"

COMPATIBLE_MACHINE = "xpeedc"
