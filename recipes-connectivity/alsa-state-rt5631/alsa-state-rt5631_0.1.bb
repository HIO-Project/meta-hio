#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "alsa-state-rt5631"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI =  "file://asound.state"

S = "${WORKDIR}"

INSANE_SKIP_${PN} = "installed-vs-shipped"
FILES_${PN} += " /var/lib/alsa/"

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

do_install() {
	    #alsa-state-rt5631

	    install -d ${D}/var/lib/alsa/
            install -m 0644 ${WORKDIR}/asound.state  ${D}/var/lib/alsa/

}
