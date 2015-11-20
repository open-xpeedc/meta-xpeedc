KV = "3.18.24"
SRCDATE = "20151120"

require xpeedc-dvb-modules.inc

SRC_URI = "http://xpeedlxclass.eu/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "edac7c4bc58727454497b5884a883f68"
SRC_URI[sha256sum] = "5f916b933dcf04864af909ec99df2dfc4ee1135f4d36c354733c06e5b6678b64"

COMPATIBLE_MACHINE = "xpeedc"
