
# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Nano boards"

SRC_URI = "git://github.com/HIO-Project/linux-imx6-nano-imx_3.10.17_1.0.1_ga.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.0_ga+yocto"
SRCBRANCH = "master"
SRCREV = "72eb5bf1ab6a5aeaad6ce88d547181773985b612"
DEPENDS += "lzop-native "
COMPATIBLE_MACHINE = "(mx6)"
COMPATIBLE_MACHINE = "(hio-nano-q)"
