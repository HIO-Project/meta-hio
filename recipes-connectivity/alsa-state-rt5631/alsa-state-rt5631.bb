CRIPTION = "Simple helloworld application"
SECTION = "hio-wifi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

#DEPENDS += " alsa-state "
RDEPENDS_${PN} = " alsa-state "
SRC_URI = "file://asound.state"

S = "${WORKDIR}"

INSANE_SKIP_${PN} = "installed-vs-shipped"
FILES_${PN} += " /vat/lib/alsa"

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

do_install() {

	    #alsa
            install -d ${D}/${localstatedir}/lib/alsa
	    install -m 644 ${WORKDIR}/asound.state  ${D}/${localstatedir}/lib/alsa/asound.state
}
