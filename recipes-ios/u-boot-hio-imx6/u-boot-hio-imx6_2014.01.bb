require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

#DEPENDS_mxs += "elftosb-native openssl-native"
PROVIDES += "u-boot"

#PV = "hio"

SRC_URI = "git://github.com/HIO-Project/u-boot-imx6-hio.git;branch=2014.01"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

S = "${WORKDIR}/git"

EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
                 HOSTLDFLAGS="-L${STAGING_BASE_LIBDIR_NATIVE} -L${STAGING_LIBDIR_NATIVE}" \
                 HOSTSTRIP=true'


PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(hio-imx6q-board|hio-imx6q-ppc4507|hio-imx6dl-board|hio-imx6dl-poe|hio-imx6dl-uart5|hio-imx6dl-ppc4507|hio-imx6dl-ppc4510|hio-imx6dl-ppc4535|hio-imx6dl-novo)"
