DESCRIPTION = "Systemd Watchdog Test"
HOMEPAGE = "https://github.com/cbrake/systemd-watchdog-test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=544799d0b492f119fa04641d1b8868ed"

inherit cmake

SRCREV = "7fa776039ef1e74ee13954889ec84ba2d47858d6"
PV = "0.1+gitr${SRCPV}"
PR = "r4"

SRC_URI = "git://github.com/cbrake/systemd-watchdog-test;protocol=git;branch=master"

S = "${WORKDIR}/git"

FILES_${PN} += "/lib/systemd/system/"



