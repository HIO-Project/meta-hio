DESCRIPTION = "wf111  Kernel Driver Sample"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

#DEPENDS = "virtual/kernel"
PR = "r0"

SRCREV = "${AUTOREV}"
SCMVERSION = "n"
SRC_URI = "git://github.com/HIO-Project/wf111.git;branch=master"
S="${WORKDIR}/git/"

#inherit allarch
PACKAGE_ARCH = "all"
#INSANE_SKIP_${PN} += "installed-vs-shipped"
INHIBIT_PACKAGE_STRIP = "1"

#do_compile() {
#}

do_install() {
  install -d ${D}/lib/modules
  install -d ${D}/lib/firmware/unifi-sdio
  install -d ${D}/usr/sbin

  install -m 0644 ${S}output/lib/firmware/unifi-sdio/* ${D}/lib/firmware/unifi-sdio/
  install -m 777 ${S}output/usr/sbin/* ${D}/usr/sbin/

  cp -rf ${S}output/lib/modules/* ${D}/lib/modules/
}

#PACKAGES = "${PN}"
FILES_${PN} += " \
	${base_libdir}/firmware/unifi-sdio/*	\
	${base_libdir}/modules/*		\
        ${sbindir}/*    \
"

