# Append path for freescale layer to include alsa-state asound.conf
#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"

#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
inherit systemd

SRC_URI += "file://asound.state1"
FILES_${PN} += " /var/lib/alsa/"

do_install_append() {
            #mac
            install -d ${D}/var/lib/alsa/
            cat ${WORKDIR}/asound.state1 > ${WORKDIR}/asound.state
	    install -m 0777 ${WORKDIR}/asound.state ${D}/var/lib/alsa/
}

