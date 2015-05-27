require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

COMPATIBLE_MACHINE = "(hio-imx6q-board|hio-imx6dl-board)"

DEPENDS_mxs += "elftosb-native openssl-native"
PROVIDES += "u-boot"

PV = "hio"

SRC_URI = "git://github.com/HIO-Project/u-boot-imx6-hio.git;branch=2014.01"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

S = "${WORKDIR}/git"

#EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
#                 HOSTLDFLAGS="-L${STAGING_BASE_LIBDIR_NATIVE} -L${STAGING_LIBDIR_NATIVE}" \
#                 HOSTSTRIP=true'

#new add ben
#EXTRA_OEMAKE += 'HOSTCC="${BUILD_CC} ${BUILD_CPPFLAGS}" \
#                 HOSTLDFLAGS="${BUILD_LDFLAGS}" \
#                 HOSTSTRIP=true'

EXTRA_OEMAKE += 'HOSTSTRIP=true'
do_compile_prepend() {
        if [ "${@base_contains('DISTRO_FEATURES', 'ld-is-gold', 'ld-is-gold', '', d)}" = "ld-is-gold" ] ; then
                sed -i 's/$(CROSS_COMPILE)ld/$(CROSS_COMPILE)ld.bfd/g' config.mk
        fi
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(hio-imx6q-board|hio-imx6dl-board)"
