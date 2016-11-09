#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "hio-rc-loacl"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

DEPENDS += "fsl-rc-local"
SRC_URI = "file://rc.local.init"

#PRINC := "${@int(PRINC) + 1}"
S = "${WORKDIR}"

INSANE_SKIP_${PN} = "installed-vs-shipped"
FILES_${PN} += " /etc/init.d/"

inherit update-rc.d

INITSCRIPT_NAME = "rc.local"
INITSCRIPT_PARAMS = "start 99 2 3 4 5 ."

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

do_install() {
             echo "------------------------"
	     echo "------------------------"

	    #rc.loacl
  	    install -d ${D}/${sysconfdir}/init.d
            install -m 755 ${S}/rc.local.init ${D}/${sysconfdir}/init.d/rc.local
}
