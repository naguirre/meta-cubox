DESCRIPTION = "Enna OS - test image"

require systemd-image.bb

IMAGE_INSTALL += " kernel-modules "
IMAGE_INSTALL += " ${XSERVER} "
IMAGE_INSTALL += " freerdp "

export IMAGE_BASENAME = "test-image"