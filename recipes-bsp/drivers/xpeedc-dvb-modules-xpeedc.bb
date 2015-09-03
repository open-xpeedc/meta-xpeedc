KV = "3.18.18"
SRCDATE = "20150826"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "e61c62d0625540f41732edb3ed160b01"
SRC_URI[sha256sum] = "c650388dc333b3153334f2ef62e17ca3809c516d11669b9e51179c869715f569"

COMPATIBLE_MACHINE = "xpeedc"
