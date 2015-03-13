#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
inherit systemd

SRC_URI += "file://bluez-simple-agent"
#FILES_${PN} += " /etc/udhcpc.d/"

do_install_append() {
            install -m 0777 ${WORKDIR}/bluez-simple-agent  ${D}/usr/bin/

}
