SUMMARY = "Utilities for transponder & dvb-s blindscan"
SECTION = "base"
PRIORITY = "optional"
RDEPENDS_${PN} = "ncurses"

PACKAGE_ARCH = "${MACHINE_ARCH}"

LICENSE = "CLOSED"
require conf/license/license-close.inc

PACKAGES = "xpeedlxpro-blindscan-dvbs-utils xpeedlxpro-blindscan-dvbs-utils-dbg xpeedlxpro-blindscan-dvbc-utils xpeedlxpro-blindscan-dvbc-utils-dbg"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_xpeedlxpro-blindscan-dvbs-utils += "virtual/blindscan-dvbs"
RPROVIDES_xpeedlxpro-blindscan-dvbc-utils += "virtual/blindscan-dvbc"

SRC_URI = "file://tda1002x file://ini_blindscan"

PV = "1.0"
PR = "r1"

S = "${WORKDIR}/"

FILES_xpeedlxpro-blindscan-dvbs-utils = "${bindir}/*_blindscan"
FILES_xpeedlxpro-blindscan-dvbc-utils = "${bindir}/tda1002x"
FILES_xpeedlxpro-blindscan-dvbs-utils-dbg = "${bindir}/.debug/*_blindscan"
FILES_xpeedlxpro-blindscan-dvbc-utils-dbg = "${bindir}/.debug/tda1002x"

do_install() {
    install -d ${D}/${bindir}/
    install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
    install -m 0755 "${S}/ini_blindscan" "${D}/${bindir}/blindscan"
}
