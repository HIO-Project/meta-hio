#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "hio-eth"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

#DEPENDS += "kern-tools-native"
DEPENDS += "busybox"
SRC_URI = "file://simple.script "

#PRINC := "${@int(PRINC) + 1}"
S = "${WORKDIR}"

INSANE_SKIP_${PN} = "installed-vs-shipped"
FILES_${PN} += " /etc/udhcpc.d/"

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

do_install() {
             echo "------------------------"
	     echo "------------------------"

	    #mac
	    #install -d ${D}${sysconfdir}/udhcpc.d
            #install -m 0777 ${WORKDIR}/simple.script ${D}${sysconfdir}/udhcpc.d/50default	    
}
