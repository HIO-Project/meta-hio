#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
inherit systemd

SRC_URI += "file://50default"
FILES_${PN} += " /etc/udhcpc.d/"

do_install_append() {
            #mac
            install -d ${D}${sysconfdir}/udhcpc.d
            install -m 0777 ${WORKDIR}/50default ${D}${sysconfdir}/udhcpc.d/50default
}
