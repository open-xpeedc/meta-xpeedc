KV = "4.1.21"
SRCDATE = "20160426"
GCC = "4.9.1"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "dbb5960c1b21fdc504c9484709e3f902"
SRC_URI[sha256sum] = "d85daa3876ec0b79b895d323f69a4e7935f57e0e6a44cd346047e0b880ecfd02"

COMPATIBLE_MACHINE = "xpeedc"
