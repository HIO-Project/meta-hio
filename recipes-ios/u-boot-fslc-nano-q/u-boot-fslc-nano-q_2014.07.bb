require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

COMPATIBLE_MACHINE = "(hio-nano-q|hio-nano-dl)"

DEPENDS_mxs += "elftosb-native openssl-native"
PROVIDES += "u-boot"

PV = "nano"

#SRCREV = "08ec02b4c5f86c3d7a7578b3b5c35fc7f0a89583"
SRC_URI = "git://github.com/HIO-Project/u-boot-fslc-nano-q.git;branch=master"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="-L${STAGING_BASE_LIBDIR_NATIVE} -L${STAGING_LIBDIR_NATIVE}" \
                 HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"
