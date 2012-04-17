# Small image that launches the Enlightenment desktop without a display manager

require systemd-image.bb

XSERVER ?= "xserver-xorg \
            xf86-video-fbdev \
            xf86-input-evdev \
           "

IMAGE_INSTALL += " \
    e-wm \
    xserver-nodm-init-systemd \
    xserver-common \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    ${XSERVER} \
"

export IMAGE_BASENAME = "efl-nodm-image"
