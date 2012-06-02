DESCRIPTION = "libGLES for the VIVANTE included in marvell chip"
LICENSE = "CLOSED"

PR = "1"

COMPATIBLE_MACHINE = "(cubox)"

PROVIDES += "virtual/egl"

SRC_URI = "http://dl.dropbox.com/u/72661517/GC-Driver/gc3184-gcc-4.6-armv7-hard_release.zip"
SRC_URI[md5sum] = "0d1a842ebb9d9bd1c198950bfe5c04f5"
SRC_URI[sha256sum] = "3031224b011467d8401bdaa1f7071a751bf65ab2978a081f043ee9a3660db326"

S = "${WORKDIR}/gc3184-gcc-4.6-armv7-hard_release/sdk"

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}/EGL
    install -d ${D}${includedir}/GLES
    install -d ${D}${includedir}/GLES2
    install -d ${D}${includedir}/HAL
    install -d ${D}${includedir}/KHR
    install -d ${D}${includedir}/VG
    install -m 0644 ${S}/include/EGL/* ${D}${includedir}/EGL
    install -m 0644 ${S}/include/GLES/* ${D}${includedir}/GLES
    install -m 0644 ${S}/include/GLES2/* ${D}${includedir}/GLES2
    install -m 0644 ${S}/include/HAL/* ${D}${includedir}/HAL
    install -m 0644 ${S}/include/KHR/* ${D}${includedir}/KHR
    install -m 0644 ${S}/include/VG/* ${D}${includedir}/VG
    install -m 0755 ${S}/drivers/* ${D}${libdir}
}

FILES-${PN} = "${libdir}/*.so*"
FILES_${PN}-dev = "\
    ${includedir}/EGL/*.h \
    ${includedir}/GLES/*.h \
    ${includedir}/GLES2/*.h \
    ${includedir}/HAL/*.h \
    ${includedir}/KHR/*.h \
    ${includedir}/VG/*.h"

