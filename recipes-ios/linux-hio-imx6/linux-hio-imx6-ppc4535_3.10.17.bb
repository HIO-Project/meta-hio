
# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for hio boards"

SRC_URI = "git://github.com/HIO-Project/linux-imx6-hio.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.0_ga+yocto"
SRCBRANCH = "3.10.17"

#SRCREV = "0ef31c876c083ff97f96ccef90c84019b52771b2"
SRCREV = "${AUTOREV}"
SCMVERSION = "n"

DEPENDS += "lzop-native "
COMPATIBLE_MACHINE = "(mx6)"
COMPATIBLE_MACHINE = "(hio-imx6dl-ppc4535)"
