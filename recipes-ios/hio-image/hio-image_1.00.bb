
#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "hio-image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

#DEPENDS = "hio-image-minimal hio-image-fb"
DEPENDS = "core-image-minimal"

#SRCREV = "087cae4140b6ab4f455098f520fbc2fa70918fc0"
SRCREV = "ca29344414e668e22c8324b2ff92df48b8a174af"
#SRC_URI = "git://github.com/huhaijiang1984/habey-test.git;branch=master"
SRC_URI = "git://github.com/HIO-Project/hio-image.git;branch=R1.00"

S = "${WORKDIR}"

inherit deploy

#INSANE_SKIP_${PN} = "installed-vs-shipped"
#FILES_${PN} += " /home"
FILES_${PN} += " /boot"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
FILES_SOLIBSDEV = ""
INSANE_SKIP_${PN} = "ldflags already-stripped"

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

#do_install() {
#             echo "------------------------"
#	     echo "------------------------"
#
#	    #bass
#	    #install -d ${D}/home
#            #install -m 0644 ${WORKDIR}/libbass.so ${D}/home
#
#
#
#:wq
#}

#do_install_append() {
#
#		 install -d ${D}/boot
#		 install -m 0777 ${WORKDIR}/git/README.md ${D}/boot
#
#                
#
#}
ALLOW_EMPTY_${PN} = "1"
do_deploy() {
		cp ${WORKDIR}/git/* ${DEPLOYDIR}/${PN}-${PV}
}

addtask deploy before do_package after do_install
do_deploy[dirs] += "${DEPLOYDIR}/${PN}-${PV}"

