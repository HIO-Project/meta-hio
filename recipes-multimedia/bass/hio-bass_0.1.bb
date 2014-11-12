
#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "hio-bass"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "file://libbassenc.so 	\
	   file://libbassflac.so	\
           file://libbassmidi.so	\
	   file://libbassmix.so		\
           file://libbassopus.so	\
           file://libbass.so		\
           file://libbasswv.so		\
           file://mp3-free/libbass.so	\
 	   file://haoxin.mp3		\
      	   file://audio8k16S.wav	\
           file://contest_hard"

S = "${WORKDIR}"

#INSANE_SKIP_${PN} = "installed-vs-shipped"
#FILES_${PN} += " /home"
FILES_${PN} += "${base_libdir}/"
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

                 install -d ${D}${base_libdir}
		 install -d ${D}/usr/bin                 

                 cp -rf ${WORKDIR}/*.so ${D}${base_libdir}/
                 cp -rf ${WORKDIR}/mp3-free ${D}${base_libdir}/
                 #install -m 0644 ${WORKDIR}/*.so ${D}${base_libdir}/
		 install -m 0777 ${WORKDIR}/contest_hard ${D}/usr/bin/contest
		 cp -rf ${WORKDIR}/audio8k16S.wav ${D}/usr/bin/
		 cp -rf ${WORKDIR}/haoxin.mp3 ${D}/usr/bin/
}
