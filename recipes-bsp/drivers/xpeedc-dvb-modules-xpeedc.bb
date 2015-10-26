KV = "3.18.18"
SRCDATE = "20151021"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "f25aa72e8dd86a24529a76f6b6ca7c43"
SRC_URI[sha256sum] = "b5a4bbbdc3a828a669ff643ca4618501a468cb9828062cfc001009cd558f501e"

COMPATIBLE_MACHINE = "xpeedc"
