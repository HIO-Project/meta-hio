require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

COMPATIBLE_MACHINE = "(mx6)"
DEPENDS_mxs += "elftosb-native openssl-native"
PROVIDES += "u-boot"

PV = "nano"

SRCREV = "22e787c53454ff4cdd41125d5a68b4066f187042"
SRC_URI = "git://github.com/HIO-Project/u-boot-fslc-patches-2014.07.git;branch=master"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="-L${STAGING_BASE_LIBDIR_NATIVE} -L${STAGING_LIBDIR_NATIVE}" \
                 HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"
