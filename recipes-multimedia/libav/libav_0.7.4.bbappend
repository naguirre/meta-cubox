FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC = "1"

EXTRA_OECONF_append_cubox = "\
        --extra-cflags=-mfpu=vfpv3-d16\
        --disable-neon \
"
