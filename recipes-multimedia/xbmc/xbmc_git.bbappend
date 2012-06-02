
SRCREV = "0355175cc33314c792fcce935b7de444aa17afaa"

SRC_URI = "git://github.com/huceke/xbmc.git;protocol=git;branch=marvell-dove"

EXTRA_OECONF = " \
             --prefix=/usr \
             --disable-vdpau \
             --disable-vaapi \
             --disable-crystalhd \
             --disable-vdadecoder \
             --disable-projectm \
             --enable-gles \
             --disable-pulse \
             --disable-projectm \
             --enable-dbus \
             --disable-optimizations \
             --enable-debug \
             --with-platform=marvell-dove \
"