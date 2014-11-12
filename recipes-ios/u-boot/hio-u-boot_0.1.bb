
#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "hio-bass"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRCREV = "087cae4140b6ab4f455098f520fbc2fa70918fc0"
SRC_URI = "git://github.com/huhaijiang1984/habey-test.git;branch=master"

S = "${WORKDIR}"

#INSANE_SKIP_${PN} = "installed-vs-shipped"
#FILES_${PN} += " /home"
FILES_${PN} += " /boot"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
FILES_SOLIBSDEV = ""
INSANE_SKIP_${PN} = "ldflags already-stripped"

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

do_install() {
             echo "------------------------"
	     echo "------------------------"

	    #bass
	    #install -d ${D}/home
            #install -m 0644 ${WORKDIR}/libbass.so ${D}/home



}

do_install_append() {

		 install -d ${D}/boot
		 install -m 0777 ${WORKDIR}/git/README.md ${D}/boot

                 

}
