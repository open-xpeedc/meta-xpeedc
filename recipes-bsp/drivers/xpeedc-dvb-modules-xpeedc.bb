KV = "4.1.21"
SRCDATE = "20160427"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "5784bdd28d814923d5fdfc6215772954"
SRC_URI[sha256sum] = "4871adcfc28698210a6bc187717c263f375408bcee9eeca80c716d771fd63b0b"

COMPATIBLE_MACHINE = "xpeedc"
