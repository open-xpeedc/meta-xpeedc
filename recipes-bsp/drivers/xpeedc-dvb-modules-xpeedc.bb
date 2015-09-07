KV = "3.18.18"
SRCDATE = "20150907"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "e3d198e776610c474f59f543e3ba8213"
SRC_URI[sha256sum] = "598e52b830194bb91e34ae886dbbee6e1f1fd88e0ca27a020ac643e173a1e241"

COMPATIBLE_MACHINE = "xpeedc"
