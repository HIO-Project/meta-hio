#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "hio-version"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

#DEPENDS = "hio-image-minimal hio-image-fb"
DEPENDS = "core-image-minimal"
SRC_URI = "file://version "

S = "${WORKDIR}"

INSANE_SKIP_${PN} = "installed-vs-shipped"
FILES_${PN} += " /"

#do_compile() {
#	     #${CC} helloworld.c -o helloworld
#}

do_install() {
             echo "------------------------"
	     echo "------------------------"

	    #version
            #echo hio-board-dl-v1.00 > ${WORKDIR}/version
	    #date >> ${WORKDIR}/version
            #install -m 0644 ${WORKDIR}/version ${D}/	    
	    date_version_1=hio-board-dl-
	    date_version_2=$(date "+%Y%m%d%H%M%S")
	    date_version_3=-R1.00

	    echo $date_version_1$date_version_2$date_version_3 > ${WORKDIR}/version
	    install -m 0644 ${WORKDIR}/version ${D}/
}

#do_deploy () {
#            #test
#            install -d ${DEPLOYDIR}
#            #install ${WORKDIR}/version  ${DEPLOYDIR}/
#}

#do_deploy_append () {
# deploy scripts for sd card
#    ls ${WORKDIR}
#}
#do_deploy[dirs] = "${S}"
#addtask deploy before do_package after do_install
