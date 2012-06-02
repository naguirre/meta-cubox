FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC = "1"

CFLAGS_append = "  -mfloat-abi=hard "
